/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Algorithms.*;
import sun.security.krb5.internal.crypto.Des;
/**
 *
 * @author Daniel
 */
public class forecasterGUI extends javax.swing.JFrame {

    /**
     * Creates new form forecasterGUI
     */
    
    ArrayList<Double> data = new ArrayList<Double>();
    int forecastValue;
  
    
    public forecasterGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        forecastTextField.setText("5");
        weatherTextField.setText("Input weather value");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        weatherTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        forecastTextField = new javax.swing.JTextField();
        addWeaterButton = new javax.swing.JButton();
        deleteLastWeatherButton = new javax.swing.JButton();
        deleteAllWeatherButton = new javax.swing.JButton();
        forecastButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather Forecaster");

        jLabel1.setText("Values to forecast");

        weatherTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Weather report");

        forecastTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forecastTextFieldActionPerformed(evt);
            }
        });

        addWeaterButton.setText("Add");
        addWeaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWeaterButtonActionPerformed(evt);
            }
        });

        deleteLastWeatherButton.setText("Delete Last");
        deleteLastWeatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLastWeatherButtonActionPerformed(evt);
            }
        });

        deleteAllWeatherButton.setText("Delete All");
        deleteAllWeatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllWeatherButtonActionPerformed(evt);
            }
        });

        forecastButton.setText("Forecast");
        forecastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forecastButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Current data:\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(addWeaterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteLastWeatherButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteAllWeatherButton)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(forecastButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weatherTextField)
                            .addComponent(forecastTextField)))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weatherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(forecastTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addWeaterButton)
                    .addComponent(deleteLastWeatherButton)
                    .addComponent(deleteAllWeatherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forecastButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void weatherTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weatherTextFieldActionPerformed

    private void forecastTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forecastTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forecastTextFieldActionPerformed

    private void addWeaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWeaterButtonActionPerformed
try{
        jTextArea1.setText("");
        data.add(Double.parseDouble(weatherTextField.getText().toString()));
        jTextArea1.append("Datos Actuales: "+data);
        System.out.println(data);
    
}catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, "The weather data must be a number", "Error", JOptionPane.ERROR_MESSAGE);
}

       // jTextArea1.append(singleValueTF.getText()+"\n");
        // TODO add your handling code here:
    }//GEN-LAST:event_addWeaterButtonActionPerformed

    private void deleteLastWeatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLastWeatherButtonActionPerformed

        jTextArea1.setText("");
        data.remove(data.size()-1);
        jTextArea1.append("Datos Actuales: "+data);
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteLastWeatherButtonActionPerformed

    private void deleteAllWeatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllWeatherButtonActionPerformed

        jTextArea1.setText("");
        data.clear();
        jTextArea1.append("Datos Actuales: [Vacio]");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAllWeatherButtonActionPerformed

    private void forecastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forecastButtonActionPerformed
try{
    forecastValue =Integer.parseInt(forecastTextField.getText());
}catch(Exception e){
    JOptionPane.showMessageDialog(rootPane, "The forecast value must be a entire number", "Error", JOptionPane.ERROR_MESSAGE);
}

if(forecastValue>5){

    if(!data.isEmpty()){
    /*
HoltWinters holt = new HoltWinters(data);
System.out.println("inicia");
System.out.println(holt.holtwinter(data));
System.out.println("funciona");
*/

//Des Implementation
DES des = new DES();
    des.addYt(data);
    des.addAlpha(0.3623);
    des.addGamma(1);
    des.compute();
    jTextArea1.append("\nPredictions by DES "+des.forecast(forecastValue).toString());
 //Finish DES implementation
    
 //ES implementation   
 ES es = new ES();
 jTextArea1.append("\nPredictions by ES "+es.ESmoothing(data, forecastValue).toString());
 //finish ES implementation
 
 // SMA implementation
 SMA sma = new SMA(data, forecastValue);
 jTextArea1.append("\nPredictions by SMA "+sma.computeSMA());
 //finish SMA implementation
  // SMA implementation
 DMA dma = new DMA(data, forecastValue);
 jTextArea1.append("\nPredictions by DMA "+dma.computeDMA());
 //finish SMA implementation
        // TODO add your handling code here:
    } else JOptionPane.showMessageDialog(rootPane, "The forecast value must be minimun 5", "Error", JOptionPane.ERROR_MESSAGE);
  
}
else JOptionPane.showMessageDialog(rootPane, "There's no weather data to forecast!", "Error", JOptionPane.ERROR_MESSAGE);
   
    
    }//GEN-LAST:event_forecastButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forecasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forecasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forecasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forecasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forecasterGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addWeaterButton;
    private javax.swing.JButton deleteAllWeatherButton;
    private javax.swing.JButton deleteLastWeatherButton;
    private javax.swing.JButton forecastButton;
    private javax.swing.JTextField forecastTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField weatherTextField;
    // End of variables declaration//GEN-END:variables
}
