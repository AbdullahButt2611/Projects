/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import java.io.IOException;

/**
 *
 * @author DEll
 */
public class RecordDisplayForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form RecordDisplayForm
     */
    public RecordDisplayForm() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        recTxt.setText("IF you want Projects Record You forst Need to click on the Buttons\n\n           Employee Records\n\n"+MaxDesigns.getInstance().EmpRead());
        
        
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
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        drawBtn = new javax.swing.JButton();
        drawBtn1 = new javax.swing.JButton();
        recLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recTxt = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(941, 744));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setEnabled(false);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 78, 146));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 4, 40));

        drawBtn.setBackground(new java.awt.Color(0, 0, 0));
        drawBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        drawBtn.setForeground(new java.awt.Color(255, 255, 255));
        drawBtn.setText("Drawing Projects");
        drawBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        drawBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBtnActionPerformed(evt);
            }
        });

        drawBtn1.setBackground(new java.awt.Color(0, 0, 0));
        drawBtn1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        drawBtn1.setForeground(new java.awt.Color(255, 255, 255));
        drawBtn1.setText("Consultancy Projects");
        drawBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        drawBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drawBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(drawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(drawBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 100));

        recLabel.setBackground(new java.awt.Color(255, 255, 255));
        recLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        recLabel.setForeground(new java.awt.Color(255, 255, 255));
        recLabel.setText("Records");
        jPanel1.add(recLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        recTxt.setBackground(new java.awt.Color(0, 0, 102));
        recTxt.setColumns(20);
        recTxt.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        recTxt.setForeground(new java.awt.Color(255, 255, 255));
        recTxt.setRows(5);
        recTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jScrollPane1.setViewportView(recTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 790, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBtnActionPerformed
        // TODO add your handling code here:
        recTxt.setText("");
        recTxt.setText(MaxDesigns.getInstance().DrawRead());
        
    }//GEN-LAST:event_drawBtnActionPerformed

    private void drawBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBtn1ActionPerformed
        // TODO add your handling code here:
        recTxt.setText("");
        recTxt.setText(MaxDesigns.getInstance().ConRead());
    }//GEN-LAST:event_drawBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drawBtn;
    private javax.swing.JButton drawBtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel recLabel;
    private javax.swing.JTextArea recTxt;
    // End of variables declaration//GEN-END:variables
}
