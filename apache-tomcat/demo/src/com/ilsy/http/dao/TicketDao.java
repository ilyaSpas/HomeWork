package com.ilsy.http.dao;

import com.ilsy.http.entity.Flight;
import com.ilsy.http.entity.Ticket;
import com.ilsy.http.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketDao implements Dao<Long, Ticket> {
    private static final TicketDao INSTANCE = new TicketDao();
    private static final String FIND_ALL_BY_FLIGHT_ID = """
            SELECT *
            FROM ticket
            WHERE flight_id = ?
            """;

    private TicketDao(){

    }

    public static TicketDao getInstance(){
        return INSTANCE;
    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }
    public List<Ticket> findAllByFlightId(Long flightId){
        try (Connection connection = ConnectionManager.get();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_BY_FLIGHT_ID)) {

            preparedStatement.setObject(1, flightId);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Ticket> tickets = new ArrayList<>();

            while (resultSet.next()){
                tickets.add(bildTicket(resultSet));
            }
            
            return tickets;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Ticket bildTicket(ResultSet resultSet) throws SQLException {
        return new Ticket(
                resultSet.getObject("id", Long.class),
                resultSet.getObject("passanger_no", String.class),
                resultSet.getObject("passanger_name", String.class),
                resultSet.getObject("flight_id", Long.class),
                resultSet.getObject("seat_no", String.class),
                resultSet.getObject("coast", Double.class)
        );
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public void update(Ticket entity) {

    }

    @Override
    public Ticket save(Ticket entity) {
        return null;
    }
}
