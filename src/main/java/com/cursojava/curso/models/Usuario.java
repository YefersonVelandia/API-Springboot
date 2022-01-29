package com.cursojava.curso.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Entidad hace referencia a la base de datos
@Table (name = "usuarios")

public class Usuario {

    @Id //indica que es la llave primaria
    @Getter @Setter @Column(name = "id")  //Indica la columna de la base de datos
    private Long id;

    @Getter @Setter @Column(name = "nombre")  //Indica la columna de la base de datos
    private String nombre;

    @Getter @Setter @Column(name = "apellido")  //Indica la columna de la base de datos
    private String apellido;

    @Getter @Setter @Column(name = "email")  //Indica la columna de la base de datos
    private String email;

    @Getter @Setter @Column(name = "telefono")  //Indica la columna de la base de datos
    private int telefono;

    @Getter @Setter @Column(name = "password")  //Indica la columna de la base de datos
    private String password;


}
