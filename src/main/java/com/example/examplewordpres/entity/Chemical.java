package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Chemical {

    @Id
    private String name;
    @Column(nullable = false)
    private String moda1;
    @Column(nullable = false)
    private String moda2;
    @Column(nullable = false)
    private String moda3;
    @Column(nullable = false)
    private String moda4;
    @Column(nullable = false)
    private String moda5;
}
