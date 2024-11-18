package com.example.repintadoampliado.Model;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    public static String noNulos(DatosFormulario datosFormulario) {
        List<String> list = new ArrayList<>();

        // Validación para cada campo con prefijo si es necesario
        if (datosFormulario.getNombre() != null && !datosFormulario.getNombre().isBlank()) {
            list.add("Usuario: " + datosFormulario.getNombre());
        }
        if (datosFormulario.getClave() != null && !datosFormulario.getClave().isBlank()) {
            list.add("Clave: " + datosFormulario.getClave());
        }
        if (datosFormulario.getConfirmarClave() != null && !datosFormulario.getConfirmarClave().isBlank()) {
            list.add("Confirmar Clave: " + datosFormulario.getConfirmarClave());
        }
        if (datosFormulario.getGeneroSeleccionado() != null && !datosFormulario.getGeneroSeleccionado().isBlank()) {
            list.add("Género: " + datosFormulario.getGeneroSeleccionado());
        }
        if (datosFormulario.getFechaNacimiento() != null) {
            list.add("Fecha de Nacimiento: " + datosFormulario.getFechaNacimiento().toString());
        }
        if (datosFormulario.getEdad() != null) {
            list.add("Edad: " + datosFormulario.getEdad().toString());
        }
        if (datosFormulario.getPeso() != null) {
            list.add("Peso: " + datosFormulario.getPeso().toString());
        }
        if (datosFormulario.getPrefijoTelefonico() != null && !datosFormulario.getPrefijoTelefonico().isBlank()) {
            list.add("Prefijo Telefónico: " + datosFormulario.getPrefijoTelefonico());
        }
        if (datosFormulario.getArchivos() != null && !datosFormulario.getArchivos().isBlank()) {
            list.add("Archivos: " + datosFormulario.getArchivos());
        }
        if (datosFormulario.getUrl() != null && !datosFormulario.getUrl().isBlank()) {
            list.add("URL: " + datosFormulario.getUrl());
        }
        if (datosFormulario.getMusicasSeleccionadas() != null && !datosFormulario.getMusicasSeleccionadas().isEmpty()) {
            list.add("Músicas Seleccionadas: " + datosFormulario.getMusicasSeleccionadas().toString());
        }
        if (datosFormulario.getAficionesSeleccionadas() != null && !datosFormulario.getAficionesSeleccionadas().isEmpty()) {
            list.add("Aficiones Seleccionadas: " + datosFormulario.getAficionesSeleccionadas().toString());
        }
        if (datosFormulario.getComentarios() != null && !datosFormulario.getComentarios().isBlank()) {
            list.add("Comentarios: " + datosFormulario.getComentarios());
        }
        if (datosFormulario.isLicencia()) {
            list.add("Licencia Aceptada");
        }

        // Generar el resultado como un solo String concatenado
        String resultado = String.join("\n", list); // Unir elementos con salto de línea

        // Agregar el tamaño de la lista al final
        resultado += "\n\nTotal de datos no nulos: " + list.size();

        return resultado;
    }
}
