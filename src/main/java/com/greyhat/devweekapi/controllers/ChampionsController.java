package com.greyhat.devweekapi.controllers;

import com.greyhat.devweekapi.domain.Champions;
import com.greyhat.devweekapi.service.ChampionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
@RequestMapping(value = "/champions")
public class ChampionsController {

    @Autowired
    private ChampionsService service;

    @GetMapping
    public ResponseEntity<List<Champions>> findAll() {
        List<Champions> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
