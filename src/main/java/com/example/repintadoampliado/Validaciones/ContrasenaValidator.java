package com.example.repintadoampliado.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContrasenaValidator implements ConstraintValidator<Contrasena, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        // Check if the input is null or empty
        if (s == null) {
            return false; // or true, depending on your validation logic
        }

        // Define the regex pattern for password validation
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&]).*$");

        // Create a matcher object and apply the regex
        Matcher matcher = pattern.matcher(s);

        try {
            return matcher.matches(); // Validate the password against the pattern
        } catch (Exception e) {
            throw new RuntimeException("Error during password validation", e);
        }
    }
}
