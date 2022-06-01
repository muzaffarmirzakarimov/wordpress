package com.example.examplewordpres.controller;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.dto.MainPageDTO;
import com.example.examplewordpres.entity.MainPage;
import com.example.examplewordpres.repository.*;
import com.example.examplewordpres.service.MainPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.interfaces.RSAPrivateCrtKey;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mainpage")
@RequiredArgsConstructor
public class MaiPageController {


    private final DetailDescriptionRepository detailDescriptionRepository;
    private final LaboratoryRepository laboratoryRepository;
    private final ChemicalRepository chemicalRepository;
    private final WorkerHomeworkRepository workerHomeworkRepository;
    private final MainPageRepository mainPageRepository;
    private final MainPageService mainPageService;

    @PostMapping
    public ResponseEntity save(@RequestBody MainPageDTO mainPageDTO){
        ApiResponse save = mainPageService.save(mainPageDTO);
        return ResponseEntity.status(save.isSuccess()? 201:409).body("success");
    }

    @GetMapping
    public ResponseEntity getAll(){
        List<MainPage> all = mainPageRepository.findAll();
        return ResponseEntity.ok().body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Integer id){
        Optional<MainPage> byId = mainPageRepository.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok().body(byId.get());
        }else {
            return ResponseEntity.ok("Not found data");
        }
    }




}
