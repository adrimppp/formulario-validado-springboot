package com.example.repintadoampliado.Model;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
@ToString
@Setter
@AllArgsConstructor
@Getter
public class Colecciones {

    @Getter
    private static Map<String, String> listaGeneros = new HashMap<>();

    @Getter
    private static Map<String, Pais> listaPaises = new HashMap<>();

    @Getter
    private static Map<String, String> listaMusica = new HashMap<>();

    @Getter
    private static Map<String, String> listaAficiones = new HashMap<>();
    static{
        listaGeneros.put("M", "Masculino");
        listaGeneros.put("F", "Femenino");
        listaGeneros.put("O", "Otro");

        listaPaises.put("es", new Pais("España", "Castellano", "34",true,"espania.png"));
        listaPaises.put("fr", new Pais("Francia", "Francés", "33",false,"francia.png"));
        listaPaises.put("it", new Pais("Italia", "Italiano", "39", false, "italia.jpg"));
        listaPaises.put("pt", new Pais("Portugal", "Portugués", "351", false, "portugal.jpg"));
        listaPaises.put("en", new Pais("Reino unido", "Ingles", "44", true, "reino_unido.jpg"));


        listaMusica.put("E", "Electronica");
        listaMusica.put("F", "Funky");
        listaMusica.put("N", "New Age");
        listaMusica.put("P", "Pop");
        listaMusica.put("R", "Rock");

        listaAficiones.put("D", "Deporte");
        listaAficiones.put("L", "Lectura");
        listaAficiones.put("P", "Pintura");
        listaAficiones.put("V", "Viajes");
    }

}
