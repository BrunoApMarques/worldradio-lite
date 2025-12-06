package com.brunomarques.worldradio_lite.controller;


import com.brunomarques.worldradio_lite.model.RadioStation;
import com.brunomarques.worldradio_lite.repository.RadioStationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/stations")

public class RadioStationController {

    private final RadioStationRepository repository;

    public RadioStationController(RadioStationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RadioStation> listAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public RadioStation findById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Station not found with id: " + id));
    }

    @GetMapping("/search")
    public List<RadioStation> findByCountry(@RequestParam String country) {
        return repository.findByCountryIgnoreCase(country);
    }


}
