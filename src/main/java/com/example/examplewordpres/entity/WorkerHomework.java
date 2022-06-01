package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class WorkerHomework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer bake;
    @Column(nullable = false)
    private Integer fuse;
//    @Column(nullable = false)
    private LocalDateTime localDateTime=LocalDateTime.now();
    @Column(nullable = false)
    private String smelter;

    @Column(nullable = false)
    private float moda1;
    @Column(nullable = false)
    private float moda2;
    @Column(nullable = false)
    private float moda3;
    @Column(nullable = false)
    private float moda4;
    @Column(nullable = false)
    private float moda5;


    private String chemicalName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TestWork> testList;



//    @JoinTable(name = "worker_homework_nomalum",
//            joinColumns = {@JoinColumn(name = "workerhomwork_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "nomalum_id", referencedColumnName = "id")})
//    @MapKey(name = "constant")
//    private Map<String,Nomalum> nomalums;




}
