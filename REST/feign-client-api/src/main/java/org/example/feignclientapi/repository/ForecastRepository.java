package org.example.feignclientapi.repository;

import org.example.feignclientapi.entity.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForecastRepository extends JpaRepository<Forecast, Long> {
}
