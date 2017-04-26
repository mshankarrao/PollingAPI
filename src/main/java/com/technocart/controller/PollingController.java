package com.technocart.controller;

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

    @RequestMapping(value = "/request/{id}", method = RequestMethod.POST)
    public String saveStatus(@PathVariable(value = "id")int id) {
    System.out.println("Hello"+id);
        return "UP "+id;
    }

}
