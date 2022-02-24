/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdesigns;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class CompleteProjectsDisplay extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompleteProjectsDisplay
     */
    public CompleteProjectsDisplay() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        tableSet();
        setDataToRow();
    }
    
    public void tableSet()
    {
        jScrollPane1.setBackground(new Color(0,0,0,0));
       jScrollPane1.setOpaque(false);
       jTable1.setOpaque(false);
       ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
       jScrollPane1.getViewport().setOpaque(false);
    }
    
    public void setDataToRow()
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object rowData[]=new Object[8];
        model.setRowCount(0);
        if(MaxDesigns.getInstance().getCon().size()>0)
        {
            for(int i =0;i<MaxDesigns.getInstance().getCon().size();i++)
            {
                if(MaxDesigns.getInstance().getCon().get(i).getStatus().equals("Complete"))
                {
                    rowData[0]=MaxDesigns.getInstance().getCon().get(i).getName();
                    rowData[1]=MaxDesigns.getInstance().getCon().get(i).getOwner();
                    rowData[2]=MaxDesigns.getInstance().getCon().get(i).getLocation();
                    rowData[3]=MaxDesigns.getInstance().getCon().get(i).getAmount();
                    int rest = MaxDesigns.getInstance().getCon().get(i).getAmount()-MaxDesigns.getInstance().getCon().get(i).getBalance();
                    rowData[4]=rest;
                    rowData[5]=MaxDesigns.getInstance().getCon().get(i).getBalance();
                    rowData[6]=MaxDesigns.getInstance().getCon().get(i).getUshare();
                    rowData[7]=MaxDesigns.getInstance().getCon().get(i).getJshare();
                    model.addRow(rowData);
                }

            }
        }
        if(MaxDesigns.getInstance().getDes().size()>0)
        {
            for(int i =0;i<MaxDesigns.getInstance().getDes().size();i++)
            {
                if(MaxDesigns.getInstance().getDes().get(i).getStatus().equals("Complete"))
                {
                    rowData[0]=MaxDesigns.getInstance().getDes().get(i).getName();
                    rowData[1]=MaxDesigns.getInstance().getDes().get(i).getOwner();
                    rowData[2]=MaxDesigns.getInstance().getDes().get(i).getLocation();
                    rowData[3]=MaxDesigns.getInstance().getDes().get(i).getAmount();
                    int rest = MaxDesigns.getInstance().getDes().get(i).getAmount()-MaxDesigns.getInstance().getDes().get(i).getBalance();
                    rowData[4]=rest;
                    rowData[5]=MaxDesigns.getInstance().getDes().get(i).getBalance();
                    rowData[6]="No share";
                    rowData[7]=MaxDesigns.getInstance().getDes().get(i).getBalance();
                    model.addRow(rowData);
                }

            }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(941, 744));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 78, 146));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 4, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("COMPLETED PROJECTS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxdesigns/watermark.png"))); // NOI18N

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project Name", "Owner", "Place", "Amount Promied", "NetWorth", "Profit", "Umair Share", "Junaid Share"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(24);
        jTable1.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(605, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addContainerGap()))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}