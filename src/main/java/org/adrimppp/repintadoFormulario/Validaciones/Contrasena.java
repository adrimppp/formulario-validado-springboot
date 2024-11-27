package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = ContrasenaValidator.class)
@Documented
public @interface Contrasena {

    String message() default "{contrasena.invalido}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}