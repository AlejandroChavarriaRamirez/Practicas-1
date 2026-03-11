/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicando3;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Biblioteca {
    private final int[] prestamosDiarios; // capacidad para 7 dias
    private int diasRegistrados;
    private final int[][] estanteria; // 0 -> espacio libre y 1 -> espacio ocupado
    
    public Biblioteca(){
        
        prestamosDiarios = new int[7];
        estanteria = new int[3][3]; //primero las columnas y despues las fila
        diasRegistrados = 0;
        
        //Rellenar la matriz con 0
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               estanteria[i][j] = 0;
            }
        }
        
    }
    
    public void agregarPrestamoDia(int cantidad){
        
        if(diasRegistrados < 7){
           prestamosDiarios[diasRegistrados] = cantidad;
           diasRegistrados++;
           
        }else{
            JOptionPane.showMessageDialog(null, "Error. El limite es 7");
        }
    }
    
    public double obtenerTotalPrestamos (){
    
        double suma = 0;
        
        for(int i = 0; i < 7; i++){
            
            suma += prestamosDiarios[i];
        }
        
        return suma; 
    }
    
    public double obtenerPromedioPrestamos(){
        double suma = 0;
        double promedio;
        
        for(int i = 0; i < 7; i++){
            
            suma += prestamosDiarios[i];
        }
        
        promedio = suma/diasRegistrados;
        
        return promedio;
        
    }
    
    public void ocuparEspacio(int fila, int columna){
        
       if (fila > 2 || fila  < 0 || columna > 2 || columna < 0){
           JOptionPane.showMessageDialog(null, "Error. Valor fuera de rango");
        }
       else{
            if (estanteria[fila][columna] == 0) {
                estanteria[fila][columna] = 1;
                JOptionPane.showMessageDialog(null, "Espacio ocupado con exito");
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error. Ese espacio ya esta ocupado");      
            } 
        }
       
    }
    
    public void mostrarEstanterias(){
        String resultado = "";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(estanteria[i][j] == 0){
                    resultado +=  "L ";
                }else {
                        
                resultado += "X ";
                
                }
            }
            resultado += "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public void contarEspaciosLibres(){
        int contador = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(estanteria[i][j] == 0){
                    contador++;      
                }
            } 
        }
        JOptionPane.showMessageDialog(null, "Espacios libres: " + contador);
    }
}
