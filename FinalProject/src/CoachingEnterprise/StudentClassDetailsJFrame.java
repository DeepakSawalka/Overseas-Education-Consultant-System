/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CoachingEnterprise;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Deepak
 */
public class StudentClassDetailsJFrame extends javax.swing.JFrame {
private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
     int q,i;
     String branch;
     String enterprise;
     String name,pass;
     byte[] image;
     DefaultTableModel recordTable;
     String testp,prepmodes,batch,testpt,prepmodest,batcht,status,test,englishtest;
    /**
     * Creates new form StudentClassDetailsJFrame
     */
    public StudentClassDetailsJFrame() {
        initComponents();
    }
public void upDateDb()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from studentclassdetailscoaching");
         
         rs=pst.executeQuery();
         ResultSetMetaData stData= rs.getMetaData();
         q=stData.getColumnCount();
         
   
         while (rs.next())
         {
            Vector columnData = new Vector();
            
            
                for(i=1;i<q;i++){
                  
                  columnData.add(rs.getString("ID"));
                  columnData.add(rs.getString("Name"));
                  columnData.add(rs.getString("Email"));
                  columnData.add(rs.getString("TestPrep"));
                  columnData.add(rs.getString("PrepModes"));
                  columnData.add(rs.getString("Batch"));
                  columnData.add(rs.getString("EngTestPrep"));
                  columnData.add(rs.getString("EngPrepModes"));
                  columnData.add(rs.getBlob("EngBatch"));
                  columnData.add(rs.getString("Status"));
                  columnData.add(rs.getString("Test"));
                  columnData.add(rs.getString("EnglishTest"));
                }         
            
             
         }
         
} 
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testprep = new javax.swing.ButtonGroup();
        proftest = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        agelbl = new javax.swing.JLabel();
        genderlbl = new javax.swing.JLabel();
        emaillbl = new javax.swing.JLabel();
        mobilelbl = new javax.swing.JLabel();
        branchlbl = new javax.swing.JLabel();
        enterpriselbl = new javax.swing.JLabel();
        degreelbl = new javax.swing.JLabel();
        countrieslbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        batchcbox = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        gre = new javax.swing.JCheckBox();
        gmat = new javax.swing.JCheckBox();
        sat = new javax.swing.JCheckBox();
        toefl = new javax.swing.JCheckBox();
        ielts = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        prepmodescbox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        prepmodestcbox = new javax.swing.JComboBox<>();
        batchtcbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Age:");

        jLabel2.setText("Gender:");

        jLabel3.setText("Name:");

        jLabel4.setText("Email:");

        jLabel5.setText("Mobile:");

        jLabel6.setText("Enterprise:");

        jLabel7.setText("Branch:");

        jLabel8.setText("Countries:");

        jLabel9.setText("Degree:");

        namelbl.setText("jLabel10");

        agelbl.setText("jLabel10");

        genderlbl.setText("jLabel10");

        emaillbl.setText("jLabel10");

        mobilelbl.setText("jLabel10");

        branchlbl.setText("jLabel10");

        enterpriselbl.setText("jLabel10");

        degreelbl.setText("jLabel10");

        countrieslbl.setText("jLabel10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobilelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branchlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degreelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countrieslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namelbl)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(emaillbl)
                            .addComponent(enterpriselbl))))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(agelbl)
                    .addComponent(mobilelbl)
                    .addComponent(jLabel9)
                    .addComponent(degreelbl))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(countrieslbl))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(branchlbl)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(genderlbl))
                        .addGap(40, 40, 40))))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Test Prep");

        jLabel11.setText("Prep Modes");

        jLabel12.setText("Batch");

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("English Proficiency Test");

        testprep.add(gre);
        gre.setText("GRE");

        testprep.add(gmat);
        gmat.setText("GMAT");

        testprep.add(sat);
        sat.setText("SAT");

        proftest.add(toefl);
        toefl.setText("TOEFL");

        proftest.add(ielts);
        ielts.setText("IELTS");

        jLabel14.setText("Prep Modes");

        prepmodescbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "GRE Classroom Training", "GRE Online Training ", "GMAT Classroom Training", "GMAT Online Training ", "SAT Classroom Training", "SAT Online Training " }));
        prepmodescbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepmodescboxActionPerformed(evt);
            }
        });

        jLabel15.setText("Batch");

        prepmodestcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "TOEFL Classroom Training", "TOEFL Online Training", "IELTS Classroom Training", "IELTS Online Training" }));
        prepmodestcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepmodestcboxActionPerformed(evt);
            }
        });

        batchtcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gmat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(gre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prepmodescbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(batchcbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(toefl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ielts, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(61, 61, 61)
                        .addComponent(batchtcbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prepmodestcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(199, 199, 199))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(savebtn)
                        .addGap(329, 329, 329))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gre)
                    .addComponent(toefl)
                    .addComponent(ielts))
                .addGap(18, 18, 18)
                .addComponent(gmat)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(prepmodestcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(prepmodescbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(batchtcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(batchcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savebtn)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prepmodescboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepmodescboxActionPerformed
        // TODO add your handling code here:
        try{
        if(prepmodescbox.getSelectedItem().equals("GRE Classroom Training")){
            batchcbox.removeAllItems();
            
            batchcbox.addItem("Monday - 6.30pm to 9.30 pm");
             batchcbox.addItem("Saturday - 11.30am to 2.30 pm");
          
            batchcbox.setSelectedItem(null);
        }
        else if (prepmodescbox.getSelectedItem().equals("GRE Online Training ")){
            batchcbox.removeAllItems();
            
            batchcbox.addItem("Sunday - 9.30am to 12.30 pm");
             
          
            batchcbox.setSelectedItem(null);
        }
         else if (prepmodescbox.getSelectedItem().equals("GMAT Classroom Training")){
            batchcbox.removeAllItems();
            
            batchcbox.addItem("Tuesday - 6.30am to 9.30 pm");
              batchcbox.addItem("Thursday - 6.30am to 9.30 pm");
          
            batchcbox.setSelectedItem(null);
        }
         else if (prepmodescbox.getSelectedItem().equals("GMAT Online Training ")){
            batchcbox.removeAllItems();
            
            batchcbox.addItem("Sunday - 12.30am to 3.30 pm");
             
          
            batchcbox.setSelectedItem(null);
        }
         else if (prepmodescbox.getSelectedItem().equals("SAT Classroom Training")){
            batchcbox.removeAllItems();
            
            batchcbox.addItem("Wednesday - 6.30am to 9.30 pm");
              batchcbox.addItem("Friday - 6.30am to 9.30 pm");
             
          
            batchcbox.setSelectedItem(null);
        }
         else if (prepmodescbox.getSelectedItem().equals("SAT Online Training ")){
            batchcbox.removeAllItems();
            
            batchcbox.addItem("Saturday - 6.30am to 9.30 pm");
             
          
            batchcbox.setSelectedItem(null);
        }
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_prepmodescboxActionPerformed

    private void prepmodestcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepmodestcboxActionPerformed
        // TODO add your handling code here:
         try{
        if(prepmodestcbox.getSelectedItem().equals("TOEFL Classroom Training")){
            batchtcbox.removeAllItems();
            
            batchtcbox.addItem("Monday - 6.30pm to 9.30 pm");
             batchtcbox.addItem("Saturday - 11.30am to 2.30 pm");
          
            batchtcbox.setSelectedItem(null);
        }
        else if (prepmodestcbox.getSelectedItem().equals("TOEFL Online Training ")){
            batchtcbox.removeAllItems();
            
            batchtcbox.addItem("Sunday - 9.30am to 12.30 pm");
             
          
            batchtcbox.setSelectedItem(null);
        }
         else if (prepmodestcbox.getSelectedItem().equals("IELTS Classroom Training")){
            batchtcbox.removeAllItems();
            
            batchtcbox.addItem("Tuesday - 6.30am to 9.30 pm");
              batchtcbox.addItem("Thursday - 6.30am to 9.30 pm");
          
            batchtcbox.setSelectedItem(null);
        }
         else if (prepmodestcbox.getSelectedItem().equals("IELTS Online Training")){
            batchtcbox.removeAllItems();
            
            batchtcbox.addItem("Sunday - 12.30am to 3.30 pm");
             
          
            batchtcbox.setSelectedItem(null);
        }
        
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
                           
    }//GEN-LAST:event_prepmodestcboxActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
         try
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("INSERT INTO studentclassdetailscoaching(Name,Email,TestPrep,PrepModes,Batch,EngTestPrep,EngPrepModes,EngBatch,Status,Test,EnglishTest)values(?,?,?,?,?,?,?,?,?,?,?)");
         
          pst.setString(1,namelbl.getText());
          pst.setString(2,emaillbl.getText());
             if(gre.isSelected())
         {
             testp=gre.getText()+"";
         }
                if(gmat.isSelected())
         {
             testp=gmat.getText()+"";
         }
                     if(sat.isSelected())
         {
             testp=sat.getText()+"";
         }
         pst.setString(3, testp);
         prepmodes=prepmodescbox.getSelectedItem().toString();
          pst.setString(4,prepmodes);
         batch=batchcbox.getSelectedItem().toString();
          pst.setString(5,batch);
           if(toefl.isSelected())
         {
             testpt=toefl.getText()+"";
         }
                if(ielts.isSelected())
         {
             testpt=ielts.getText()+"";
         }
                 
     
         pst.setString(6, testpt);
         prepmodest=prepmodestcbox.getSelectedItem().toString();
          pst.setString(7,prepmodest);
         batcht=batchtcbox.getSelectedItem().toString();
          pst.setString(8,batcht);
          
         status="Class Scheduled";
            pst.setString(9,status);
            test="Pending";
            pst.setString(10,test);
    englishtest="Pending";
       pst.setString(11,englishtest);
       
          pst.executeUpdate();
         JOptionPane.showMessageDialog(this,"Student Profile Created Successfully");
        upDateDb();
        
        
        
    }                                         
catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
}
    }//GEN-LAST:event_savebtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel agelbl;
    private javax.swing.JComboBox<String> batchcbox;
    private javax.swing.JComboBox<String> batchtcbox;
    public javax.swing.JLabel branchlbl;
    public javax.swing.JLabel countrieslbl;
    public javax.swing.JLabel degreelbl;
    public javax.swing.JLabel emaillbl;
    public javax.swing.JLabel enterpriselbl;
    public javax.swing.JLabel genderlbl;
    private javax.swing.JCheckBox gmat;
    private javax.swing.JCheckBox gre;
    private javax.swing.JCheckBox ielts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel mobilelbl;
    public javax.swing.JLabel namelbl;
    private javax.swing.JComboBox<String> prepmodescbox;
    private javax.swing.JComboBox<String> prepmodestcbox;
    private javax.swing.ButtonGroup proftest;
    private javax.swing.JCheckBox sat;
    private javax.swing.JButton savebtn;
    private javax.swing.ButtonGroup testprep;
    private javax.swing.JCheckBox toefl;
    // End of variables declaration//GEN-END:variables
}
