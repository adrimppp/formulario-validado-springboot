package com.example.repintadoampliado.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContrasenaValidator implements ConstraintValidator<Contrasena, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern= Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&]).*$");
        Matcher matcher = pattern.matcher(s);
        try{
            return matcher.matches();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
