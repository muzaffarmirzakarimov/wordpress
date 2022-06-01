package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Proba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false,columnDefinition = "time")
    private LocalTime localTime;

    private float moda1;

    private float moda2;

    private float moda3;

    private float moda4;

    private float moda5;

    private float moda6;
}
