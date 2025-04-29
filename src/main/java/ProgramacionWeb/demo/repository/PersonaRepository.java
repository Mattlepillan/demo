package ProgramacionWeb.demo.repository;

import java.util.ArrayList;
import java.util.List;

import ProgramacionWeb.demo.model.Persona;

public class PersonaRepository {
    List<Persona> personas = new ArrayList<>();

    public Persona create(Persona persona) {
        personas.add(persona);
        return persona;
    }
    
    
}
