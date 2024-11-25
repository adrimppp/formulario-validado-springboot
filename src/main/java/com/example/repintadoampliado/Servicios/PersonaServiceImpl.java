package com.example.repintadoampliado.Servicios;

import com.example.repintadoampliado.Excepciones.PersonaNoEncontradaException;
import com.example.repintadoampliado.Model.DatosPersonas;
import com.example.repintadoampliado.Model.Persona;

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
