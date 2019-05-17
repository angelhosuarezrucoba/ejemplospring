package com.angelho.prueba.servicios;

import com.angelho.prueba.entidades.Prueba;
import java.util.List;


public interface PruebaServicio {

    public abstract List<Prueba> findAll();

    public abstract Prueba findByName(String nombre);

}
