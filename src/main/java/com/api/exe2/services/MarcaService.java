package com.api.exe2.services;

import com.api.exe2.repositories.MarcaModelRepository;

public class MarcaService {

    final MarcaModelRepository marcaModelRepository;

    public MarcaService(MarcaModelRepository marcaModelRepository) {
        this.marcaModelRepository = marcaModelRepository;
    }
}
