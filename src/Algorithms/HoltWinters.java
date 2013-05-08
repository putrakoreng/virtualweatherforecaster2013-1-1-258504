/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author Santiniet
 */
public class HoltWinters {
    
    public double[] holtwinter(double[] data, double alpha, double beta){
        int t= data.length;
        double[] A= null;
        double[] B= null;
        double[] F= null;
        //Se inicializan los arreglos para operaciones
        A[0]=data[0];
        B[0]= data[1]-data[0];
        //Se inicializan los primeros datos del arreglo
        for (int i=1; i<t; i++){
            A[i]= (alpha*data[i])+((1-alpha)*(A[i-1]+B[i-1]));
            B[i]= (beta*(A[i]-A[i-1]))+((1-beta)*B[i-1]);
            F[i]= A[i]+B[i];
        }
        
        
        return F;
    }
    
    
}
