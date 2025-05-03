package com.Ejemplo3.EjemploPersona.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Ejemplo3.EjemploPersona.modelo.Persona;

@Repository //Define a la clase responsabilidad de repositorio
public class PersonaRepositorio {
        List<Persona>personas = new ArrayList<>();

        public Persona create (Persona persona){ /*Agrega una nueva persona a la lista en memoria*/
            personas.add(persona);
            System.out.println(personas.toString()); /*Esto es para probar solamente con postman y devolver los datos en la consola */
            return persona;
        }


} // Luego se usa en el servicio para definir cómo se accede a estos datos

