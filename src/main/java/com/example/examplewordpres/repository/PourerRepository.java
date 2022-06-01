package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.Pourer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PourerRepository extends JpaRepository<Pourer,Integer> {
}
