/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicando;

import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class RegistroClimatico {
    
    private final double[] temperaturas;
    private int diasRegistrados;
    
    public RegistroClimatico(){
        temperaturas = new double[32];
        diasRegistrados = 0;  
    }
    
    public void agregarTemperatura(){
        String continuar = "si" ;
        double temp;
        
        while(continuar.equalsIgnoreCase("si")) {
            
            if(diasRegistrados < 32){
                temp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura: "));
                temperaturas[diasRegistrados] = temp;
                diasRegistrados ++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Error. El limite es 31");
            }
            continuar = JOptionPane.showInputDialog("Desea continuar (si/no): ");
        }    
    }
    
    public void obtenerPromedio(){
        double suma = 0;
        double promedio;
        for(int i = 0; i < diasRegistrados; i ++){
            suma += temperaturas[i];

        }
       promedio = suma / diasRegistrados;
       JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
    
    public void obtenerMaxima(){
        double maximo = temperaturas[0];
        for(int i = 1; i < diasRegistrados; i ++){
            if(temperaturas[i] > maximo){
                maximo = temperaturas[i];
            }  
        } 
        JOptionPane.showMessageDialog(null, "El maximo es: " + maximo);
        
    }
    public void obtenerMinima(){
        double minimo = temperaturas[0];
        for(int i = 1; i < diasRegistrados; i ++){
            if(temperaturas[i] < minimo) {
                minimo = temperaturas[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El minimo es: " + minimo);
    }
}

