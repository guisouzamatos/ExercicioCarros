package com.api.exe3.controller;

import com.api.exe3.entity.dto.CarroDTO;
import com.api.exe3.service.CarroService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/carro")
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/get-all")
    public List<CarroDTO> getAll() {
        return carroService.getAll();
    }

    @GetMapping("/get-by-id")
    public CarroDTO getById(@RequestParam Integer id) {
        Optional<CarroDTO> CarroOptional = carroService.getById(id);
        return CarroOptional.get();
    }

    @PostMapping("/colocar")
    public void save(@RequestBody @Valid CarroDTO carro) {
        carroService.save(carro);
    }

    @DeleteMapping("/deletar")
    public void deletar(@RequestParam Integer id) {
        carroService.delete(id);
    }
}
