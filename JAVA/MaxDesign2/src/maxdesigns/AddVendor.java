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
public class AddVendor extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddVendor
     */
    public AddVendor() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    public String fileData()
    {
        String s = "\n\n*****************************************************************************\n";
               s += "                               ADD VENDOR\n";
               s += "____________________________________________________________________________\n";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now(); 
               s += "Date/Time : "+dtf.format(now)+"                        Umair Umar | Administrator\n\n";
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        compTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ownerTxt = new javax.swing.JTextField();
        invalidCompany = new javax.swing.JLabel();
        invalidOwner = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        invalidContact = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TypeBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        shareTxt = new javax.swing.JTextField();
        invalidShare = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addBtn = new com.k33ptoo.components.KButton();

        setPreferredSize(new java.awt.Dimension(920, 787));

        kGradientPanel1.setkEndColor(new java.awt.Color(24, 24, 24));
        kGradientPanel1.setkStartColor(new java.awt.Color(186, 139, 2));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Add Vendor");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 11, -1, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/watermark.png"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 169, 91));

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

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText(" Owner Name :");

        ownerTxt.setBackground(new java.awt.Color(212, 209, 209));
        ownerTxt.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        ownerTxt.setForeground(new java.awt.Color(51, 0, 51));
        ownerTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 0, 51)));
        ownerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerTxtActionPerformed(evt);
            }
        });

        invalidCompany.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invalidCompany.setForeground(new java.awt.Color(153, 0, 0));

        invalidOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invalidOwner.setForeground(new java.awt.Color(153, 0, 0));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Contact :");

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

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Type :");

        TypeBox.setBackground(new java.awt.Color(212, 209, 209));
        TypeBox.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        TypeBox.setForeground(new java.awt.Color(51, 0, 51));
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Furniture", "Light", "Paint", "Raw Material", "Electrical", "Metal", "Wood", "Gas", "Marble", "Bricks" }));
        TypeBox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(51, 0, 51)));
        TypeBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Share % :");

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/icons8-company-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invalidOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shareTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addComponent(invalidContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invalidShare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ownerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidContact, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shareTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invalidShare, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 580, 490));

        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        addBtn.setText("ADD");
        addBtn.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        addBtn.setkEndColor(new java.awt.Color(24, 24, 24));
        addBtn.setkHoverEndColor(new java.awt.Color(102, 0, 0));
        addBtn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        addBtn.setkHoverStartColor(new java.awt.Color(0, 0, 153));
        addBtn.setkStartColor(new java.awt.Color(186, 139, 2));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 675, 320, 60));

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

    private void compTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compTxtActionPerformed

    private void ownerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerTxtActionPerformed

    private void contactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTxtActionPerformed

    private void shareTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shareTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String company = compTxt.getText();
        String owner = ownerTxt.getText();
        String contact = contactTxt.getText();
        String type = TypeBox.getSelectedItem().toString();
        String share = shareTxt.getText();
        String data = fileData();
        if(company.equals("") || company.equals(null) || owner.equals("") || owner.equals(null) || contact.equals("") || contact.equals(null) || share.equals("") || share.equals(null))
        {
            
            if(company.equals("") || company.equals(null))
            {
                invalidCompany.setText("This Field is Empty!");
            }
            else
                invalidCompany.setText("");
            
            if(owner.equals("") || owner.equals(null))
            {
                invalidOwner.setText("This Field is Empty!");
            }
            else
                invalidOwner.setText("");
            
            if(contact.equals("") || contact.equals(null))
            {
                invalidContact.setText("This Field is Empty!");
            }
            else
                invalidContact.setText("");
            
            if(share.equals("") || share.equals(null))
            {
                invalidShare.setText("This Field is Empty!");
            }
            else
                invalidShare.setText("");
        }
        else
        {
            Vendors v = new Vendors(type);
            if(v.setCompany(company))
            {
                invalidCompany.setText("");
                data+="Company : "+company+" ( "+type+" )\n";
                if(v.setOwner(owner))
                {
                    invalidOwner.setText("");
                    data += "Company Owner : "+owner+"                 \n";
                    if(v.setContact(contact))
                    {
                        invalidContact.setText("");
                        data += "Contact : "+contact+"\n";
                        if(v.isDigits(share))
                        {
                            invalidShare.setText("");
                            if(v.setShare(Integer.parseInt(share)))
                            {
                                invalidShare.setText("");
                                data += "The Share that is decided is : "+share+" %\n\n"; 
                                v.setID();
                                data += "Its unique ID will be : "+v.getId()+"\n\n\n";
                                data += "                                                    MAX DESIGNS\n\n";
                                data += "____________________________________________________________________________\n";
                                
                                
                                MaxDesigns.getInstance().getVen().add(v);
                                MaxDesigns.getInstance().writeVen();
                                MaxDesigns.getInstance().VenWrite(data);
                                JOptionPane.showMessageDialog(this,"The Data has been Added Successfully","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                compTxt.setText(null);
                                ownerTxt.setText(null);
                                contactTxt.setText(null);
                                TypeBox.setSelectedIndex(0);
                                shareTxt.setText(null);
                            }
                            else
                                invalidShare.setText("The share should be between (1-100)");
                        }
                        else
                            invalidShare.setText("The share should be a number(1-100)");
                    }
                    else
                        invalidContact.setText("Only digits are allowed");
                }
                else
                    invalidOwner.setText("Only alphabets and spaces allowed");
            }
            else
                invalidCompany.setText("Only - _ alphabets digitsand spaces allowed");
        }
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TypeBox;
    private com.k33ptoo.components.KButton addBtn;
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
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField ownerTxt;
    private javax.swing.JTextField shareTxt;
    // End of variables declaration//GEN-END:variables
}
