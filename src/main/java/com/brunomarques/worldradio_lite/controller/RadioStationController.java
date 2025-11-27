package com.brunomarques.worldradio_lite.controller;


import com.brunomarques.worldradio_lite.model.RadioStation;
import com.brunomarques.worldradio_lite.repository.RadioStationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
