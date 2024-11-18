package com.example.repintadoampliado.Controller;

import com.example.repintadoampliado.Model.DatosFormulario;
import com.example.repintadoampliado.Model.Colecciones;
import com.example.repintadoampliado.Model.Utility;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("formulario")
public class Controlador {
    //Añade atributos globales a la clase
    @ModelAttribute
    private void añadeAtributosGlobalesAlModelo(Model modelo) {
        modelo.addAttribute("lista_generos", Colecciones.getListaGeneros());
        modelo.addAttribute("lista_aficiones", Colecciones.getListaAficiones());
        modelo.addAttribute("lista_paises", Colecciones.getListaPaises());
        modelo.addAttribute("lista_musicas", Colecciones.getListaMusica());
    }

    //Primer controlador, devuelve el formulario con un usuario predeterminado
    @NotBlank
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private static int iteraciones=0;
    @GetMapping("devuelve-formulario-validado")
    public String devuelveFormularioValidado(Model model, HttpServletRequest request, @RequestHeader("User-Agent") String userAgent) {
        DatosFormulario predeterminado = new DatosFormulario("Lola", null, null, null, "pt", null, null, null, "33", null,null, null, null, null, null, null, false);
        iteraciones++;
        model.addAttribute("iteraciones", iteraciones);
        model.addAttribute("datosFormulario", predeterminado);
        // Obtener dirección IP del cliente
        String clientIp = request.getRemoteAddr();

        // Obtener nombre del host
        String hostName = request.getRemoteHost();

        // Obtener sistema operativo (por lo general, el User-Agent tiene esta información)
        String os = getOperatingSystem(userAgent);

        // Obtener motor de renderizado del navegador (también generalmente en el User-Agent)
        String renderEngine = getRenderEngine(userAgent);

        // Obtener el idioma y locale preferido
        String locale = request.getLocale().toString();

        // Pasar todos los datos al modelo para ser accesibles en el HTML
        model.addAttribute("clientIp", clientIp);
        model.addAttribute("userAgent", userAgent);
        model.addAttribute("os", os);
        model.addAttribute("renderEngine", renderEngine);
        model.addAttribute("hostName", hostName);
        model.addAttribute("locale", locale);
        return "formulario";
    }

    //Primer controlador, devuelve el formulario con los datos enviados
    @PostMapping("recibe-parametros-validado")
    public String recibeParametrosValidado(Model model,
                                           @Valid @ModelAttribute("datosFormulario") DatosFormulario datosFormulario,
                                           BindingResult resultadoValidacion,
                                           @RequestParam (name="imagen_enviar.x", required = false) Integer coordenadasX,
                                           @RequestParam (name="imagen_enviar.y", required=false) Integer coordenadasY,
                                           HttpServletRequest request, @RequestHeader("User-Agent") String userAgent) {
        iteraciones++;
        String noNulos= Utility.noNulos(datosFormulario);
        System.out.println(datosFormulario.toString());
        if(resultadoValidacion.hasErrors()) {
            model.addAttribute("mensajeNOK",
                    "El formulario tiene errores");
        }
        else {
            model.addAttribute("mensajeOK",
                    "El formulario no tiene errores");
        }


        // Obtener dirección IP del cliente
        String clientIp = request.getRemoteAddr();

        // Obtener nombre del host
        String hostName = request.getRemoteHost();

        // Obtener sistema operativo (por lo general, el User-Agent tiene esta información)
        String os = getOperatingSystem(userAgent);

        // Obtener motor de renderizado del navegador (también generalmente en el User-Agent)
        String renderEngine = getRenderEngine(userAgent);

        // Obtener el idioma y locale preferido
        String locale = request.getLocale().toString();

        // Pasar todos los datos al modelo para ser accesibles en el HTML
        model.addAttribute("clientIp", clientIp);
        model.addAttribute("userAgent", userAgent);
        model.addAttribute("os", os);
        model.addAttribute("renderEngine", renderEngine);
        model.addAttribute("hostName", hostName);
        model.addAttribute("locale", locale);
        model.addAttribute("imagen_enviarX", coordenadasX);
        model.addAttribute("imagen_enviarY", coordenadasY);
        model.addAttribute("iteraciones", iteraciones);
        model.addAttribute("noNulos", noNulos);
        return "formulario";
    }
    // Método para extraer el sistema operativo desde el User-Agent
    private String getOperatingSystem(String userAgent) {
        if (userAgent.contains("Windows")) {
            return "Windows";
        } else if (userAgent.contains("Mac")) {
            return "MacOS";
        } else if (userAgent.contains("X11")) {
            return "Unix";
        } else if (userAgent.contains("Linux")) {
            return "Linux";
        }
        return "Desconocido";
    }

    // Método para extraer el motor de renderizado desde el User-Agent
    private String getRenderEngine(String userAgent) {
        if (userAgent.contains("WebKit")) {
            return "WebKit";
        } else if (userAgent.contains("Gecko")) {
            return "Gecko";
        }
        return "Desconocido";
    }
}
