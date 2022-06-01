package com.example.examplewordpres.repository;

import com.example.examplewordpres.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe,Integer> {
    Employe findByEmployeemail(String email);
}
