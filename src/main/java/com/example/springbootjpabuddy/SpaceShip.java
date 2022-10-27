package com.example.springbootjpabuddy;

import com.example.springbootjpabuddy.space.captain.SpaceCaptain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpaceShip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String description;
    private Integer fuel;
    @OneToOne
    @JoinColumn(name = "captain_id")
    private SpaceCaptain captain;
}
