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
public class DatosFormulario {
    @NotBlank(message = "{nombre.noblank}")
    private String nombre;
    @NotBlank(message = "{clave.noblank}")
    @Size(min = 6, max = 12)
    @Contrasena
    private String clave;
    @NotBlank(message="{confirmarClave.noblank}")
    @Size(min = 6, max = 12)
    @Contrasena
    private String confirmarClave;
    @Genero
    @NotBlank
    private String generoSeleccionado;
    @Paiss
    private String paisSeleccionado;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @MayorDe18
    private LocalDate fechaNacimiento;
    private Integer edad;
    @Digits(integer = 3, fraction = 2)
    private Float peso;
    @Prefijo
    private String prefijoTelefonico;
    @Telefono
    private String telefono;
    @Email
    private String email;
    private String url;
    private List<String> archivos;
    @NotEmpty
    private List<String> musicasSeleccionadas;
    @Aficiones
    private List<String> aficionesSeleccionadas;
    private String comentarios;
    @AssertTrue
    private boolean licencia;
}
