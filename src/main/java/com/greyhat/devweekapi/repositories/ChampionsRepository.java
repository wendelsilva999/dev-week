package com.greyhat.devweekapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greyhat.devweekapi.domain.Champions;



public interface ChampionsRepository extends JpaRepository<Champions, Long> {

}
