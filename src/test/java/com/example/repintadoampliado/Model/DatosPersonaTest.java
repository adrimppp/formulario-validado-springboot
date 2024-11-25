package com.example.repintadoampliado.Model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatosPersonaTest {

    @Test
    public void test_getPersonaPorId() {
        Persona personaPrueba = new Persona("Charo", LocalDate.of(2002,12,2), 2L, 50.6F);

        Persona personaRecuperada = DatosPersonas.getPersonaPorId(2L);

        // Assert

        assertNotNull(personaRecuperada);
        assertEquals(personaPrueba.getId(), personaRecuperada.getId());
        assertEquals(personaPrueba.getNombre(), personaRecuperada.getNombre());
        assertEquals(personaPrueba.getFechaNacimiento(), personaRecuperada.getFechaNacimiento());
    }
}
