package com.projecto.integrador.br.Interface;

import com.projecto.integrador.br.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Trae una lista de Personas
    public List<Persona> getPersona();
    
   //Guarda un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Elimina un objeto pero lo busca por ID
    public void deletePersona(Long id);
    
    //Busca una persona por ID
    public Persona findPersona(Long id);
}
