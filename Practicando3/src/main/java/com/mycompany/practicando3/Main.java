/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicando3;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Main {

    public static void main(String[] args) {
        
        String continuar = "si" ;
        int cantidad;
        int contador = 1;
        
        Biblioteca a = new Biblioteca();
       
        while("si".equals(continuar)){
            
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad el dia " + contador + " :"));
            a.agregarPrestamoDia(cantidad);
            contador ++;
            continuar = JOptionPane.showInputDialog("Desea continuar (si/no): ").toLowerCase();    
        }
        
        double suma = a.obtenerTotalPrestamos();
        JOptionPane.showMessageDialog(null, "El total de prestamos es de: " + suma );
        
        double promedio = a.obtenerPromedioPrestamos();
        JOptionPane.showMessageDialog(null, "El promedio de los prestamos es de: " + promedio);
        
       int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar estaneria \n2. Ocupar espacio\n3. Contar epacios \n4. Salir"));
       
       while(opcion != 4){
           
           switch(opcion){
               
               case 1 -> a.mostrarEstanterias();
               
               case 2 -> { 
                   int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna: "));
                   int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila: "));
                   a.ocuparEspacio(fila, columna);
                }
                   
               case 3 -> a.contarEspaciosLibres();
           }

           opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar estaneria \n2. Ocupar espacio\n3. Contar epacios \n4. Salir"));
       }  
    }
}
