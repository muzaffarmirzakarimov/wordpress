package com.example.examplewordpres.controller;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.entity.WorkerHomework;
import com.example.examplewordpres.repository.WorkerHomeworkRepository;
import com.example.examplewordpres.service.WorkerHomeworkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workerhomework")
@RequiredArgsConstructor
public class WorkerHomeworkController {

    private final WorkerHomeworkService workerHomeworkService;
    private final WorkerHomeworkRepository workerHomeworkRepository;


    @PostMapping
    public ResponseEntity add(@RequestBody WorkerHomework homework){
        ApiResponse save = workerHomeworkService.save(homework);
        return ResponseEntity.status(save.isSuccess()? 201:409).body("Save");
    }

    @GetMapping
    public ResponseEntity getAll(){
        List<WorkerHomework> all = workerHomeworkRepository.findAll();
        return ResponseEntity.ok().body(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Integer id){

        Optional<WorkerHomework> byId = workerHomeworkRepository.findById(id);
        if (byId.isPresent()) {
            return ResponseEntity.ok().body(byId.get());
        }else {
            return ResponseEntity.ok("Not found data");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){

        workerHomeworkRepository.deleteById(id);
        return ResponseEntity.ok().body(id);
    }

}
