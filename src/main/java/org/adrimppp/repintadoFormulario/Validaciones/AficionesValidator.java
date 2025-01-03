package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class AficionesValidator implements ConstraintValidator<Aficiones, List<String>> {
    @Override
    public boolean isValid(List<String> aficiones, ConstraintValidatorContext context) {
        // Verifica si la lista es nula o tiene al menos dos elementos
        if (aficiones == null) {
            return false; // Si es null, no es válido
        }
        return aficiones.size() > 1; // Verifica si la lista tiene 2 elementos o más.
    }
}
