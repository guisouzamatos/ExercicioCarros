package com.api.exe3.repository;

import com.api.exe3.entity.dto.CarroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroDTO, Integer> {
}