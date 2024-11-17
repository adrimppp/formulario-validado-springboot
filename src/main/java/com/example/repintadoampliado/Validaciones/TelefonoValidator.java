package com.example.repintadoampliado.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelefonoValidator implements ConstraintValidator<Telefono, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.isEmpty()){
            return true;
        }
        Pattern pattern= Pattern.compile("^\\d{9}$\n");
        Matcher matcher = pattern.matcher(s);
        try{
            return matcher.matches();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
