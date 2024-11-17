package com.example.repintadoampliado.Validaciones;

import com.example.repintadoampliado.Model.Colecciones;
import com.example.repintadoampliado.Validaciones.Genero;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GeneroValidator implements ConstraintValidator<Genero, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.trim().isEmpty()) {
            return false; // La cadena vacía no es válida
        }
        return Colecciones.getListaGeneros().containsKey(value);
    }
}
