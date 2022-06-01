package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MainPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime localDateTime = LocalDateTime.now();
    private String smelter;
    private String smeltingMaster;
    private String controllerOTK;
    private String sectionManager;

    @OneToOne(cascade = CascadeType.PERSIST)
    private WorkerHomework workerHomework;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Laboratory laboratory;

    @OneToOne(cascade = CascadeType.PERSIST)
    private DetailDescription detailDescription;


}
