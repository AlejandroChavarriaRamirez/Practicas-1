/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicando2;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class SalaCine {
    
    private final int[][] sala;
    
    public SalaCine() {
        sala = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                sala[i][j] = 0;
                
            }      
        }
    }
    
    public void mostraCartelera(){
        
        String resultado = "";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(sala[i][j] == 0){
                    resultado +=  "L ";
                }else {
                        
                resultado += "X ";
                
                }
            }
            //resultado += "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void reservarAsiento(int fila, int columna){
  
        if (fila > 4 || fila  < 0 || columna > 4 || columna < 0){
            JOptionPane.showMessageDialog(null, "Error. Valor fuera de rango");
        }
        else{
            if (sala[fila][columna] == 0) {
                sala[fila][columna] = 1;
                JOptionPane.showMessageDialog(null, "Reserva exitosa");
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error. El asciento esta ocupado");      
            } 
        } 
    }
    
    public void contarAsientosDisponible(){
        int contador = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(sala[i][j] == 0){
                    contador++;
                    
                }
            } 
        }
        JOptionPane.showMessageDialog(null, "Ascientos disponible: " + contador);
    }
}