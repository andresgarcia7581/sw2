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
public class Membresia extends Producto {
    private Boolean activa;
    private Boolean actualizada;
    public Boolean isActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Boolean isActualizada() {
        return actualizada;
    }

    public void setActualizada(Boolean actualizada) {
        this.actualizada = actualizada;
    } 
    public void activar_membresia(String nombre,String email)
    {
        this.activa=true;
        System.out.println("Señor(a) "+nombre+" la Membresía está activada");
        enviar_email(email,"activada");
    }
    public void actualizar_membresia(String codigo_producto,String nombre,String email)
    {
        this.actualizada=true;
        System.out.println("Señor(a) "+nombre+" la Membresía con codigo: "+codigo_producto +" ha sido actualizada");
        enviar_email(email,"actualizada");
    }
    public void enviar_email(String email, String accion)
    {
        System.out.println(email+" Le informamos que su membresia  ha sido "+accion);
    }
}
