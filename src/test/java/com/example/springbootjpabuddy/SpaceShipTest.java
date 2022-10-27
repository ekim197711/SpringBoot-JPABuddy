package com.example.springbootjpabuddy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpaceShipTest {
    @Autowired
    SpaceShipRepository repository;

    @Test
    void tryData(){
        repository.deleteAll();
        repository.save(SpaceShip
                .builder()
                        .fuel(22)
                        .description("Box")
                .build());
    }

}