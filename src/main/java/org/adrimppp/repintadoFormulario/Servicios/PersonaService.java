package org.adrimppp.repintadoFormulario.Servicios;

import org.adrimppp.repintadoFormulario.tests.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> devuelvePersonas();
    Persona devuelvePersonaPorId(long id);
}
