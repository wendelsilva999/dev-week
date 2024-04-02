package com.greyhat.devweekapi.service;

import com.greyhat.devweekapi.domain.Champions;
import com.greyhat.devweekapi.repositories.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionsService {
    @Autowired
    private ChampionsRepository championsRepository;

    public List<Champions> findAll() {
        return championsRepository.findAll();
    }
}
