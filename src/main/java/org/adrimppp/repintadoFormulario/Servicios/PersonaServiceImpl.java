package org.adrimppp.repintadoFormulario.Servicios;

import org.adrimppp.repintadoFormulario.Excepciones.PersonaNoEncontradaException;
import org.adrimppp.repintadoFormulario.tests.DatosPersonas;
import org.adrimppp.repintadoFormulario.tests.Persona;

import java.util.List;

public class PersonaServiceImpl implements PersonaService {

    @Override
    public List<Persona> devuelvePersonas() {
        return DatosPersonas.getListaPersonas();
    }

    @Override
    public Persona devuelvePersonaPorId(long id) {
        Persona p = DatosPersonas.getPersonaPorId(id);
        if(p == null) {
            throw new PersonaNoEncontradaException("La persona que buscas no existe");
        }
        return p;
    }
}
