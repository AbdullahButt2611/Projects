/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class ExeLoginForm extends javax.swing.JFrame {

    /**
     * Creates new form ExeLoginForm
     */
    public ExeLoginForm() {
        initComponents();
//        write();
    }
    
    public void write(){
        try
        {
            FileWriter fr = new FileWriter("D:\\Files\\Credentials\\ExeData.txt");
            BufferedWriter br = new BufferedWriter(fr);
            br.write("Username     ,      Password\n");
            br.write("JunaidUmar555,JunaidUmar555");
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Admin Login File Not Found");
        }
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
        jPanel1 = new javax.swing.JPanel();
        userText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        showCheck = new javax.swing.JCheckBox();
        invalidUser = new javax.swing.JLabel();
        invalidPass = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        passBtn = new javax.swing.JMenuItem();
        backBtn = new javax.swing.JMenu();
        BackBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        userText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(12, 91, 160)));
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Executive Login");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Username :");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Password :");

        passText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(12, 91, 160)));

        showCheck.setBackground(new java.awt.Color(255, 255, 255));
        showCheck.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        showCheck.setForeground(new java.awt.Color(153, 0, 0));
        showCheck.setText("Show Password");
        showCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCheckActionPerformed(evt);
            }
        });

        invalidUser.setBackground(new java.awt.Color(255, 255, 255));
        invalidUser.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        invalidUser.setForeground(new java.awt.Color(153, 0, 0));

        invalidPass.setBackground(new java.awt.Color(255, 255, 255));
        invalidPass.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        invalidPass.setForeground(new java.awt.Color(153, 0, 0));

        kButton1.setText("LOGIN");
        kButton1.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(12, 91, 160));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkStartColor(new java.awt.Color(153, 0, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(userText)
                            .addComponent(jLabel6)
                            .addComponent(passText)
                            .addComponent(showCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(invalidUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invalidPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invalidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invalidPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MaxDesignsCo");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Analytics Software");

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>\nOffering You The Best\n<br>\nFor Four Dream");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/small logo.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel7)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 0, 153));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(66, 30));

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Security");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(175, 24));

        passBtn.setBackground(new java.awt.Color(51, 0, 102));
        passBtn.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        passBtn.setForeground(new java.awt.Color(255, 255, 255));
        passBtn.setText("Change Password");
        passBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        passBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passBtn.setPreferredSize(new java.awt.Dimension(175, 24));
        passBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBtnActionPerformed(evt);
            }
        });
        jMenu1.add(passBtn);

        jMenuBar1.add(jMenu1);

        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 3));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Close");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        backBtn.setPreferredSize(new java.awt.Dimension(175, 28));

        BackBtn.setBackground(new java.awt.Color(51, 0, 102));
        BackBtn.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 3));
        BackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBtn.setPreferredSize(new java.awt.Dimension(175, 30));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        backBtn.add(BackBtn);

        jMenuBar1.add(backBtn);

        setJMenuBar(jMenuBar1);

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

        setSize(new java.awt.Dimension(1137, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void passBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBtnActionPerformed
        // TODO add your handling code here:
        ExeTPNForm f = new ExeTPNForm();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_passBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        ActorsForm f = new ActorsForm();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void showCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCheckActionPerformed
        // TODO add your handling code here:
        if(showCheck.isSelected())
        {
            passText.setEchoChar((char)0);
        }
        else
        {
            passText.setEchoChar('•');
        }
    }//GEN-LAST:event_showCheckActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        String user = userText.getText();
        String pass = passText.getText();
        
        if((user.equals("") ||  user.equals(null))&&(pass.equals("") || pass.equals(null)))
        {
            JOptionPane.showMessageDialog(this,"One or Both Fields are Empty","Empty Fields", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
                FileReader fr = new FileReader("D:\\Files\\Credentials\\ExeData.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br .readLine();
                line = br.readLine();
                if(!line.equals("") || !line.equals(null))
                {
                    String []splitArr = line.split(",");
                    if(user.equals(splitArr[0]))
                    {
                        invalidUser.setText("");
                        if(pass.equals(splitArr[1]))
                        {
                            invalidPass.setText("");
                            ExeMenuForm a = new ExeMenuForm();
                            a.setVisible(true);
                            this.dispose();
                        }
                        else
                        {
                            invalidPass.setText("Passoword not found !\nTry again with a correct one");
                        }
                    }
                    else
                    {
                        invalidUser.setText("Username not found !\nTry again with a correct one");
                    }
                }
                else
                {
                    System.out.print("Yet the File is empty");
                }
                br.close();
                fr.close();
                
            }
            catch(Exception ex)
            {
                System.out.println("Admin Login File Not Found");
            }
        }
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ExeLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExeLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExeLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExeLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExeLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BackBtn;
    private javax.swing.JMenu backBtn;
    private javax.swing.JLabel invalidPass;
    private javax.swing.JLabel invalidUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JMenuItem passBtn;
    private javax.swing.JPasswordField passText;
    private javax.swing.JCheckBox showCheck;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
