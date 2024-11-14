package com.example.repintadoampliado.Model;

import com.example.repintadoampliado.Validaciones.ContrasenasIguales;
import com.example.repintadoampliado.Validaciones.Email;
import com.example.repintadoampliado.Validaciones.Contrasena;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;
import java.util.List;

@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ContrasenasIguales
public class DatosFormulario {
    @NotNull
    private String nombre;
    @NotNull
    @Size(min = 6, max = 12)
    @Contrasena
    private String clave;
    @NotNull
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
    private String telefono;
    @Email
    private String email;
    private String url;
    private String archivos;
    private List<String> musicasSeleccionadas;
    private List<String> aficionesSeleccionadas;
    private String comentarios;
    private boolean licencia;
}
