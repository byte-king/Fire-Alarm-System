/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fire_alarm_system;
/**
 *
 * @author HP
 */

import static com.mycompany.fire_alarm_system.MainScreen.f0;
import static com.mycompany.fire_alarm_system.MainScreen.f1;
import static com.mycompany.fire_alarm_system.MainScreen.f2;
import static com.mycompany.fire_alarm_system.MainScreen.f3;
import static com.mycompany.fire_alarm_system.MainScreen.f4;
import static com.mycompany.fire_alarm_system.MainScreen.f5;
import java.util.Map.Entry;
import javax.swing.*; 
public class Register_a_sensor extends javax.swing.JFrame {

    /**
     * Creates new form Register_a_sensor
     */
    public Register_a_sensor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sensor ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sensor Type:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Floor No:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Install Location:");

        jTextField1.setBackground(new java.awt.Color(108, 120, 137));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(228, 241, 254));
        jTextField1.setOpaque(false);

        jComboBox1.setBackground(new java.awt.Color(108, 120, 137));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CO Sensor", "Heat Sensor", "Smoke Sensor" }));
        jComboBox1.setToolTipText("Choose sensor type");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setName(""); // NOI18N
        jComboBox1.setOpaque(false);

        jTextField2.setBackground(new java.awt.Color(108, 120, 137));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(228, 241, 254));
        jTextField2.setOpaque(false);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register a Sensor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(0, 119, 182));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Save");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(108, 120, 137));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6", "Lab 1", "Lab 2", "Stairs 1", "Stairs 2", "Hall" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(jTextField2))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jComboBox1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ActionListener for canceling the registration and directing to MainScreen window.
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        MainScreen.dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked
    //ActionListener for saving data of registered sensor and directing to MainScreen window.
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        int flag=0;
        for(Entry<String,Location> mp : f3.entrySet()){
            if(mp.getValue().Cid.equals(jTextField1.getText())||mp.getValue().Hid.equals(jTextField1.getText())||mp.getValue().Sid.equals(jTextField1.getText()))
                flag++;
        }
        for(Entry<String,Location> mp : f1.entrySet()){
            if(mp.getValue().Cid.equals(jTextField1.getText())||mp.getValue().Hid.equals(jTextField1.getText())||mp.getValue().Sid.equals(jTextField1.getText()))
                flag++;
        }
        for(Entry<String,Location> mp : f2.entrySet()){
            if(mp.getValue().Cid.equals(jTextField1.getText())||mp.getValue().Hid.equals(jTextField1.getText())||mp.getValue().Sid.equals(jTextField1.getText()))
                flag++;
        }
        for(Entry<String,Location> mp : f3.entrySet()){
            if(mp.getValue().Cid.equals(jTextField1.getText())||mp.getValue().Hid.equals(jTextField1.getText())||mp.getValue().Sid.equals(jTextField1.getText()))
                flag++;
        }
        for(Entry<String,Location> mp : f4.entrySet()){
            if(mp.getValue().Cid.equals(jTextField1.getText())||mp.getValue().Hid.equals(jTextField1.getText())||mp.getValue().Sid.equals(jTextField1.getText()))
                flag++;
        }
        for(Entry<String,Location> mp : f5.entrySet()){
            if(mp.getValue().Cid.equals(jTextField1.getText())||mp.getValue().Hid.equals(jTextField1.getText())||mp.getValue().Sid.equals(jTextField1.getText()))
                flag++;
        }
        
        if((!jTextField2.getText().matches("[0-5]$"))){    
             flag=flag+2;
        }
        if("".equals(jTextField1.getText())){
            flag+=4;
        }
        
        switch(flag){
            case 1:
                JOptionPane.showMessageDialog(this,"Entered Sensor ID already used!");
                Register_a_sensor R2 = new Register_a_sensor();
                R2.setVisible(true);
                this.dispose();
                break;
            case 2:
                JOptionPane.showMessageDialog(this,"Entered floor doesn't exist in CC3!");
                Register_a_sensor R3 = new Register_a_sensor();
                R3.setVisible(true);
                this.dispose();
                break;
            case 3:
                JOptionPane.showMessageDialog(this,"Entered Sensor ID already used and entered floor doesn't exist in CC3!");
                Register_a_sensor R4 = new Register_a_sensor();
                R4.setVisible(true);
                this.dispose();
                break;
            case 4:
                JOptionPane.showMessageDialog(this,"Sensor ID can't be left blank!");
                Register_a_sensor R5 = new Register_a_sensor();
                R5.setVisible(true);
                this.dispose();
                break;
            case 6:
                JOptionPane.showMessageDialog(this,"Sensor ID can't be left blank and entered floor doesn't exist in CC3!");
                Register_a_sensor R6 = new Register_a_sensor();
                R6.setVisible(true);
                this.dispose();
                break;
            case 0:
            {
                Sensor s1 = new Sensor();

                s1.SensorID = jTextField1.getText();
                s1.floorno = Integer.parseInt(jTextField2.getText());
                s1.location = jComboBox2.getSelectedItem().toString();
                s1.SensorType =  jComboBox1.getSelectedItem().toString();  
                
                Location L=new Location();             
                switch(s1.SensorType){
                    case "Smoke Sensor":
                        L.Sid=s1.SensorID;
                        break;
                    case "Heat Sensor":
                        L.Hid=s1.SensorID;
                        break;
                    case "CO Sensor":
                        L.Cid=s1.SensorID;
                        break;
                }
                        
                switch(s1.floorno){
                    case 0:
                        if(f0.containsKey(s1.location)){
                            switch(s1.SensorType){
                                case "Smoke Sensor":
                                    f0.get(s1.location).Sid=s1.SensorID;
                                    break;
                                case "Heat Sensor":
                                    f0.get(s1.location).Hid=s1.SensorID;
                                    break;
                                case "CO Sensor":
                                    f0.get(s1.location).Cid=s1.SensorID;
                                    break;
                            }
                                    }
                        else
                            f0.put(s1.location, L);
                        break;
                    case 1:
                        if(f1.containsKey(s1.location)){
                            switch(s1.SensorType){
                                case "Smoke Sensor":
                                    f1.get(s1.location).Sid=s1.SensorID;
                                    break;
                                case "Heat Sensor":
                                    f1.get(s1.location).Hid=s1.SensorID;
                                    break;
                                case "CO Sensor":
                                    f1.get(s1.location).Cid=s1.SensorID;
                                    break;
                            }
                                    }
                        else
                            f1.put(s1.location, L);
                        break;
                    case 2:
                        if(f2.containsKey(s1.location)){
                            switch(s1.SensorType){
                                case "Smoke Sensor":
                                    f2.get(s1.location).Sid=s1.SensorID;
                                    break;
                                case "Heat Sensor":
                                    f2.get(s1.location).Hid=s1.SensorID;
                                    break;
                                case "CO Sensor":
                                    f2.get(s1.location).Cid=s1.SensorID;
                                    break;
                            }
                                    }
                        else
                            f2.put(s1.location, L);
                        break;
                    case 3:
                        if(f3.containsKey(s1.location)){
                            switch(s1.SensorType){
                                case "Smoke Sensor":
                                    f3.get(s1.location).Sid=s1.SensorID;
                                    break;
                                case "Heat Sensor":
                                    f3.get(s1.location).Hid=s1.SensorID;
                                    break;
                                case "CO Sensor":
                                    f3.get(s1.location).Cid=s1.SensorID;
                                    break;
                            }
                                    }
                        else
                            f3.put(s1.location, L);
                        break;
                    case 4:
                        if(f4.containsKey(s1.location)){
                            switch(s1.SensorType){
                                case "Smoke Sensor":
                                    f4.get(s1.location).Sid=s1.SensorID;
                                    break;
                                case "Heat Sensor":
                                    f4.get(s1.location).Hid=s1.SensorID;
                                    break;
                                case "CO Sensor":
                                    f4.get(s1.location).Cid=s1.SensorID;
                                    break;
                            }
                                    }
                        else
                            f4.put(s1.location, L);
                        break;
                    case 5:
                        if(f5.containsKey(s1.location)){
                            switch(s1.SensorType){
                                case "Smoke Sensor":
                                    f5.get(s1.location).Sid=s1.SensorID;
                                    break;
                                case "Heat Sensor":
                                    f5.get(s1.location).Hid=s1.SensorID;
                                    break;
                                case "CO Sensor":
                                    f5.get(s1.location).Cid=s1.SensorID;
                                    break;
                            }
                                    }
                        else
                            f5.put(s1.location, L);
                        break;
                }
                
                JOptionPane.showMessageDialog(this,"Sensor Registered.");
                Register_a_sensor R=new Register_a_sensor();
                R.setVisible(true);
                this.dispose();
                break;
        }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register_a_sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_a_sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_a_sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_a_sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_a_sensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
