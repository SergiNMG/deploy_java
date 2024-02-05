package com.fpmislata.despliegue.controller;

import com.fpmislata.despliegue.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonaController {

    @GetMapping("")
    public Persona showPersona() {
        Persona persona = new Persona();
        persona.setNombre("Sergi");
        persona.setEdad(24);
        persona.setFuncion("web programmer");
        return persona;
    }
}
