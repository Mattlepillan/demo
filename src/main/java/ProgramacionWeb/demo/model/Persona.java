package ProgramacionWeb.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Persona {
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    
}
