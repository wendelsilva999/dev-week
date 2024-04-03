package com.greyhat.devweekapi.service;

import com.greyhat.devweekapi.domain.Champions;
import com.greyhat.devweekapi.repositories.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ChampionsService {

    @Autowired
    private ChampionsRepository championsRepository;

    public List<Champions> findAll() {
        return championsRepository.findAll();
    }


    public Champions findById(Long id) {
        return championsRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Champion not found"));

    }



}
