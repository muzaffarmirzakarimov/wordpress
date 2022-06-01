package com.example.examplewordpres.service;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.entity.DetailDescription;
import com.example.examplewordpres.repository.DetailDescriptionRepository;
import com.example.examplewordpres.repository.PourerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DetailDescriptionService {

    private final PourerRepository pourerRepository;
    private final DetailDescriptionRepository detailDescriptionRepository;


    public ApiResponse save(DetailDescription detailDescription) {
        DetailDescription save = detailDescriptionRepository.save(detailDescription);
        return new ApiResponse("Save", true);
    }

}
