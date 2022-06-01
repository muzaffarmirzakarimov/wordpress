package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory,Integer> {
}
