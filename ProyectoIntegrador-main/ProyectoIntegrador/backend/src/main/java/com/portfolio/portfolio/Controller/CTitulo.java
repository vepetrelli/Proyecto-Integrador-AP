package com.portfolio.portfolio.Controller;

import com.portfolio.portfolio.Dto.dtoTitulo;
import com.portfolio.portfolio.Entity.Titulo;
import com.portfolio.portfolio.Security.Controller.Mensaje;
import com.portfolio.portfolio.Service.Stitulo;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titulo")
@CrossOrigin(origins = "https://proyectointegradorap-96d87.web.app")
public class CTitulo {
    @Autowired
    Stitulo sTitulo;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Titulo>> list(){
    List<Titulo> list = sTitulo.list();
    return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Titulo> getById(@PathVariable ("id") int id){
    if(!sTitulo.existsById(id)){
        return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
    }
    Titulo titulo = sTitulo.getOne(id).get();
    return new ResponseEntity(titulo, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
    if(!sTitulo.existsById(id)){
    return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
    } sTitulo.delete(id);
    return new ResponseEntity(new Mensaje("Descripcion eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoTitulo dtotitulo){
    if(StringUtils.isBlank(dtotitulo.getProfesion())){
    return new ResponseEntity(new Mensaje("la profesion es obligatoria"), HttpStatus.BAD_REQUEST);
    }
    if(sTitulo.existsByProfesion(dtotitulo.getProfesion())){
    return new ResponseEntity(new Mensaje("Esa profesion ya existe"), HttpStatus.BAD_REQUEST);
    }
    Titulo titulo = new Titulo(
            dtotitulo.getProfesion(),dtotitulo.getDescripcion(), dtotitulo.getImg()
    );
    sTitulo.save(titulo);
    return new ResponseEntity(new Mensaje("Descripcion creada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable ("id") int id, @RequestBody dtoTitulo dtotitulo){
    if(!sTitulo.existsById(id)){
    return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
    }
    if(sTitulo.existsByProfesion(dtotitulo.getProfesion()) && sTitulo.getByProfesion(dtotitulo.getProfesion()).get().getId() !=id){
    return new ResponseEntity(new Mensaje("Esa profesion ya existe"), HttpStatus.BAD_REQUEST);
    }
    if (StringUtils.isBlank(dtotitulo.getProfesion())){
    return new ResponseEntity(new Mensaje("El campo no puede estar vacío"), HttpStatus.BAD_REQUEST);
    }
    
    Titulo titulo = sTitulo.getOne(id).get();
    titulo.setProfesion(dtotitulo.getProfesion());
    titulo.setDescripcion(dtotitulo.getDescripcion());
    titulo.setImg(dtotitulo.getImg());
    
    sTitulo.save(titulo);
    return new ResponseEntity(new Mensaje("Descripcion actualizada"), HttpStatus.OK);
    }
}
