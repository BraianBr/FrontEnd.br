package com.projecto.integrador.br.Repository;

import com.projecto.integrador.br.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}

