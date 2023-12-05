package com.ilsy.http.dao;

import com.ilsy.http.entity.Flight;
import com.ilsy.http.entity.FlightStatus;
import com.ilsy.http.util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightDao implements Dao<Long, Flight> {
    private static final FlightDao INSTANCE = new FlightDao();

    private static final String FIND_ALL = """
            SELECT *
            FROM flight
            """;

    private FlightDao() {
    }

    @Override
    public List<Flight> findAll() {
        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL)) {

             ResultSet resultSet = preparedStatement.executeQuery();
             List<Flight> flights = new ArrayList<>();
             while (resultSet.next()){
                 flights.add(bildFlight(resultSet));
             }

            return flights;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private Flight bildFlight(ResultSet resultSet) throws SQLException {
        return new Flight(
            resultSet.getObject("id", Long.class),
            resultSet.getObject("flight_no", String.class),
            resultSet.getObject("departure_date", Timestamp.class).toLocalDateTime(),
            resultSet.getObject("departure_airport_code", String.class),
            resultSet.getObject("arrivaltime", Timestamp.class).toLocalDateTime(),
            resultSet.getObject("arrival_airport_code", String.class),
            resultSet.getObject("aircraft_id", Integer.class),
            FlightStatus.valueOf(resultSet.getObject("status", String.class))
        );
    }

    @Override
    public Optional<Flight> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Flight entity) {

    }

    @Override
    public Flight save(Flight entity) {
        return null;
    }

    public static FlightDao getInstance(){
        return INSTANCE;
    }

}
