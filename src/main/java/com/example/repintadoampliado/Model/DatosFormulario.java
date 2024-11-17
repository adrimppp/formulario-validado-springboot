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
    private String paisSeleccionado;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @MayorDe18
    private LocalDate fechaNacimiento;
    private Integer edad;
    @Digits(integer = 3, fraction = 2)
    private float peso;
    private String prefijoTelefonico;
    @Telefono
    private String telefono;
    @Email
    private String email;
    private String url;
    private List<String> archivos;
    private List<String> musicasSeleccionadas;
    private List<String> aficionesSeleccionadas;
    private String comentarios;
    private boolean licencia;
}
