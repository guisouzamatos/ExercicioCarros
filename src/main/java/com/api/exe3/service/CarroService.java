package com.api.exe3.service;

import com.api.exe3.entity.dto.CarroDTO;
import com.api.exe3.entity.dto.MarcaDTO;
import com.api.exe3.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class CarroService {

    final CarroRepository carroRepository;
    final MarcaService marcaService;

    public CarroService(CarroRepository carroRepository, MarcaService marcaService) {
        this.carroRepository = carroRepository;
        this.marcaService = marcaService;
    }

    public List<CarroDTO> getAll() {
        return carroRepository.findAll();
    }

    public Optional<CarroDTO> getById(Integer id){
        return carroRepository.findById(id);
    }

    public void save(CarroDTO carro) {
        if (verificarMarca(carro)){
            carroRepository.save(carro);
        }
    }

    public void delete(Integer id) {
        carroRepository.deleteById(id);
    }

    private boolean verificarMarca(CarroDTO carro) {
        List<MarcaDTO> lista;
        AtomicReference<Integer> ret = new AtomicReference<>(0);
        lista = marcaService.getAll();
        lista.forEach(it -> {
            if (carro.getMarca().equalsIgnoreCase(it.getNome())) {
                ret.set(1);
            }
        });
        return ret.get() == 1;
    }
}

