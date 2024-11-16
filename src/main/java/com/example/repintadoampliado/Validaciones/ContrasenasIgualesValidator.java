package com.example.repintadoampliado.Validaciones;

import com.example.repintadoampliado.Model.DatosFormulario;
import com.example.repintadoampliado.Validaciones.ContrasenasIguales;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ContrasenasIgualesValidator implements ConstraintValidator<ContrasenasIguales, Object> {

    @Override
    public void initialize(ContrasenasIguales constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        if (obj instanceof DatosFormulario userDto) {
            return userDto.getClave().equals(userDto.getConfirmarClave());
        }
        return false;
    }
}
