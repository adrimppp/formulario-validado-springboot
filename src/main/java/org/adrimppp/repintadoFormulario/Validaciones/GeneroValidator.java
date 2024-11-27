package org.adrimppp.repintadoFormulario.Validaciones;

import org.adrimppp.repintadoFormulario.tests.Colecciones;
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
