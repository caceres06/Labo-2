/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dismaelectric
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int tel;
    ArrayList<Producto> producto;

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
    
    public void Ingresar(){
        Cliente c = new Cliente();
        Scanner key = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        c.setNombre(key.nextLine());
        System.out.println("Ingrese apellido");
        c.setApellido(key.nextLine());
        System.out.println("Ingrese su telefono");
        c.setTel(key.nextInt());   
        ArrayList<Producto> pro= new ArrayList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Ingrese nombre del producto");
            String nombrepro= sc.nextLine();
            System.out.println("Ingrese tipo del producto");
            String tipopro= sc.nextLine();
            System.out.println("Ingrese precio del producto");
            float preciopro= sc.nextFloat();
            System.out.println("Ingrese cantidad del producto");
            int cantpro= sc.nextInt();
            sc.nextLine();
            
            pro.add(new Producto(nombrepro,tipopro,preciopro,cantpro));
            
            System.out.println("¿Desea continuar?");
            System.out.println("Ingrese 1 para continuar");
            System.out.println("Ingrese 2 para salir");
            int aux=sc.nextInt();
            sc.nextLine();
            if(aux==2){
                flag=false;
            }
        }while(flag);
        c.setProducto(pro);
    }
    public void ListaProducto(Cliente c){
        
        for(int i=0;i<c.getProducto().size();i++){
            System.out.println(c.getProducto().get(i).getNombre());
        }
    }
    public float TotalPagar(Cliente c){
        float total = 0;
        for(int i=0;i<c.getProducto().size();i++){
            total=c.getProducto().get(i).getPrecio();
            total+=total;
        }
        System.out.println("El total a pagar es:");
        return total;
    }
    public void Factura(Cliente c){
        float tot= TotalPagar(c);
        Calendar fecha;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        fecha= Calendar.getInstance();
        
         System.out.println("---Factura---");
         System.out.println(c.getNombre()+" "+c.getApellido());
         System.out.println(fecha);
         float subtotal;
          for(int i=0;i<c.getProducto().size();i++){
           
            System.out.println(c.getProducto().get(i).getNombre()+"       "+c.getProducto().get(i).getTipo()
            +"     "+c.getProducto().get(i).getCantidad());
        }
          System.out.println("                    total:"+tot);
    }
}