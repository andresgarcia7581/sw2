/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author ALK
 */
public class Video extends Producto {
    private String url;
    private String formato;
    public Video(String codigo,String nombre,String url,Integer dueno)
    {
        this.url=url;
        this.codigo=codigo;
        this.nombre=nombre;
        this.dueno=dueno;
        this.formato="2D";
    }
    public void agregar_video(String cliente)
    {
       System.out.println("Señor(a) "+cliente+" Le informamos que se ha agragado al paquete de entrega un video gratis de primeros auxilios");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = "2D";
    }
        
}
