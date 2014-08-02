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
public class Fisico_libro extends Producto {
    public void generar_orden_entrega(Integer cedula, String nombre,String direccion,String telefono,String codigo_producto,Double total,String fecha_actual,String fecha_entrega, Integer accion)
    {
       String duplicado="cedula:"+cedula+" nombre:"+nombre+ " direccion:"+direccion+" telefono:"+telefono+" codigo del producto:"+codigo_producto+" precio:"+total+" fecha de compra:"+fecha_actual+" fecha de entrega: "+fecha_entrega;
       if(accion==1)
       {
            System.out.println("ORDEN DE ENTREGA" );
            System.out.println(duplicado);
       }
       else
       {
           Departamento_libros dep=new Departamento_libros();
           dep.recibir_duplicado(duplicado);
       }
       generando_pago(nombre);
    }
    public void generando_pago(String nombre)
    {
        System.out.println(nombre+" Se generó pago de comisión al angente");
    }
}
