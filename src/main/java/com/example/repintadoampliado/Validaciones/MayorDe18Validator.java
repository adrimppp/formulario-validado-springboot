package com.example.repintadoampliado.Validaciones;

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
            // Si la fecha de nacimiento es nula, se podría considerar inválida, pero también puedes validarlo usando @NotNull
            context.buildConstraintViolationWithTemplate("La fecha de nacimiento no puede ser nula.")
                    .addConstraintViolation(); // Añade un mensaje de error en caso de ser nulo
            return false;
        }

        // Calcular la edad a partir de la fecha de nacimiento
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

        // Verificar si la persona es mayor de 18 años
        if (edad < 18) {
            context.buildConstraintViolationWithTemplate("La persona debe ser mayor de 18 años.")
                    .addConstraintViolation(); // Mensaje personalizado para menores de 18
            return false;
        }

        // Si es mayor o igual a 18, la validación es exitosa
        return true;
    }
}
