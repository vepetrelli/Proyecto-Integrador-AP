package com.portfolio.portfolio.Repository;

import com.portfolio.portfolio.Entity.Titulo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RTitulo extends JpaRepository<Titulo, Integer>{
    public Optional<Titulo> findByProfesion(String rofesion);
    public boolean existsByProfesion (String profesion);
}
