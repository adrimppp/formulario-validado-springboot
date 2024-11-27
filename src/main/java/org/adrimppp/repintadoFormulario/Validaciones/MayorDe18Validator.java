package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

public class MayorDe18Validator implements ConstraintValidator<MayorDe18, LocalDate> {

    @Override
    public void initialize(MayorDe18 constraintAnnotation) {
        // No se requiere inicialización adicional
    }

    @Override
    public boolean isValid(LocalDate fechaNacimiento, ConstraintValidatorContext context) {

        if (fechaNacimiento == null) {
            return false;
        }

        // Calcular la edad a partir de la fecha de nacimiento
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

        // Verificar si la persona es mayor de 18 años
        if (edad < 18) {
            return false;
        }

        // Si es mayor o igual a 18, la validación es exitosa
        return true;
    }
}
