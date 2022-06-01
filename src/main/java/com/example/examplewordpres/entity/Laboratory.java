package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer total;
    private Integer slag;
    private Integer byskachShlag;
    private Float additivesFeMn;
    private Integer massaFeMn;
    private Float additivesFeSi;
    private Integer massaFeSi;
    private Integer fev;
    private Integer al;
    private Integer feP;
    private Integer siCa;

    private Integer tempBegin;

    private Integer tempEnd;

    private LocalTime timeBegin;

    private LocalTime timeEnd;

    private String remarks;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TestProba> probas;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TestLadle> ladles;






}
