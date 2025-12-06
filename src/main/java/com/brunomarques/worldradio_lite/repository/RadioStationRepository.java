package com.brunomarques.worldradio_lite.repository;

import com.brunomarques.worldradio_lite.model.RadioStation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RadioStationRepository extends JpaRepository<RadioStation, Long> {
    List<RadioStation> findByCountryIgnoreCase(String country);
}
