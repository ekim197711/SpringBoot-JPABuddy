package com.example.springbootjpabuddy.space.captain;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link SpaceCaptain} entity
 */
@Data
public class SpaceCaptainDto implements Serializable {
    private final String name;
    private final Integer experience;
    private final Integer noOfCrashes;
}