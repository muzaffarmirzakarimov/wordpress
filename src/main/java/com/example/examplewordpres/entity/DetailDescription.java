package com.example.examplewordpres.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DetailDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String caster1;
    private String caster2;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pourer> list;

}
