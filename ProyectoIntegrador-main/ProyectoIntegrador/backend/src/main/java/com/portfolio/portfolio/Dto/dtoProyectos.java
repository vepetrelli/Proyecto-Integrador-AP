package com.portfolio.portfolio.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String anoP;
    @NotBlank
    private String imgP;

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String anoP, String imgP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.anoP = anoP;
        this.imgP = imgP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getAnoP() {
        return anoP;
    }

    public void setAnoP(String anoP) {
        this.anoP = anoP;
    }
    
     public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }
    
    
}
