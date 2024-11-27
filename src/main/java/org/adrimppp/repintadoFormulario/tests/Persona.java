package org.adrimppp.repintadoFormulario.tests;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor @Getter @EqualsAndHashCode
public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Long id;
    private Float peso;
}
