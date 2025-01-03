package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EdadValidator.class)
public @interface Edad {
    String message() default "{edad.coincideNacimiento}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}