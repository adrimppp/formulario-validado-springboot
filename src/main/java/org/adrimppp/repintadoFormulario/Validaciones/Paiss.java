package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PaisValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Paiss {
    String message() default "{pais.invalido}"; // Mensaje de error
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
