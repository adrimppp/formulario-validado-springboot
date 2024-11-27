package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ClaveCoincideValidator.class)
public @interface ClaveCoincide {

    String message() default "Las claves no coinciden";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
