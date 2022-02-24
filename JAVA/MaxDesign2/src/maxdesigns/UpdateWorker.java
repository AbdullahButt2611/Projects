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
public class UpdateWorker extends javax.swing.JInternalFrame {

    public String text= "";
    int index = -1;
    
    /**
     * Creates new form UpdateWorker
     */
    public UpdateWorker() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        nameTxt.setEnabled(false);
        emailTxt.setEnabled(false);
        maleBtn.setEnabled(false);
        femaleBtn.setEnabled(false);
        ageBox.setEnabled(false);
        statusBox.setEnabled(false);
        salTxt.setEnabled(false);
        contactTxt.setEnabled(false);
        upBtn.setEnabled(false);
        
    }
    
    public String fileData(int index)
    {
        String s = "\n\n*****************************************************************************\n";
               s += "                               UPDATE WORKER\n";
               s += "____________________________________________________________________________\n";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now(); 
               s += "Date/Time : "+dtf.format(now)+"                        Ayesha | Accountant\n\n";
               s += "Account Details to be Updated. .................................. \n\n";
               s += "Name : "+MaxDesigns.getInstance().getEmp().get(index).getName()+" ( "+MaxDesigns.getInstance().getEmp().get(index).getID()+" )\n";
               s += "Status : "+MaxDesigns.getInstance().getEmp().get(index).getStatus()+"\n";
               s += "Salary : "+MaxDesigns.getInstance().getEmp().get(index).getSalary()+"\n\n\n";
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        invalidName = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        invalidEmail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        maleBtn = new javax.swing.JRadioButton();
        femaleBtn = new javax.swing.JRadioButton();
        ageBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox<>();
        salTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        invalidSalary = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        contactTxt = new javax.swing.JTextField();
        invalidContact = new javax.swing.JLabel();
        upBtn = new javax.swing.JButton();
        srchBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(930, 738));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/watermark.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Update Employee");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("ID :");

        idTxt.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        idTxt.setForeground(new java.awt.Color(51, 0, 51));
        idTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Name :");

        nameTxt.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(51, 0, 51));
        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Email :");

        invalidName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        invalidName.setForeground(new java.awt.Color(153, 0, 0));

        emailTxt.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(51, 0, 51));
        emailTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));

        invalidEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        invalidEmail.setForeground(new java.awt.Color(153, 0, 0));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Gender :");

        maleBtn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(maleBtn);
        maleBtn.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        maleBtn.setForeground(new java.awt.Color(51, 0, 51));
        maleBtn.setText("Male");

        femaleBtn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(femaleBtn);
        femaleBtn.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        femaleBtn.setForeground(new java.awt.Color(51, 0, 51));
        femaleBtn.setText("Female");

        ageBox.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        ageBox.setForeground(new java.awt.Color(51, 0, 51));
        ageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35" }));
        ageBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        ageBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Age :");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText(" Status :");

        statusBox.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        statusBox.setForeground(new java.awt.Color(51, 0, 51));
        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Architect", "Accountant", "Market Manager", "Supervisor", "House Boy", "Kitchen Boy", "Draft Man", "Interior Designer", "Visualizer", "Site Supervisor", "Project Management Consultant", " " }));
        statusBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        statusBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        salTxt.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        salTxt.setForeground(new java.awt.Color(51, 0, 51));
        salTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Salary :");

        invalidSalary.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        invalidSalary.setForeground(new java.awt.Color(153, 0, 0));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("Contact :");

        contactTxt.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        contactTxt.setForeground(new java.awt.Color(51, 0, 51));
        contactTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));

        invalidContact.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        invalidContact.setForeground(new java.awt.Color(153, 0, 0));

        upBtn.setBackground(new java.awt.Color(51, 0, 51));
        upBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        upBtn.setForeground(new java.awt.Color(255, 255, 255));
        upBtn.setText("UPDATE");
        upBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        upBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });

        srchBtn.setBackground(new java.awt.Color(51, 0, 51));
        srchBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        srchBtn.setForeground(new java.awt.Color(255, 255, 255));
        srchBtn.setText("Search");
        srchBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        srchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        srchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(srchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(485, 485, 485)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(salTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invalidSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(184, 184, 184)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invalidContact, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invalidName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(maleBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)
                                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(182, 182, 182)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(invalidEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(srchBtn))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maleBtn)
                                .addComponent(femaleBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidContact, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchBtnActionPerformed
        // TODO add your handling code here:
        for(int i = 0;i<MaxDesigns.getInstance().getEmp().size();i++)
        {
            if(MaxDesigns.getInstance().getEmp().get(i).getID().equals(idTxt.getText()))
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
            JOptionPane.showMessageDialog(this,"The ID not Found","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            nameTxt.setEnabled(true);
            emailTxt.setEnabled(true);
            maleBtn.setEnabled(true);
            femaleBtn.setEnabled(true);
            ageBox.setEnabled(true);
            statusBox.setEnabled(true);
            salTxt.setEnabled(true);
            contactTxt.setEnabled(true);
            upBtn.setEnabled(true);
            idTxt.setEnabled(false);
            srchBtn.setEnabled(false);
            
            nameTxt.setText(MaxDesigns.getInstance().getEmp().get(index).getName());
            emailTxt.setText(MaxDesigns.getInstance().getEmp().get(index).getEmail());
            if(MaxDesigns.getInstance().getEmp().get(index).getGender().equals("Male"))
                maleBtn.setSelected(true);
            else
                femaleBtn.setSelected(true);
            
            statusBox.setSelectedItem(MaxDesigns.getInstance().getEmp().get(index).getStatus());
            ageBox.setSelectedItem(MaxDesigns.getInstance().getEmp().get(index).getAge());
            salTxt.setText(MaxDesigns.getInstance().getEmp().get(index).getSalary()+"");
            contactTxt.setText(MaxDesigns.getInstance().getEmp().get(index).getContact());
        }
    }//GEN-LAST:event_srchBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        MaxDesigns.getInstance().EmpWrite(text);
        String a = "";
        if(nameTxt.getText().equals("") || nameTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getEmp().get(index).setName(nameTxt.getText()))
            {
                invalidName.setText("");
            }
            else
            {
                invalidName.setText("Invalid Name");
                a = "1";
            }
                
        }
        
        if(emailTxt.getText().equals("") || emailTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getEmp().get(index).setEmail(emailTxt.getText()))
            {
                invalidEmail.setText("");
            }
            else
            {
                invalidEmail.setText("Invalid Email");
                a = "1";
            }
                
        }
        
        if(maleBtn.isSelected())
            MaxDesigns.getInstance().getEmp().get(index).setFGender("Male");
        else
            MaxDesigns.getInstance().getEmp().get(index).setFGender("Female");
        
        if(statusBox.getSelectedItem().equals(null))
        {}
        else
            MaxDesigns.getInstance().getEmp().get(index).setFStatus(statusBox.getSelectedItem().toString());
        
        if(ageBox.getSelectedItem().equals(null))
        {}
        else
            MaxDesigns.getInstance().getEmp().get(index).setFAge(Integer.parseInt(ageBox.getSelectedItem().toString()));
        
        if(salTxt.getText().equals("") || salTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getEmp().get(index).isDigits(salTxt.getText()))
            {
                int c = Integer.parseInt(salTxt.getText());
                if(MaxDesigns.getInstance().getEmp().get(index).setSalary(c))
                {
                    invalidSalary.setText("");
                }
                else
                {
                    invalidSalary.setText("Invalid Salary");
                    a = "1";
                }
            }
            else{
                a = "1";
                invalidSalary.setText("Invalid Salar");
            }
                
        }
        
        if(contactTxt.getText().equals("") || contactTxt.getText().equals(null))
        {}
        else
        {
            if(MaxDesigns.getInstance().getEmp().get(index).setContact(contactTxt.getText()))
            {
                invalidContact.setText("");
            }
            else
            {
                invalidContact.setText("Invalid Name");
                a = "1";
            }
                
        }
        if(a.equals("") || a.equals(null))
        {
            MaxDesigns.getInstance().writeEmp();
            JOptionPane.showMessageDialog(this,"The Data has been Updated Successfully","Congratulations",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_upBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JRadioButton femaleBtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel invalidContact;
    private javax.swing.JLabel invalidEmail;
    private javax.swing.JLabel invalidName;
    private javax.swing.JLabel invalidSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton maleBtn;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField salTxt;
    private javax.swing.JButton srchBtn;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}