package com.example.springbootjpabuddy.space.captain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpaceCaptainRepositoryTest {

    @Autowired
    SpaceCaptainRepository repository;

    @Test
    void tryCaptains() {
        repository.deleteAll();
        repository.saveAll(
                List.of(
                        SpaceCaptain.builder().
                                name("Mike")
                                .noOfCrashes(3)
                                .experience(25)
                                .build(),
                        SpaceCaptain.builder().
                                name("Susan")
                                .noOfCrashes(0)
                                .experience(5)
                                .build(),
                        SpaceCaptain.builder().
                                name("Line")
                                .noOfCrashes(2)
                                .experience(8)
                                .build()
                )
        );
        Assertions.assertEquals(3, repository.count());
        Assertions.assertTrue(repository.doWeHaveACaptainWithName("Mik"));
        Assertions.assertTrue(repository.doWeHaveACaptainWithName("san"));
        Assertions.assertTrue(repository.doWeHaveACaptainWithName("Line"));
        Assertions.assertFalse(repository.doWeHaveACaptainWithName("Torben"));
        Assertions.assertEquals(3, repository.findByNoOfCrashesLessThanEqual(10).size());


        repository.findByNoOfCrashesLessThanEqual(30).forEach(System.out::println);
    }

}