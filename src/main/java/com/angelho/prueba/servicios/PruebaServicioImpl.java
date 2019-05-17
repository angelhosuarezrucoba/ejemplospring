/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angelho.prueba.servicios;

import com.angelho.prueba.entidades.Prueba;
import com.angelho.prueba.repositorios.Repositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pruebaservicio")
public class PruebaServicioImpl implements PruebaServicio {

    @Autowired
    @Qualifier("repositorio")
    Repositorio repositorio;

    @Override
    public List<Prueba> findAll() {
        return (List<Prueba>) repositorio.findAll();
    }

    @Override
    public Prueba findByName(String nombre) {
        return repositorio.findByNombre(nombre);
    }

}
