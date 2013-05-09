/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.	
 */
package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ES {
        
    ArrayList<Double> S= new ArrayList<Double>();
     
       
    public ArrayList<Double> ESmoothing(ArrayList <Double> input, double alpha){
        
        int t= input.size();
        
       //Se inicializan los arreglos para operaciones
        S.add(1, input.get(0));
        //Se inicializan los primeros datos del arreglo
        for (int i=1; i<=t; i++){
            
            S.add(i+1, S.get(i)+alpha*(input.get(i)-S.get(i)));
           
        }
                
        return S;
    }
    
}
