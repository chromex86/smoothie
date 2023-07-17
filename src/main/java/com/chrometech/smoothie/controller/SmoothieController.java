package com.chrometech.smoothie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrometech.smoothie.dto.SmoothieDto;
import com.chrometech.smoothie.service.SmoothieService;

@RestController
@RequestMapping("smoothies")
public class SmoothieController {

    @Autowired
    private SmoothieService service;

    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SmoothieDto> getSmoothies() {
        return service.getSmoothies();
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addSmoothie(@RequestBody SmoothieDto dto) {
        service.addSmoothie(dto);
    }
}
