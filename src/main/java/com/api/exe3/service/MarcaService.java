package com.api.exe3.service;

import com.api.exe3.entity.dto.MarcaDTO;
import com.api.exe3.repository.MarcaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MarcaService {

    final MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<MarcaDTO> getAll() {
        return marcaRepository.findAll();
    }

    public Optional<MarcaDTO> getMarcaById(Integer id){
        return marcaRepository.findById(id);
    }

    public void saveMarca(MarcaDTO marca) {
        marcaRepository.save(marca);
    }
}
