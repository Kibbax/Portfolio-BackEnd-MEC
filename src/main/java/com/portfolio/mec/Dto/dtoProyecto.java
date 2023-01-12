
package com.portfolio.mec.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String imgpro;
    @NotBlank
    private String url_imagen;
    
    //Constructor

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String imgpro, String url_imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imgpro = imgpro;
        this.url_imagen = url_imagen;
    }
    
    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgpro() {
        return imgpro;
    }

    public void setImgpro(String imgpro) {
        this.imgpro = imgpro;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }
    
    
            
   
            
    
    
}
