package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.WorkerHomework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerHomeworkRepository extends JpaRepository<WorkerHomework,Integer> {
}
