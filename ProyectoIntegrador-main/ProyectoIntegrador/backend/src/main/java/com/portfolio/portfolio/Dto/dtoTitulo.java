package com.portfolio.portfolio.Dto;

import javax.validation.constraints.NotBlank;

public class dtoTitulo {
    @NotBlank
    private String profesion;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String img;

    public dtoTitulo() {
    }

    public dtoTitulo(String profesion, String descripcion, String img) {
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
