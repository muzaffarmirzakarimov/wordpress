package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.DetailDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailDescriptionRepository extends JpaRepository<DetailDescription,Integer> {
}
