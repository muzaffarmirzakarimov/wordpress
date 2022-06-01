package com.example.examplewordpres.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestLadleDTO {

    private String name;
    private Integer ladleId;
}
