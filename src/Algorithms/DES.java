/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Entity.DEMData;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class DES {
    
    private DEMData datas;

    public DES() {
        datas = new DEMData();
    }
    
    public void addYt(double yt){
        datas.getYt().add(yt);
    }
    
    public void addFt(double st){
        datas.getSt().add(st);
    }
    public void addBt(double bt){
        datas.getBt().add(bt);
    }
    
    public void addAlpha(double alpha){
        datas.setAlpha(alpha);
    }
    
    public void addGamma(double gamma){
        datas.setGamma(gamma);
    }
    
    public void compute() {
        ArrayList<Double> yt = datas.getYt();
        ArrayList<Double> bt = datas.getBt();
        ArrayList<Double> st = datas.getSt();
        double alpha = datas.getAlpha();
        double gamma = datas.getGamma();
        double invalpha = 1.0 - alpha;
        double invgamma = 1.0 - gamma;
        
        int n = yt.size();
        
        if(n > 1) {
            // inicializar
            st.add(yt.get(0));
            if(n >= 4) {
                bt.add(((yt.get(1) - yt.get(0)) + (yt.get(2) - yt.get(1)) + (yt.get(3) - yt.get(2))) / 3.0);
            } else {
                bt.add(yt.get(1) - yt.get(0));
            }

            // calcular ft y bt
            for(int i = 1; i < n; ++i) {
                st.add((alpha * yt.get(i)) + (invalpha * (st.get(i - 1) + bt.get(i - 1))));
                bt.add(((gamma * (st.get(i) - st.get(i - 1))) + ((invgamma) * bt.get(i - 1))));
            }
        }
    }
      
    public void forecast(int numPers) {
        ArrayList<Double> ft = datas.getFt();
        ArrayList<Double> bt = datas.getBt();
        ArrayList<Double> st = datas.getSt();
        
        int n = st.size();
        
        if(n > 0) {
            double stult = st.get(n - 1);
            double btult = bt.get(n - 1);
            
            ft.clear();
            for(int i = 1; i <= numPers;++i) {
                ft.add(stult + (btult * i));
                
                System.out.println("Ft " + i + ": " + ft.get(i - 1));
            }
        }
    }
}
