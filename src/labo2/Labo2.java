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
        boolean bandera = true;
        int aux;
        System.out.println("Seleccion una opción");
        System.out.println("1.Ingresar prodcutos:");
        System.out.println("2.Listar productos");
        System.out.println("3.Calcular el total a pagar:");
        System.out.println("4.Generar Factura:");
        System.out.println("5. Salir");
        aux= key.nextInt();
        
            switch(aux){
                case 1:
                    c.Ingresar();
                    break;
                case 2:
                    c.ListaProducto(c);
                    break;
                case 3:
                    c.TotalPagar(c);
                    break;
                case 4:
                    c.Factura(c);
                    break;
                case 5:
                    break;
        }
 }
}
