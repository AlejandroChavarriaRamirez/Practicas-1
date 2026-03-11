/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicando2;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class MAIN {

    public static void main(String[] args) {
        
        SalaCine a = new SalaCine();
        
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Ver ascientos libres\n2. Registrar ascientos\n3. Ver cuantos quedan libres\n4. Salir"));
        
        while (opcion != 4){
            
            switch (opcion){
                
                case 1 -> a.mostraCartelera();
                case 2 -> {
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna: "));
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila: "));
                    a.reservarAsiento(fila, columna);
                }
                case 3 -> a.contarAsientosDisponible();

            }    
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Ver ascientos libres\n2. Registrar ascientos\n3. Ver cuantos quedan libres\n4. Salir"));
        }
        
        JOptionPane.showMessageDialog(null, "Se termino el programa");
    }
}
