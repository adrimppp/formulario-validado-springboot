package com.example.repintadoampliado.Validaciones;

import com.example.repintadoampliado.Model.DatosFormulario;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ClaveCoincideValidator implements ConstraintValidator<ClaveCoincide, DatosFormulario> {

    @Override
    public void initialize(ClaveCoincide constraintAnnotation) {
    }

    @Override
    public boolean isValid(DatosFormulario datosFormulario, ConstraintValidatorContext context) {
        if (datosFormulario.getClave() != null && datosFormulario.getConfirmarClave() != null) {
            if (!datosFormulario.getClave().equals(datosFormulario.getConfirmarClave())) {
                context.disableDefaultConstraintViolation();

                context.buildConstraintViolationWithTemplate("{formulario.clavesNoCoinciden}")
                        .addPropertyNode("confirmarClave")
                        .addConstraintViolation();

                return false;
            }
        }
        return true;
    }
}
