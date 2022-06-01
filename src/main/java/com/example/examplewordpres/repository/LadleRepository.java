package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.Ladle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LadleRepository extends JpaRepository<Ladle,Integer> {
}
