package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definimos la anotación personalizada para validar que el tamaño de una lista sea mayor que 2
@Constraint(validatedBy = AficionesValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Aficiones {
    String message() default "La lista de aficiones debe tener más de dos elementos.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
