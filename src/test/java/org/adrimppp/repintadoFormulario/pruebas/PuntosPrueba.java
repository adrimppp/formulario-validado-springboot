package org.adrimppp.repintadoFormulario.pruebas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuntosPrueba {
    public static void main(String[] args) {
        Map<Integer, Integer> mapaPuntos = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>(101, 20),
                new AbstractMap.SimpleImmutableEntry<>(102, 5),
                new AbstractMap.SimpleImmutableEntry<>(103, 6)
        ).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue));

        List<Punto> listaPuntos = mapaPuntos.entrySet().stream().map(mapaPunto -> new Punto(mapaPunto.getKey(), mapaPunto.getValue())).toList();

        listaPuntos.forEach(punto -> System.out.println(punto.toString()));
    }
}
