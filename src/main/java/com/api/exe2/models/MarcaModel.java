package com.api.exe2.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TB_MARCA")
public class MarcaModel {
    @Id
    private Integer id;
    @Column
    private String nome;
}
