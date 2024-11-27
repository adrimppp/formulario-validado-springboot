package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = GeneroValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Genero {
    String message() default "{genero.invalido}"; // Mensaje de error
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
