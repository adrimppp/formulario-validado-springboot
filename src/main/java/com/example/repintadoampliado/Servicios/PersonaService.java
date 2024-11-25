package com.example.repintadoampliado.Servicios;

import com.example.repintadoampliado.Model.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> devuelvePersonas();
    Persona devuelvePersonaPorId(long id);
}
