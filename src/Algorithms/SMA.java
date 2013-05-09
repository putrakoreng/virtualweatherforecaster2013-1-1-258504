/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;

/**
 * Simple Moving Average algorithm
 * @author Grace
 */
public class SMA {
    
    private ArrayList<Double> input;
    private int n;
    private int m; // Number of days to forecast
    private static int DIV = 5;

    private ArrayList<Double> smaArray;
    private ArrayList<Double> output;
    private MAPE mape;

    public SMA(ArrayList<Double> input, int m) {
        this.input = input;
        n = input.size(); 
        this.m = m;
        smaArray = new ArrayList<Double>();
        output = new ArrayList<Double>();
        mape = new MAPE();
    }

     /**
      * SMA 
      * @return smaArray: Array containing the computed SMA over the input array
      */
    public ArrayList<Double> computeSMA(){
        double sum = 0;
        
        for(int i=0; i<n; i++){
            output.add(i,input.get(i));
        }
        for(int i=n; i<n+m; i++){
            output.add(i,-1.0);
        } 
        
        for(int i=0; i<DIV; i++){
            sum += output.get(i);
        }
        
        smaArray.add(sum/DIV);
        output.add(n, smaArray.get(0));
        for(int i=0; i<output.size(); i++){
            System.out.print(output.get(i) +" ");
        }
        
        for(int i=1; i<m; i++){
            sum -= output.get(i-1);
            sum += output.get(i+DIV-1);
            smaArray.add(i, sum/DIV);
            
            if(n+i < n+m){
                output.add(n+i, smaArray.get(i));
            }
        }
        
        System.out.print("smarray: ");
        for(int i=0; i<smaArray.size(); i++){
            System.out.print(smaArray.get(i) +" ");
        }
        
        System.out.print("aux: ");
        for(int i=0; i<output.size(); i++){
            System.out.print(output.get(i) +" ");
        }
        
        return smaArray;
    }
    
    public ArrayList<Double> getSmaArray() {
        return smaArray;
    }

    public ArrayList<Double> getOutput() {
        return output;
    }
    
    public double getMAPE() {
        return mape.calculate(input, output);
    }
}

