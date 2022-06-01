package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.Nomalum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomalumRepository extends JpaRepository<Nomalum,Integer> {
}
