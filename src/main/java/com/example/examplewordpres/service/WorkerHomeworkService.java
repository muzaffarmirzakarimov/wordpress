package com.example.examplewordpres.service;

import com.example.examplewordpres.dto.ApiResponse;
import com.example.examplewordpres.entity.WorkerHomework;
import com.example.examplewordpres.repository.NomalumRepository;
import com.example.examplewordpres.repository.WorkerHomeworkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkerHomeworkService {

    private final WorkerHomeworkRepository workerRepository;
    private final NomalumRepository nomalumRepository;


    public ApiResponse save(WorkerHomework homework) {
        if (!homework.getBake().equals(workerRepository.findById(homework.getBake()))){
            workerRepository.save(homework);
        }else {
            return new ApiResponse("Bu Pechda malumot mavjud",false);
        }
        return new ApiResponse("save", true);

    }

    public ApiResponse updete(Integer id, WorkerHomework homework) {

        Optional<WorkerHomework> byId = workerRepository.findById(id);
        if (byId.isPresent()) {
            WorkerHomework workerHomework = byId.get();

            return new ApiResponse("update", true);
        } else {
            return new ApiResponse("Not found", false);
        }


    }
}
