package com.example.examplewordpres.entity;

import com.example.examplewordpres.entity.enums.Constant;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Nomalum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private Constant constant;
    private String fill;
    private Integer macca;
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime start, finish, continus;


}
