package com.example.springbootjpabuddy;

import java.io.Serializable;

/**
 * A DTO for the {@link SpaceShip} entity
 */
public record SpaceShipDto(Integer id, String description, Integer fuel) implements Serializable {
}