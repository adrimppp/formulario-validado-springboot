package com.example.repintadoampliado.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContrasenaValidator implements ConstraintValidator<Contrasena, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern= Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&])[A-Za-z\\d!#$%&]+$\n");
        Matcher matcher = pattern.matcher(s);
        try{
            return matcher.matches();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
