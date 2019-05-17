/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angelho.prueba.repositorios;

import com.angelho.prueba.entidades.Prueba;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorio")
public interface Repositorio extends CrudRepository<Prueba, Serializable> {

    public abstract Prueba findByNombre(String nombre);
}
