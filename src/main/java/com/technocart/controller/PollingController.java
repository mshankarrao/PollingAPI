package com.technocart.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shankarraomata on 4/25/17.
 */
@RestController
@Component
public class PollingController {

    @RequestMapping("/request")
    public String index() {
        return "UP";
    }

}
