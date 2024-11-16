package com.example.repintadoampliado.Model;

import com.example.repintadoampliado.Validaciones.Email;
import com.example.repintadoampliado.Validaciones.Contrasena;
import com.example.repintadoampliado.Validaciones.Telefono;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
    private String generoSeleccionado;
    private String paisSeleccionado;
    private LocalDate fechaNacimiento;
    private int edad;
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
