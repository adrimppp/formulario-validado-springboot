package com.example.repintadoampliado.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Getter
public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Long id;
    private Float peso;
}
