package com.example.repintadoampliado.Model;

import com.example.repintadoampliado.Validaciones.*;
import com.example.repintadoampliado.Validaciones.Email;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ClaveCoincide
@Edad
public class DatosFormulario {

    @NotBlank(message = "{nombre.noblank}")
    private String nombre;

    @NotBlank(message = "{clave.noblank}")
    @Size(min = 6, max = 12, message = "{clave.size}")
    @Contrasena(message = "{clave.patron}") // Validación personalizada para la contraseña
    private String clave;

    @NotBlank(message = "{confirmarClave.noblank}")
    @Size(min = 6, max = 12, message = "{confirmarClave.size}")
    @Contrasena(message = "{confirmarClave.patron}") // Validación personalizada para confirmar clave
    private String confirmarClave;

    @Genero(message = "{generoSeleccionado.invalido}") // Validación personalizada para género
    @NotBlank(message = "{generoSeleccionado.noblank}")
    private String generoSeleccionado;

    @Paiss(message = "{paisSeleccionado.invalido}") // Validación personalizada para país
    private String paisSeleccionado;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @MayorDe18(message = "{fechaNacimiento.mayorDe18}") // Validación personalizada de mayor de 18 años
    @NotNull(message="{fecha.obligatoria}")
    private LocalDate fechaNacimiento;

    private Integer edad;

    @Digits(integer = 3, fraction = 2, message = "{peso.digits}")
    private Float peso;

    @Prefijo(message = "{prefijoTelefonico.invalid}") // Validación personalizada para el prefijo
    private String prefijoTelefonico;

    @Telefono(message = "{telefono.invalid}") // Validación personalizada para el teléfono
    private String telefono;

    @Email(message = "{email.invalid}")
    private String email;

    private String archivos;

    private String url;

    @NotEmpty(message = "{musicasSeleccionadas.notEmpty}")
    private List<String> musicasSeleccionadas;

    @Aficiones(message = "{aficionesSeleccionadas.invalida}") // Validación personalizada para las aficiones
    private List<String> aficionesSeleccionadas;

    private String comentarios;

    @AssertTrue(message = "{licencia.debeAceptar}")
    private boolean licencia;
}
