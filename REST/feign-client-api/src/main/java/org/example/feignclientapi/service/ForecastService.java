package org.example.feignclientapi.service;

import lombok.RequiredArgsConstructor;
import org.example.feignclientapi.entity.Forecast;
import org.example.feignclientapi.model.Weather;
import org.example.feignclientapi.repository.ForecastRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ForecastService {
    private final ForecastRepository forecastRepository;

    public void save(Weather weather){
        Forecast forecast = Forecast.builder()
                .name(weather.getLocation().getName())
                .country(weather.getLocation().getCountry())
                .lat(weather.getLocation().getLat())
                .lon(weather.getLocation().getLon())
                .localtime_town(weather.getLocation().getLocaltime())
                .text(weather.getCurrent().getCondition().getText())
                .temp_c(Double.valueOf(weather.getCurrent().getTemp_c()))
                .temp_f(Double.valueOf(weather.getCurrent().getTemp_f()))
                .build();
        forecastRepository.save(forecast);
    }
}
