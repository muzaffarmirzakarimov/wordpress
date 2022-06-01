package com.example.examplewordpres.controller;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.entity.DetailDescription;
import com.example.examplewordpres.entity.Pourer;
import com.example.examplewordpres.repository.DetailDescriptionRepository;
import com.example.examplewordpres.repository.PourerRepository;
import com.example.examplewordpres.service.DetailDescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/description")
@RequiredArgsConstructor
public class DetailDescriptionController {

    private final DetailDescriptionRepository detailDescriptionRepository;
    private final DetailDescriptionService detailDescriptionService;

    @GetMapping
    public ResponseEntity getAll(){
        List<DetailDescription> all = detailDescriptionRepository.findAll();
        return ResponseEntity.ok().body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Integer id){
        Optional<DetailDescription> byId = detailDescriptionRepository.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok().body(byId.get());
        }else {
            return ResponseEntity.ok("Not found data");
        }
    }

    @PostMapping
    public ResponseEntity save(@RequestBody DetailDescription detailDescription){

        ApiResponse save =detailDescriptionService.save(detailDescription);
        return ResponseEntity.status(save.isSuccess()? 201:409).body("Save");
    }



    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer integer){
        detailDescriptionRepository.deleteById(integer);
        return ResponseEntity.ok().body(integer);
    }

}
