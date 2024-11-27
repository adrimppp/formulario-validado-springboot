package org.adrimppp.repintadoFormulario.Validaciones;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TelefonoValidator implements ConstraintValidator<Telefono, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        // Check if the input is null or empty
        if (s == null || s.isEmpty()) {
            return false; // or return true if you want to allow empty/null values
        }

        // Continue with the actual validation logic for the phone number
        // For example, checking if it matches a phone number pattern:
        String phonePattern = "^\\+?[0-9]{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}$";
        return s.matches(phonePattern); // Example regex for phone number validation
    }
}
