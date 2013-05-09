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
        
    ArrayList<Double> S = new ArrayList<Double>();
    ArrayList<Double> ESmoothing = new ArrayList<Double>();
    double alpha = 0.5;
    int forecastValue;
    
//    public ES(ArrayList<Double> ESmoothing, int forecastValue) {
//        this.ESmoothing = ESmoothing;
//        this.forecastValue = forecastValue;
//    }
//    
    public ES() {
        }
    
       
    public ArrayList<Double> ESmoothing(ArrayList <Double> input, int forecastValue){
        
        //int t= input.size();
        
       //Se inicializan los arreglos para operaciones
        S.add(input.get(0));
        //Se inicializan los primeros datos del arreglo
        for (int i=1; i<=forecastValue; i++){
            
            S.add(S.get(i - 1) + alpha*(input.get(i - 1) - S.get(i - 1)));
            System.out.println(S.get(i));
        }
                
        S.remove(0);
        return S;
    }
    
}
