package com.angelho.prueba.controladores;

import com.angelho.prueba.servicios.PruebaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Index {

    @Autowired
    @Qualifier("pruebaservicio")
    PruebaServicio pruebaservicio;

    @GetMapping({"/index", "/"})
    public ModelAndView index() {
        ModelAndView modelo = new ModelAndView("index");
        modelo.addObject("usuarioprueba", pruebaservicio.findByName("angelho"));
        return modelo;
    }

    @GetMapping("/lista")
    public ModelAndView lista() {
        ModelAndView modelo = new ModelAndView("lista");
        modelo.addObject("lista", pruebaservicio.findAll());
        return modelo;
    }
}
