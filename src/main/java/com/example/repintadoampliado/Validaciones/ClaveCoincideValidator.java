package com.example.repintadoampliado.Validaciones;

import com.example.repintadoampliado.Model.DatosFormulario;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ClaveCoincideValidator implements ConstraintValidator<ClaveCoincide, DatosFormulario> {

    @Override
    public void initialize(ClaveCoincide constraintAnnotation) {
        // Aquí puedes realizar alguna inicialización si es necesario, pero por ahora está vacío
    }

    @Override
    public boolean isValid(DatosFormulario datosFormulario, ConstraintValidatorContext context) {
        // Verifica que ambos campos no sean nulos y que sean iguales
        if (datosFormulario.getClave() != null && datosFormulario.getConfirmarClave() != null) {
            // Si las contraseñas no coinciden, agrega un error en el campo 'confirmarClave'
            if (!datosFormulario.getClave().equals(datosFormulario.getConfirmarClave())) {
                // Deshabilitar la validación predeterminada (si la hay)
                context.disableDefaultConstraintViolation();

                // Agregar el mensaje de error para el campo 'confirmarClave'
                context.buildConstraintViolationWithTemplate("{formulario.clavesNoCoinciden}")
                        .addPropertyNode("confirmarClave") // Asociar el error con el campo 'confirmarClave'
                        .addConstraintViolation();

                return false; // Las contraseñas no coinciden, la validación falla
            }
        }
        return true; // Las contraseñas coinciden o no son nulas, la validación es exitosa
    }
}
