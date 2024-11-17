package com.example.repintadoampliado.Model;

import lombok.*;

import java.lang.annotation.Annotation;

@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Pais {
    private String pais;
    private String idiomas;
    private String prefijoTelefonicoPais;
    private boolean muestraIdioma;
    private String nombreArchivoBandera;
}
