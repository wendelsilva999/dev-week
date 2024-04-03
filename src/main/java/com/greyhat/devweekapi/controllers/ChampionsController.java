package com.greyhat.devweekapi.controllers;

import com.greyhat.devweekapi.domain.Champions;
import com.greyhat.devweekapi.service.AskChampionCase;
import com.greyhat.devweekapi.service.ChampionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping(value = "/champions")
public class ChampionsController {

    @Autowired
    private ChampionsService service;

    @Autowired
    private AskChampionCase askChampionCase;



    @GetMapping
    public ResponseEntity<List<Champions>> findAll() {
        List<Champions> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Champions> findById(@PathVariable Long id) {
        Champions obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


    //TODO congelar o codigo e fazer de outra forma, esse metodo post abaixo


    @PostMapping(value = "/{championId}/ask")
    public ResponseEntity<AskChampionResponse> askChampionResponse(@PathVariable Long championId, @RequestBody AskChampionRequest request) {
        String answer = askChampionCase.askChampion(championId, request.question());
        AskChampionResponse response = new AskChampionResponse(answer);
        return ResponseEntity.ok(response);
    }

    public record AskChampionRequest(String question) {}
    public record AskChampionResponse(String question) {}


}
