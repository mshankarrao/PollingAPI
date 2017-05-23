package com.technocart.controller;

import com.technocart.Application;
import com.technocart.domain.Coordinates;
import com.technocart.repository.PollingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shankarraomata on 4/25/17.
 */
@RestController
@Component
public class PollingController {

    @Autowired
    private PollingRepository pollingRepository;

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String getStatus(@RequestParam(value = "id")int id) {
        return "UP "+id;
    }


    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public void saveCoordinates(@RequestBody Coordinates coordinates) {
    pollingRepository.save(coordinates);
    }

}
