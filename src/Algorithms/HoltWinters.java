/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Santiniet and Daniel
 */
public class HoltWinters {

    ArrayList<Double> data = new ArrayList<Double>();
    ArrayList<Double> A = new ArrayList<Double>();
    ArrayList<Double> B = new ArrayList<Double>();
    ArrayList<Double> C= new ArrayList<Double>();
    ArrayList<Double> F = new ArrayList<Double>();
    
    
    final double alpha=0.5;
    final double beta=0.5;
    final double gamma=0.5;
    
    public HoltWinters(ArrayList<Double> data) {
        this.data=data;
        }
    
    public ArrayList<Double> holtwinter(ArrayList<Double> data, int m){
        
        int t= data.size();
        int l=2;
        int N=t/l;
        
        double ci, aj;
        //Se inicializan los arreglos para operaciones
        A.add(data.get(0));
        B.add((((data.get(l+1)-data.get(1))/l)+ ((data.get(l+2)-data.get(2))/l))/l);
        for(int i = 1;i <= l; ++i) {
            ci = 0;
            for(int j = 1; j <= N; ++j) {
                
            }
        }
        
        //Se inicializan los primeros datos del arreglo
        for (int i=1; i<t; i++){
            //A[i]= (alpha*data.get(i))+((1-alpha)*(A[i-1]+B[i-1]));
            A.add(i, (alpha*data.get(i))+((1-alpha)*(A.get(i-1)+B.get(i-1))));
            //B[i]= (beta*(A[i]-A[i-1]))+((1-beta)*B[i-1]);
            B.add(i, (beta*(A.get(i)-A.get(i-1)))+((1-beta)*B.get(i-1)));
            
            //F[i]= A[i]+B[i];
        }
        
        
        return F;
    }
    
    
}
