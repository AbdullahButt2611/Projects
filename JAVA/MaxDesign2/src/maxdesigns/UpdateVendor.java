/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author DEll
 */
public class UpdateVendor extends javax.swing.JInternalFrame {

    public String text= "";
    int index = -1;
    
    /**
     * Creates new form UpdateVendor
     */
    public UpdateVendor() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        compTxt.setEnabled(false);
        amountTxt.setEnabled(false);
        contactTxt.setEnabled(false);
        TypeBox.setEnabled(false);
        shareTxt.setEnabled(false);
        upBtn.setEnabled(false);
    }
    
    public String fileData(int index)
    {
        String s = "\n\n*****************************************************************************\n";
               s += "                               UPDATE VENDOR\n";
               s += "____________________________________________________________________________\n";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now(); 
               s += "Date/Time : "+dtf.format(now)+"                        Umair Umar | Administrator\n\n";
               s += "Account Details to be Updated. .................................. \n\n";
               s += "Vendor Name : "+MaxDesigns.getInstance().getVen().get(index).getCompany()+" ( "+MaxDesigns.getInstance().getVen().get(index).getId()+" )\n";
               s += "Owner Name : "+MaxDesigns.getInstance().getVen().get(index).getOwner()+"\n";
               s += "Balance : "+MaxDesigns.getInstance().getVen().get(index).getBalance()+"\n\n\n";
               s += "                                                 MAX DESIGNS\n";
               s += "__________________________________________________________________________________________\n";
               return s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        vendorTxt = new javax.swing.JTextField();
        srchBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        compTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        invalidCompany = new javax.swing.JLabel();
        invalidOwner = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        invalidContact = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TypeBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        shareTxt = new javax.swing.JTextField();
        invalidShare = new javax.swing.JLabel();
        upBtn = new com.k33ptoo.components.KButton();

        setPreferredSize(new java.awt.Dimension(920, 787));

        kGradientPanel1.setkEndColor(new java.awt.Color(24, 24, 24));
        kGradientPanel1.setkStartColor(new java.awt.Color(186, 139, 2));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/watermark.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Update Vendor");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Vendor Name :");

        vendorTxt.setBackground(new java.awt.Color(212, 209, 209));
        vendorTxt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        vendorTxt.setForeground(new java.awt.Color(51, 0, 51));
        vendorTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        vendorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorTxtActionPerformed(evt);
            }
        });

        srchBtn.setBackground(new java.awt.Color(255, 153, 0));
        srchBtn.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        srchBtn.setForeground(new java.awt.Color(255, 255, 255));
        srchBtn.setText("Search");
        srchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 3));
        srchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(212, 209, 209));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Co. Name :");

        compTxt.setBackground(new java.awt.Color(212, 209, 209));
        compTxt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        compTxt.setForeground(new java.awt.Color(51, 0, 51));
        compTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        compTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText(" Owner Name :");

        amountTxt.setBackground(new java.awt.Color(212, 209, 209));
        amountTxt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(51, 0, 51));
        amountTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });

        invalidCompany.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invalidCompany.setForeground(new java.awt.Color(153, 0, 0));

        invalidOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invalidOwner.setForeground(new java.awt.Color(153, 0, 0));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Contact :");

        contactTxt.setBackground(new java.awt.Color(212, 209, 209));
        contactTxt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        contactTxt.setForeground(new java.awt.Color(51, 0, 51));
        contactTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        contactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTxtActionPerformed(evt);
            }
        });

        invalidContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invalidContact.setForeground(new java.awt.Color(153, 0, 0));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Type :");

        TypeBox.setBackground(new java.awt.Color(212, 209, 209));
        TypeBox.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        TypeBox.setForeground(new java.awt.Color(51, 0, 51));
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Furniture", "Light", "Paint", "Raw Material", "Electrical", "Metal", "Wood", "Gas", "Marble", "Bricks" }));
        TypeBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(51, 0, 51)));
        TypeBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Share % :");

        shareTxt.setBackground(new java.awt.Color(212, 209, 209));
        shareTxt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        shareTxt.setForeground(new java.awt.Color(51, 0, 51));
        shareTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        shareTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareTxtActionPerformed(evt);
            }
        });

        invalidShare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invalidShare.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidShare, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidContact, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shareTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shareTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invalidShare, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        upBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        upBtn.setText("UPDATE");
        upBtn.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        upBtn.setkEndColor(new java.awt.Color(24, 24, 24));
        upBtn.setkHoverEndColor(new java.awt.Color(102, 0, 0));
        upBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        upBtn.setkHoverStartColor(new java.awt.Color(0, 0, 153));
        upBtn.setkStartColor(new java.awt.Color(186, 139, 2));
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(srchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vendorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 164, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(160, 160, 160))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(srchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorTxtActionPerformed

    private void compTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compTxtActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtActionPerformed

    private void contactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTxtActionPerformed

    private void shareTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shareTxtActionPerformed

    private void srchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchBtnActionPerformed
        // TODO add your handling code here:
        
        for(int i = 0;i<MaxDesigns.getInstance().getVen().size();i++)
        {
            if(MaxDesigns.getInstance().getVen().get(i).getCompany().equals(vendorTxt.getText()))
            {
                index = i;
                this.text = fileData(index);
                break;
            }
            else
                index  = -1;
        }
        if(index  == -1)
        {
            JOptionPane.showMessageDialog(this,"The Name not Found","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            vendorTxt.setEnabled(false);
            srchBtn.setEnabled(false);
            compTxt.setEnabled(true);
            amountTxt.setEnabled(true);
            contactTxt.setEnabled(true);
            TypeBox.setEnabled(true);
            shareTxt.setEnabled(true);
            upBtn.setEnabled(true);
            compTxt.setText(MaxDesigns.getInstance().getVen().get(index).getCompany());
            amountTxt.setText(MaxDesigns.getInstance().getVen().get(index).getOwner());
            contactTxt.setText(MaxDesigns.getInstance().getVen().get(index).getContact());
            TypeBox.setSelectedItem(MaxDesigns.getInstance().getVen().get(index).getType());
            shareTxt.setText(MaxDesigns.getInstance().getVen().get(index).getSharePer()+"");
        }
    }//GEN-LAST:event_srchBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        MaxDesigns.getInstance().VenWrite(text);
        String a = "";
        if(compTxt.getText().equals("") || compTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getVen().get(index).setCompany(compTxt.getText()))
            {
                invalidCompany.setText("");
                
            }
            else
            {
                invalidCompany.setText("Only digits alphabets spaces - _ allowed");
                a = "1";
            }
        }
        
        if(amountTxt.getText().equals("") || amountTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getVen().get(index).setOwner(amountTxt.getText()))
            {
                invalidOwner.setText("");
                        
            }
            else
            {
                invalidOwner.setText("Only Alphabets and spaces allowed");
                a = "1";
            }
        }
        
        if(contactTxt.getText().equals("") || contactTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getVen().get(index).setContact(contactTxt.getText()))
            {
                invalidContact.setText("");
                
            }
            else
            {
                invalidContact.setText("Only digits allowed");
                a = "1";
            }
         }
        
        MaxDesigns.getInstance().getVen().get(index).setFType(TypeBox.getSelectedItem().toString());
        
        if(shareTxt.getText().equals("") || shareTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getVen().get(index).isDigits(shareTxt.getText()))
            {
                invalidShare.setText("");
                if(MaxDesigns.getInstance().getVen().get(index).setShare(Integer.parseInt(shareTxt.getText())))
                {
                   invalidShare.setText("");
                }
                else
                {
                    invalidShare.setText("share should be greater than 0");
                    a = "1";
                }
            }
            else
            {
                invalidShare.setText("Share should be in digits");
                a = "1";
            }
        }
        
         if(a.equals("") || a.equals(null))
        {
            MaxDesigns.getInstance().writeVen();
            JOptionPane.showMessageDialog(this,"The Data has been Updated Successfully","Congratulations",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_upBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField compTxt;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JLabel invalidCompany;
    private javax.swing.JLabel invalidContact;
    private javax.swing.JLabel invalidOwner;
    private javax.swing.JLabel invalidShare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField shareTxt;
    private javax.swing.JButton srchBtn;
    private com.k33ptoo.components.KButton upBtn;
    private javax.swing.JTextField vendorTxt;
    // End of variables declaration//GEN-END:variables
}