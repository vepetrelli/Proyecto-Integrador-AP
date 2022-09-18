package com.portfolio.portfolio.Service;

import com.portfolio.portfolio.Entity.Titulo;
import com.portfolio.portfolio.Repository.RTitulo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Stitulo {
    @Autowired
    RTitulo rTitulo;
    
    public List<Titulo> list(){
    return rTitulo.findAll();
    }
    
    public Optional<Titulo> getOne(int id){
    return rTitulo.findById(id);
    }
    
    public Optional<Titulo> getByProfesion(String profesion){
    return rTitulo.findByProfesion(profesion);
    }
    
    public void save(Titulo titulo){
    rTitulo.save(titulo);
    }
    
    public void delete(int id){
    rTitulo.deleteById(id);
    }
    
    public boolean existsById(int id){
    return rTitulo.existsById(id);
    }
    
    public boolean existsByProfesion(String profesion){
    return rTitulo.existsByProfesion(profesion);
    }
}

