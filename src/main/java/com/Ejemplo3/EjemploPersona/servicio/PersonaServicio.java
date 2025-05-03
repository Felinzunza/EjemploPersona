package com.Ejemplo3.EjemploPersona.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejemplo3.EjemploPersona.modelo.Persona;
import com.Ejemplo3.EjemploPersona.repositorio.PersonaRepositorio;

@Service //define responsabilidad de servicio
public class PersonaServicio { //Servicio solo orquesta cuando es llamado, no guarda directamente, eso lo hace el repositorio
    @Autowired /*Me instancia una personaRepositorio automaticamente de la clase PersonaRepositorio(sin usar new) */
    private PersonaRepositorio personaRepositorio;

    public Persona guardarPersona(Persona persona){  //Guarda una nueva persona usando el repositorio
        return personaRepositorio.create(persona); //Devuelve la persona creada al controlador
    }

}
//ir al controlador nuevamente
