package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Pourer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nameCastings;
    private String kolform;
    private Integer balls;
    private String weightPcs;
    private Integer generalMassa;
    private Integer temperaFills;
    private String note;
}
