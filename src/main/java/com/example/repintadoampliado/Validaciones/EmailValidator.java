package com.example.repintadoampliado.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<Email, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null) {
            return false; // or true, depending on your validation logic
        }
        Pattern pattern= Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|es)$");
        Matcher matcher = pattern.matcher(s);
        try{
            return matcher.matches();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
