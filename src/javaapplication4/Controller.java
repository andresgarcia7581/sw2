/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ALK
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Integer seguir=0;
    while (seguir!=1)
    {
        System.out.println("Digite la identificacion");
        int cedula=entrada.nextInt();
        
        System.out.println("Digite el nombre completo del cliente");
        String nombre_cliente=entrada.next();
        
        System.out.println("Digite el correo electrónico:");
        String email=entrada.next();
        
        System.out.println("1-Producto Físico, 2-Libros, 3-Membresía, 4-Actualización de membresía, 5-Video :");
        int accion = entrada.nextInt();
        
        System.out.println("Digite el nombre del producto a pagar:");
        String nombre_producto=entrada.next();
        
        System.out.println("Digite el codigo del producto a pagar:");
        String codigo_producto=entrada.next();
        
        System.out.println("Digite el total a pagar");
        Double total=entrada.nextDouble();
        
        Pago info_pago= new Pago();
        info_pago.setCod_entrega(1010);
        info_pago.setFecha_pago("20 de julio de 2014");
        info_pago.setFecha_entrega("30 de julio de 2014");
        info_pago.setIdentificacion(cedula);
        info_pago.setNombre_cliente(nombre_cliente);
        info_pago.setCorrreo_electronico(email);
        info_pago.setTotal(total);
        
        switch(accion)
        {
            case 1:     Fisico_libro fis=new Fisico_libro();
                        fis.setCodigo(codigo_producto);
                        fis.setNombre(nombre_producto);
                        fis.setDueno(info_pago.getCod_entrega());
                        fis.generar_orden_entrega(info_pago.getIdentificacion(),info_pago.getNombre_cliente(),"Cra 1 N°10-14","5427363",fis.getCodigo(),info_pago.getTotal(),info_pago.getFecha_pago(),info_pago.getFecha_entrega(),1);
                break;
            case 2:     Fisico_libro fis1=new Fisico_libro();
                        fis1.setCodigo(codigo_producto);
                        fis1.setNombre(nombre_producto);
                        fis1.setDueno(info_pago.getCod_entrega());
                        fis1.generar_orden_entrega(info_pago.getIdentificacion(),info_pago.getNombre_cliente(),"Cra 1 N°10-14","5427363",fis1.getCodigo(),info_pago.getTotal(),info_pago.getFecha_pago(),info_pago.getFecha_entrega(),2);
                break;
            case 3:
                        Membresia membre=new Membresia();
                        membre.setCodigo(codigo_producto);
                        membre.setNombre(nombre_producto);
                        membre.setDueno(info_pago.getCod_entrega());
                        membre.activar_membresia(info_pago.getNombre_cliente(),info_pago.getCorrreo_electronico());
                break;
            case 4:     Membresia membre2=new Membresia();
                        membre2.setCodigo(codigo_producto);
                        membre2.setNombre(nombre_producto);
                        membre2.setDueno(info_pago.getCod_entrega());
                        membre2.actualizar_membresia(codigo_producto,info_pago.getNombre_cliente(),info_pago.getCorrreo_electronico()); 
                break;
            case 5:      Video video=new Video(codigo_producto,nombre_producto,"/@jdb.sfjcsl./",info_pago.getCod_entrega());
                         System.out.println("El video fue pagado satisfactoriamente");
                         if(nombre_producto.equalsIgnoreCase("Aprendiendo_a_eskiar"))
                         {
                             video.agregar_video(info_pago.getNombre_cliente());
                         }
                break;

        }
        System.out.println("Presione uno (1) para terminar:");
        seguir = entrada.nextInt();
    }
}
}
