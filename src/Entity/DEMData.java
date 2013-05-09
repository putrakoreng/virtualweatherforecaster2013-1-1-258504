/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class DEMData {
    
    private ArrayList<Double> yt;
    private ArrayList<Double> ft;
    private ArrayList<Double> bt;
    private ArrayList<Double> st;
    private double alpha;
    private double gamma;

    public DEMData() {
        yt = new ArrayList<Double>();
        ft = new ArrayList<Double>();
        bt = new ArrayList<Double>();
        st = new ArrayList<Double>();
        alpha = 0;
        gamma = 0;
    }

    public ArrayList<Double> getYt() {
        return yt;
    }

    public void setYt(ArrayList<Double> yt) {
        this.yt = yt;
    }

    public ArrayList<Double> getFt() {
        return ft;
    }

    public void setFt(ArrayList<Double> ft) {
        this.ft = ft;
    }

    public ArrayList<Double> getBt() {
        return bt;
    }

    public void setBt(ArrayList<Double> bt) {
        this.bt = bt;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }

    public ArrayList<Double> getSt() {
        return st;
    }

    public void setSt(ArrayList<Double> st) {
        this.st = st;
    }
   
    
}
