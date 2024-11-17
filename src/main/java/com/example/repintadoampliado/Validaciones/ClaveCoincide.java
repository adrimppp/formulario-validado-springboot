package com.example.repintadoampliado.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Esta anotación valida los campos de tipo 'DatosFormulario'
@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
// Se enlaza con el validador que vamos a implementar
@Constraint(validatedBy = ClaveCoincideValidator.class)
public @interface ClaveCoincide {

    // Mensaje que se muestra cuando la validación falla
    String message() default "Las claves no coinciden";

    // Grupos de validación (usualmente no se utilizan)
    Class<?>[] groups() default {};

    // Payload para metadatos adicionales
    Class<? extends Payload>[] payload() default {};
}
