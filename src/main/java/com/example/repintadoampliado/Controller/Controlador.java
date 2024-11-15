package com.example.repintadoampliado.Controller;

import com.example.repintadoampliado.Model.DatosFormulario;
import com.example.repintadoampliado.Model.Colecciones;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {
    @ModelAttribute
    private void añadeAtributosGlobalesAlModelo(Model modelo) {
        modelo.addAttribute("lista_generos", Colecciones.getListaGeneros());
        modelo.addAttribute("lista_aficiones", Colecciones.getListaAficiones());
        modelo.addAttribute("lista_paises", Colecciones.getListaPaises());
        modelo.addAttribute("lista_musicas", Colecciones.getListaMusica());
    }
    private static int iteraciones=0;
    @GetMapping("devuelve-formulario-validado")
    public String devuelveFormularioValidado(@ModelAttribute("datosFormulario") DatosFormulario datosFormulario) {
        iteraciones++;
        System.out.println(datosFormulario.toString());
        return "formulario";
    }

    @PostMapping("recibe-parametros-validado")
    public String recibeParametrosValidado(Model model,
                                           @ModelAttribute("datosFormulario") DatosFormulario datosFormulario,
                                           BindingResult resultadoValidacion) {
        iteraciones++;
        System.out.println(datosFormulario.toString());
        if(resultadoValidacion.hasErrors()) {
            model.addAttribute("mensajeNOK",
                    "El formulario tiene errores");
        }
        else {
            model.addAttribute("mensajeOK",
                    "El formulario no tiene errores");
        }
        model.addAttribute("iteraciones", iteraciones);
        return "formulario";
    }
}
