package com.api.exe2.models;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "TB_CARRO")
public class CarroModel {
    @Id
    private Integer id;
    @Column
    private String nome;
    @Column
    private String placa;
    @ManyToOne
    private MarcaModel marca;
    @Column
    private CategoriaModel categoria;
}
