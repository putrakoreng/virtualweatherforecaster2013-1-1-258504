/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;

/**
 * Double Moving Average algorithm implementation
 * @author Grace
 */
public class DMA {    
    private ArrayList<Double> input;
    private ArrayList<Double> firstSmaArray;
    private ArrayList<Double> secondSmaArray;
    private ArrayList<Double> output;
    private int n;
    private int m; // Number of days to forecast
    private static int DIV = 5;
    private MAPE mape;

    public DMA(ArrayList<Double> input, int m) {
        this.input = input;
        output = new ArrayList<Double>();
        n = input.size(); 
        this.m = m;
        
        SMA firstSma = new SMA(input,m);
        firstSmaArray = firstSma.computeSMA();
        mape = new MAPE();
    }
    
    public ArrayList<Double> computeDMA(){
        
        SMA secondSma = new SMA(firstSmaArray,m);
        secondSmaArray = secondSma.computeSMA();
        
        for(int i=0; i<n; i++){
            output.add(i,input.get(i));
        }
        
        for(int i=n; i<n+m; i++){
            output.add(i,secondSmaArray.get(i-n));
        }
        
        return secondSmaArray;
    }

    public ArrayList<Double> getDmaArray() {
        return secondSmaArray;
    }

    public ArrayList<Double> getOutput() {
        return output;
    }
    
    public double getMAPE() {
        return mape.compute(input, output);
    }
   
}
