package com.example.springbootjpabuddy.space.captain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpaceCaptain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer experience;
    private Integer noOfCrashes;
    @OneToOne(mappedBy = "captain")
    private SpaceCaptain captain;
}
