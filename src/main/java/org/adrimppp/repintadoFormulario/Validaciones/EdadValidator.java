package org.adrimppp.repintadoFormulario.Validaciones;

import org.adrimppp.repintadoFormulario.tests.DatosFormulario;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

public class EdadValidator implements ConstraintValidator<Edad, DatosFormulario> {
    int edad;
    private String message;

    @Override
    public void initialize(Edad constraintAnnotation) {
        this.message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(DatosFormulario datosFormulario, ConstraintValidatorContext context) {
        if (datosFormulario == null) {
            return true;
        }
        if(datosFormulario.getEdad() == null){
            return true;
        }

        LocalDate fechaNacimiento = datosFormulario.getFechaNacimiento();
        try {
            edad = datosFormulario.getEdad();
        }catch(NullPointerException npe){
            return false;
        }


        if (fechaNacimiento != null) {
            int edadCalculada = Period.between(fechaNacimiento, LocalDate.now()).getYears();
            if (edad != edadCalculada) {

                context.disableDefaultConstraintViolation();


                context.buildConstraintViolationWithTemplate(message)
                        .addPropertyNode("edad") //
                        .addConstraintViolation();

                return false;
            }
        }

        return true;
    }
}