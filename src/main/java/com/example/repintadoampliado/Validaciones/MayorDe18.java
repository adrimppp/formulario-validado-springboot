package com.example.repintadoampliado.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MayorDe18Validator.class) // Define la clase validadora
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE }) // Especifica dónde se puede usar la anotación
@Retention(RetentionPolicy.RUNTIME) // La anotación estará disponible en tiempo de ejecución
public @interface MayorDe18 {
    String message() default "{mayorde18.invalido}"; // Mensaje de error por defecto
    Class<?>[] groups() default {}; // Grupos de validación
    Class<? extends Payload>[] payload() default {}; // Datos adicionales
}
