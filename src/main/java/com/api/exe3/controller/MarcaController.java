package com.api.exe3.controller;

import com.api.exe3.entity.dto.CarroDTO;
import com.api.exe3.entity.dto.MarcaDTO;
import com.api.exe3.service.CarroService;
import com.api.exe3.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {
    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping("/colocar")
    public void saveCar(@RequestBody @Valid MarcaDTO marca) {
        marcaService.saveMarca(marca);
    }

    @GetMapping("/get-all")
    public List<MarcaDTO> getAll() {
        return marcaService.getAll();
    }

    @GetMapping("/get-by-id")
    public MarcaDTO getById(@RequestParam Integer id){
        Optional<MarcaDTO> MarcaOptional = marcaService.getMarcaById(id);
        return MarcaOptional.get();
    }
}
