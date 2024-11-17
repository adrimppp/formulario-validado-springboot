package com.example.repintadoampliado.Validaciones;

import com.example.repintadoampliado.Model.Colecciones;
import com.example.repintadoampliado.Model.Pais;
import com.example.repintadoampliado.Validaciones.Genero;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrefijoValidator implements ConstraintValidator<Prefijo, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.trim().isEmpty()) {
            return false; // La cadena vacía no es válida
        }
        Map<String, Pais> listaPaises=Colecciones.getListaPaises();
        ArrayList<String> prefijos = new ArrayList<>();
        for (Map.Entry<String, Pais> entry : listaPaises.entrySet()) {
            String prefijo=entry.getValue().getPrefijoTelefonicoPais();
            prefijos.add(prefijo);
        }
        return prefijos.contains(value);
    }
}
