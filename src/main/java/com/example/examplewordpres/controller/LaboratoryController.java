package com.example.examplewordpres.controller;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.entity.Laboratory;
import com.example.examplewordpres.repository.LaboratoryRepository;
import com.example.examplewordpres.service.Laboratoryservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/laboratory")
@RequiredArgsConstructor
public class LaboratoryController {

    private final LaboratoryRepository laboratoryRepository;
    private final Laboratoryservice laboratoryservice;


    @PostMapping
    public ResponseEntity save(@RequestBody Laboratory laboratory){
        ApiResponse save = laboratoryservice.save(laboratory);
        return ResponseEntity.status(save.isSuccess()? 201:409).body("Success");
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Integer id){
        Optional<Laboratory> byId = laboratoryRepository.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok().body(byId.get());
        }else {
            return ResponseEntity.ok("Not found data");
        }
    }

    @GetMapping
    public ResponseEntity getAll(){
        List<Laboratory> all = laboratoryRepository.findAll();
        return ResponseEntity.ok().body(all);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        laboratoryRepository.deleteById(id);
        return ResponseEntity.ok().body(id);
    }

}
