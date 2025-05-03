package com.Ejemplo3.EjemploPersona.controlador;

import org.springframework.web.bind.annotation.RestController;

import com.Ejemplo3.EjemploPersona.modelo.Persona;
import com.Ejemplo3.EjemploPersona.servicio.PersonaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController //Define responsabilidad como controlador
@RequestMapping("/api/personas") //Define la ruta base
public class PersonaControlador {


    
    @GetMapping(/*"/hola"*/) /*Esto es un Endpoint de prueba, se accede desde el navegador:localhost:8080/api/personas/hola ;o Postman con: GET /hola
                           para que realmente tenga utilidad el return debe ser la obtencion de la lisla de personas**/
    public String index() {
        return "viva cristo rey";
    } /*despues de generar el Mapping crear el modelo */

    
    @Autowired
    private PersonaServicio personaServicio;


    /*Endpoint para agregar una nueva persona.
     * Se espera un objeto Persona en formato JSON en el cuerpo de la solicitud. */

    @PostMapping
        public Persona agregar(@RequestBody Persona persona){ /*requestbody me va convertir el json que llega desde el usuario a persona */
             return personaServicio.guardarPersona(persona);
   }
//esto se envia al servicio, que dirigira el repositorio que le pertenecen estos datos segun reglas y validaciones del servicio.

/* con get es el mismo proceso que pero al inverso (El controlador llama al servicio,El servicio le pide los datos al repositorio,
Y esos datos se devuelven al usuario, transformados en JSON automáticamente por Spring.)*/
}
