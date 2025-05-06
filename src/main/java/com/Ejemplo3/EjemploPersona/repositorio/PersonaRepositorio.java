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

        public List<Persona> readAll(){ /*Devuelve todas las personas de la lista*/
            return personas; /*Devuelve la lista de todas las personas*/
        }

        public Persona read (int id){ /*Busca una persona por id*/
            for (Persona persona : personas) { /*Recorre la lista de personas*/
                if (persona.getId() == id) { /*Si el id coincide con el que se busca*/
                    return persona; /*Devuelve la persona*/
                }
                     
        }
            return null; /*Si no se encuentra la persona devuelve null*/
        }

        public Persona update (int id, Persona nuevaPersona){ /*Actualiza una persona por id*/
            Persona personaEncontrada = read(id);  /*Busca la persona por id*/
            if (personaEncontrada != null) { /*Si la persona existe*/
                personaEncontrada.setNombre(nuevaPersona.getNombre()); /*Actualiza el nombre*/
                personaEncontrada.setApellido(nuevaPersona.getApellido()); /*Actualiza el apellido*/
                personaEncontrada.setEdad(nuevaPersona.getEdad()); /*Actualiza la edad*/
                return personaEncontrada; /*Devuelve la persona actualizada*/
            }
            return null;
         } /*Si no se encuentra la persona devuelve null*/

         public String delete (int id){ /*Elimina una persona por id*/
            Persona personaEncontrada = read(id); /*Busca la persona por id*/
            if (personaEncontrada != null) { /*Si la persona existe*/
                personas.remove(personaEncontrada); /*Elimina la persona de la lista*/
                return "Persona eliminada"; /*Devuelve String de confirmacion*/
            } 
            return "Persona no encontrada"; /*Si no se encuentra la persona devuelve String de error*/}
            
} 
 // Luego se usa en el servicio para definir cómo se accede a estos datos

