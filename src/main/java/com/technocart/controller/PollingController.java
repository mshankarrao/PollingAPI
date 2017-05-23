package com.technocart.controller;

import com.technocart.Application;
import com.technocart.domain.Coordinates;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shankarraomata on 4/25/17.
 */
@RestController
@Component
public class PollingController {

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String getStatus(@RequestParam(value = "id")int id) {
        return "UP "+id;
    }


    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String saveCoordinates(@RequestBody Coordinates coordinates) {
    return coordinates.getVehicleCode()+" Latitude " +coordinates.getLatitude() +" Longitude " +coordinates.getLongitude() ;
    }

}
