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
public class Ghasu extends javax.swing.JInternalFrame {

    public int index = -1;
    
    public String data = "";
    
    /**
     * Creates new form Ghasu
     */
    public Ghasu() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        recBtn.setEnabled(false);
        amountTxt.setEnabled(false);
        detailTxt.setEnabled(false);
    }
    
    public String FullData()
    {
        String s = "\n___________________________________________________________________\n";
        s += "                           Ghasu\n"; //*****************************************************************
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        s += "Date/Time : "+dtf.format(now)+"\n";
        return s;
    }
    
    public String fileData()
    {
        String s = "\n\n*****************************************************************************\n";
               s += "                               Ghasu\n";//**********************************************************************
               s += "____________________________________________________________________________\n";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now(); 
               s += "Date/Time : "+dtf.format(now)+"                        Junaid Umar | Executive\n\n";
               s += "Project Name : "+MaxDesigns.getInstance().getCon().get(index).getName()+"\n";
               s += "Project ID : "+MaxDesigns.getInstance().getCon().get(index).getId()+"\n";
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        srchBtn = new javax.swing.JButton();
        recBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        amountTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        invalidAmount = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTxt = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(947, 754));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/watermark.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("GHASU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("ID :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, 40));

        idTxt.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        idTxt.setForeground(new java.awt.Color(51, 0, 51));
        idTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 450, 40));

        srchBtn.setBackground(new java.awt.Color(0, 0, 0));
        srchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        srchBtn.setForeground(new java.awt.Color(255, 255, 255));
        srchBtn.setText("Search");
        srchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        srchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(srchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 213, 40));

        recBtn.setBackground(new java.awt.Color(0, 0, 0));
        recBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        recBtn.setForeground(new java.awt.Color(255, 255, 255));
        recBtn.setText("Add to Records");
        recBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        recBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recBtnActionPerformed(evt);
            }
        });
        jPanel1.add(recBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 213, 40));

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 592, 10));

        amountTxt.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(51, 0, 51));
        amountTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jPanel1.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 250, 40));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Amount :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 90, 40));

        invalidAmount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        invalidAmount.setForeground(new java.awt.Color(153, 0, 0));
        invalidAmount.setText("(Amount should be greater than 0)");
        jPanel1.add(invalidAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 250, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Details :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, 40));

        detailTxt.setColumns(20);
        detailTxt.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        detailTxt.setForeground(new java.awt.Color(51, 0, 51));
        detailTxt.setRows(5);
        detailTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jScrollPane1.setViewportView(detailTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 422, 265));

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

    private void srchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchBtnActionPerformed
        // TODO add your handling code here:
        String id = idTxt.getText();

        if(id.equals("") || id.equals(null))
        {
            JOptionPane.showMessageDialog(this,"You first need to search the Project for which\nthe data is to be added","Empty Input",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(int i = 0;i<MaxDesigns.getInstance().getCon().size();i++)
            {
                if(MaxDesigns.getInstance().getCon().get(i).getId().equals(id))
                {

                    index = i;
                    this.data = fileData();
                    recBtn.setEnabled(true);
                    amountTxt.setEnabled(true);
                    detailTxt.setEnabled(true);
                    srchBtn.setEnabled(false);
                    idTxt.setEnabled(false);
                    break;
                }
                else
                index = -1;
            }
            if(index == -1)
            JOptionPane.showMessageDialog(this,"The following Project Does not seem to present in our data\nTry again with something else","Invalid Data",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_srchBtnActionPerformed

    private void recBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBtnActionPerformed
        // TODO add your handling code here:
        String amount = amountTxt.getText();
        String details = detailTxt.getText();
        String fdata = FullData();
        if(amount.equals("") || amount.equals(null) || details.equals("") || details.equals(null))
        {
            if(amount.equals("") || amount.equals(null))
            {
                invalidAmount.setText("Empty Field");
            }
            else
            invalidAmount.setText("");

            if(details.equals("") || details.equals(null))
            {
                JOptionPane.showMessageDialog(this,"You need to enter the details of the Transaction","Empty field",JOptionPane.ERROR_MESSAGE);
            }

        }
        else
        {
            if(MaxDesigns.getInstance().getCon().get(index).isDigits(amount))
            {
                invalidAmount.setText("");
                data = fileData();
                int a = Integer.parseInt(amount);
                fdata += "Ghasu Amount : "+a+"\n";   //***********************************************************
                data += "Ghasu Amount Details are as follows\n\n"; //********************************************
                data += details+"\n\n";
                fdata += "Details of the Ghasus are as follows :\n\n";//********************************************
                fdata += details +"\n";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                fdata += "Date/Time : "+dtf.format(now)+"\n";
                fdata += "                                     MAX DESIGNS\n";
                fdata += "_______________________________________________________________________________________\n\n";
                data += "                                        MAX DESIGNS\n";
                data += "______________________________________________________________________________________________\n\n";
                MaxDesigns.getInstance().ConWrite(data);
                MaxDesigns.getInstance().writeCon();
                MaxDesigns.getInstance().SeperateCon(MaxDesigns.getInstance().getCon().get(index).getName(),fdata);
                JOptionPane.showMessageDialog(this,"Data has been Added Successfully","Congratulations :)",JOptionPane.INFORMATION_MESSAGE);

            }
            else
            invalidAmount.setText("Amount should be in digits (>0)");
        }
    }//GEN-LAST:event_recBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextArea detailTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel invalidAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton recBtn;
    private javax.swing.JButton srchBtn;
    // End of variables declaration//GEN-END:variables
}