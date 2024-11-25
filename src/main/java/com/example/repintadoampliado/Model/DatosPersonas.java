package com.example.repintadoampliado.Model;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class DatosPersonas {
    public List<Persona> listaPersonas= Stream.of(
            new Persona("Pepe", LocalDate.of(2000,1,2), 1L, 72.3F),
            new Persona("Charo", LocalDate.of(2002,12,2), 2L, 50.6F)
    ).toList();

    public static Persona getPersona(Long id) {

    }
}
