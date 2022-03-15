package com.api.exe3.entity.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Getter
@Setter
@Table(name = "TB_CARRO")
public class CarroDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    @NotBlank
    @NotNull
    private String nome;
    @Column
    @NotBlank
    @NotNull
    private String placa;
    @Column
    @NotBlank
    @NotNull
    private String marca;
    @Column
    @NotNull
    private Integer categoria;
}
