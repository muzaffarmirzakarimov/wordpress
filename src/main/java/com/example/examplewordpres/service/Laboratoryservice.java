package com.example.examplewordpres.service;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.entity.Laboratory;
import com.example.examplewordpres.repository.LaboratoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Laboratoryservice {

    private final LaboratoryRepository laboratoryRepository;


    public ApiResponse save(Laboratory laboratory){
        Laboratory save = laboratoryRepository.save(laboratory);
        return new ApiResponse("Save",true);
    }
    public ApiResponse update(Integer id,Laboratory laboratory){

        return new ApiResponse("update",true);
    }
}
