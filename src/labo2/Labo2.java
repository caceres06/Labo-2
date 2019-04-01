/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

import java.util.Scanner;

/**
 *
 * @author Dismaelectric
 */
public class Labo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Scanner key = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        c.setNombre(key.nextLine());
        System.out.println("Ingrese apellido");
        c.setApellido(key.nextLine());
        System.out.println("Ingrese su telefono");
        c.setTel(key.nextInt());       
        int aux=0;
        System.out.println("Seleccion una opción");
        System.out.println("1.Ingresar prodcutos:");
        System.out.println("2.Listar productos");
        System.out.println("3.Calcular el total a pagar:");
        System.out.println("4.Generar Factura:");
        System.out.println("5. Salir");
        switch(aux){
            case 1:
                IngresoProducto();
                break;
            case 2:
                ListarProducto();
                break;
            case 3:
                TotalPagar();
                break;
            case 4:
                Factura();
                break;
            case 5:
                break;
        }
        
    }

    private static void Factura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void TotalPagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ListarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void IngresoProducto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
 }

