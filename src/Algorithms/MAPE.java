/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Santiniet
 */
public class MAPE {
    
    public void MAPE() {}
    
    public double compute(ArrayList<Double> yt, ArrayList<Double> ft) {
        double m = 0.0;
        int n = Math.min(yt.size(), ft.size());
        
        for(int i = 0; i < n; ++i) {
            m += Math.abs((yt.get(i) - ft.get(i)) / yt.get(i));
        }
        
        m /= (double) n;
        return m;
    }
    
}
