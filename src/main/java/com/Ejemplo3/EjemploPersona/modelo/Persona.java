package com.Ejemplo3.EjemploPersona.modelo;
/* SIEMPRE TENER INSTALADO LOMBOK */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data/*ME HACE LOS GETTER Y LOS SETTERS*/
@NoArgsConstructor /*CONTRUCTOR VACIO */
@AllArgsConstructor/*CONTRUCTOR SOBRECARGADO */

public class Persona {
    
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;


} /* Despues de hacer el modelo generar el repositorio donde ser guardara este modelo */
