/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

import java.util.ArrayList;

/**
 *
 * @author Dismaelectric
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int tel;
    private ArrayList<Producto> producto;

    public Cliente(String nombre, String apellido, int tel, ArrayList<Producto> producto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.producto = producto;
    }
    public Cliente() {
        this.nombre = null;
        this.apellido = null;
        this.tel = 0;
        this.producto = null;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
   
   public void Factura(){
        Cliente c = new Cliente();
        
        System.out.println("-----FACTURA-----");
        System.out.println(c.getNombre()+" "+c.getApellido());
        
    }
    
    
}
