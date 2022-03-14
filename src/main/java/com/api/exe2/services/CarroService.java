package com.api.exe2.services;

import com.api.exe2.repositories.CarroModelRepository;

public class CarroService {

    final CarroModelRepository carroModelRepository;

    public CarroService(CarroModelRepository carroModelRepository) {
        this.carroModelRepository = carroModelRepository;
    }
}
