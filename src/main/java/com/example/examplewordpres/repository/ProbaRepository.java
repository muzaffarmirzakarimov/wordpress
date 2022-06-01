package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.Proba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProbaRepository extends JpaRepository<Proba,Integer> {
}
