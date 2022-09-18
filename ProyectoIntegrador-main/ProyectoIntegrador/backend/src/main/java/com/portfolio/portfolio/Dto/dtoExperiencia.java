package com.portfolio.portfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
@NotBlank
private String nombreE;
@NotBlank
private String descripcionE;
@NotBlank
private String anoE;
@NotBlank
private String imgE;

//constructores 

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String anoE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.anoE = anoE;
        this.imgE = imgE;
    }
//getters and setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getAnoE() {
        return anoE;
    }

    public void setAnoE(String anoE) {
        this.anoE = anoE;
    }
    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
    
}
