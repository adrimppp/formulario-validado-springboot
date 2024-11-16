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
import org.springframework.web.bind.annotation.RequestParam;

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
        return "formulario";
    }

    @PostMapping("recibe-parametros-validado")
    public String recibeParametrosValidado(Model model,
                                           @ModelAttribute("datosFormulario") DatosFormulario datosFormulario,
                                           BindingResult resultadoValidacion,
                                           @RequestParam (name="imagen_enviar.x", required = false) Integer coordenadasX,
                                           @RequestParam (name="imagen_enviar.y", required=false) Integer coordenadasY) {
        iteraciones++;
        //System.out.println(datosFormulario.toString());
        System.out.println(coordenadasX);
        if(resultadoValidacion.hasErrors()) {
            model.addAttribute("mensajeNOK",
                    "El formulario tiene errores");
        }
        else {
            model.addAttribute("mensajeOK",
                    "El formulario no tiene errores");
        }
        model.addAttribute("imagen_enviarX", coordenadasX);
        model.addAttribute("imagen_enviarY", coordenadasY);
        model.addAttribute("iteraciones", iteraciones);
        return "formulario";
    }
}
