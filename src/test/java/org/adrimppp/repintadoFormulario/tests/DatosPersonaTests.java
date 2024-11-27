package org.adrimppp.repintadoFormulario.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class DatosPersonaTests {
    private Persona persona;
    @BeforeEach
    public void setUp() {
        persona=new Persona("Pepe", LocalDate.of(2000,1,2), 1L, 72.3F);}
    @Test
    public void testGetPersonaID() {
        Persona personaRecuperada= DatosPersonas.getPersonaPorId(1L);

        assertNotNull(personaRecuperada);
        assertEquals(personaRecuperada.getId(),1L);
        assertEquals(personaRecuperada.getNombre(),"Pepe");
        assertEquals(persona, personaRecuperada);
    }
}
