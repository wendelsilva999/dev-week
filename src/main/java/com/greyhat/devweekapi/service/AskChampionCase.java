package com.greyhat.devweekapi.service;


import com.greyhat.devweekapi.domain.Champions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AskChampionCase {

    @Autowired
    private ChampionsService service;


    public  String askChampion(Long championId, String question) {

        Champions champion = service.findById(championId);
        String championContext = champion.generateContextByQuestion(question);
        return championContext;
    }
}
