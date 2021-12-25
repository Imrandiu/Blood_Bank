/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gateway.DBClass;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.ChangePassword;
import main.Main;

/**
 *
 * @author User
 */
public class AddRequest extends javax.swing.JFrame {

    Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form AddRequest
     */
    public AddRequest() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblNBG = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbBG = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        btnAddRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblSample1 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        lblName4 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuRegister = new javax.swing.JMenu();
        menuRegDonor = new javax.swing.JMenuItem();
        menuRegPatient = new javax.swing.JMenuItem();
        menuDonor = new javax.swing.JMenu();
        menuViewDonor = new javax.swing.JMenuItem();
        menuPatient = new javax.swing.JMenu();
        menuViewPatient = new javax.swing.JMenuItem();
        menuBlood = new javax.swing.JMenu();
        menuAvailBlood = new javax.swing.JMenuItem();
        menuBloodRequ = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenu();
        menuSearchBlood = new javax.swing.JMenuItem();
        menuSearchDonor = new javax.swing.JMenuItem();
        menuSearchPatient = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        menuCP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Requests");
        setIconImage(img);
        setPreferredSize(new java.awt.Dimension(600, 450));

        lblName.setText("Patient ID:");

        lblNBG.setText("Blood Group:");

        lblQuantity.setText("Quantity (Pack):");

        cmbBG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        btnAddRequest.setText("Add Request");
        btnAddRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRequestActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setText("When Needed:");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblSample1.setText("(DD-MM-YY)");

        panel3.setBackground(new java.awt.Color(255, 51, 51));

        lblName4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName4.setForeground(new java.awt.Color(255, 255, 255));
        lblName4.setText("Blood Bank Management System");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(lblName4)
                .addGap(187, 187, 187))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName4)
                .addContainerGap())
        );

        menuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/home.png"))); // NOI18N
        menuHome.setToolTipText("");
        menuHome.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuHomeMenuSelected(evt);
            }
        });
        menuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHomeActionPerformed(evt);
            }
        });
        menu.add(menuHome);

        menuRegister.setText("Register");

        menuRegDonor.setText("Donor");
        menuRegDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegDonorActionPerformed(evt);
            }
        });
        menuRegister.add(menuRegDonor);

        menuRegPatient.setText("Patient");
        menuRegPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegPatientActionPerformed(evt);
            }
        });
        menuRegister.add(menuRegPatient);

        menu.add(menuRegister);

        menuDonor.setText("Donor");

        menuViewDonor.setText("View Donors");
        menuViewDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewDonorActionPerformed(evt);
            }
        });
        menuDonor.add(menuViewDonor);

        menu.add(menuDonor);

        menuPatient.setText("Patient");

        menuViewPatient.setText("View Patients");
        menuViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewPatientActionPerformed(evt);
            }
        });
        menuPatient.add(menuViewPatient);

        menu.add(menuPatient);

        menuBlood.setText("Blood");

        menuAvailBlood.setText("Available Blood");
        menuAvailBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAvailBloodActionPerformed(evt);
            }
        });
        menuBlood.add(menuAvailBlood);

        menuBloodRequ.setText("Blood Requests");
        menuBloodRequ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBloodRequActionPerformed(evt);
            }
        });
        menuBlood.add(menuBloodRequ);

        menu.add(menuBlood);

        menuSearch.setText("Search");

        menuSearchBlood.setText("Blood");
        menuSearchBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchBloodActionPerformed(evt);
            }
        });
        menuSearch.add(menuSearchBlood);

        menuSearchDonor.setText("Donors");
        menuSearchDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchDonorActionPerformed(evt);
            }
        });
        menuSearch.add(menuSearchDonor);

        menuSearchPatient.setText("Patients");
        menuSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSearchPatientActionPerformed(evt);
            }
        });
        menuSearch.add(menuSearchPatient);

        menu.add(menuSearch);

        menuAdmin.setText("Admin Option");

        menuCP.setText("Change Password");
        menuCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCPActionPerformed(evt);
            }
        });
        menuAdmin.add(menuCP);

        menu.add(menuAdmin);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddRequest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNBG)
                                            .addComponent(lblQuantity)
                                            .addComponent(jLabel1))
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(53, 53, 53)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbBG, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(lblSample1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNBG)
                    .addComponent(cmbBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSample1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRequestActionPerformed
        // TODO add your handling code here:
        try{
            con=DBClass.getConnection();
            
            if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter  Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
           
            if (txtQuantity.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Quantity","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             
            if (cmbBG.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
          
   Statement stmt;
       stmt= con.createStatement();
      
            String sql= "insert into Requests(PID,NBG,Quantity,Date)values('"+ txtName.getText() + "','"+ cmbBG.getSelectedItem().toString() + "','"+ txtQuantity.getText() + "','"+ txtDate.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Requests",JOptionPane.INFORMATION_MESSAGE);
            btnAddRequest.setEnabled(false);
pst.close();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisterPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddRequestActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    public void Reset(){
     
       cmbBG.setSelectedIndex(0);
       txtName.setText("");
       txtQuantity.setText("");
       txtDate.setText("");
      
        
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ViewRequests requ=new ViewRequests();
        requ.show();
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void menuRegDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegDonorActionPerformed
        // TODO add your handling code here:
        RegisterDonor donor=new RegisterDonor();
        donor.show();
        this.hide();
    }//GEN-LAST:event_menuRegDonorActionPerformed

    private void menuRegPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegPatientActionPerformed
        // TODO add your handling code here:
        RegisterPatient pat=new RegisterPatient();
        pat.show();
        this.hide();
    }//GEN-LAST:event_menuRegPatientActionPerformed

    private void menuViewDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewDonorActionPerformed
        // TODO add your handling code here:
        ViewDonor donor=new ViewDonor();
        donor.show();
        this.hide();
    }//GEN-LAST:event_menuViewDonorActionPerformed

    private void menuViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatient patient=new ViewPatient();
        patient.show();
        this.hide();
    }//GEN-LAST:event_menuViewPatientActionPerformed

    private void menuAvailBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAvailBloodActionPerformed
        // TODO add your handling code here:
        ViewBlood blood=new ViewBlood();
        blood.show();
        this.hide();
    }//GEN-LAST:event_menuAvailBloodActionPerformed

    private void menuBloodRequActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBloodRequActionPerformed
        // TODO add your handling code here:
        AddRequest requ =new AddRequest();
        requ.show();
        this.hide();
    }//GEN-LAST:event_menuBloodRequActionPerformed

    private void menuSearchBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchBloodActionPerformed
        // TODO add your handling code here:
        BloodSearchResult blood=new BloodSearchResult();
        blood.show();
        this.hide();
    }//GEN-LAST:event_menuSearchBloodActionPerformed

    private void menuSearchDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchDonorActionPerformed
        // TODO add your handling code here:
        DonorSearchResult donor=new DonorSearchResult();
        donor.show();
        this.hide();
    }//GEN-LAST:event_menuSearchDonorActionPerformed

    private void menuSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSearchPatientActionPerformed
        // TODO add your handling code here:
        PatientSearchResult pat=new PatientSearchResult();
        pat.show();
        this.hide();
    }//GEN-LAST:event_menuSearchPatientActionPerformed

    private void menuCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCPActionPerformed
        // TODO add your handling code here:
        ChangePassword cp =new ChangePassword();
        cp.show();
    }//GEN-LAST:event_menuCPActionPerformed

    private void menuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHomeActionPerformed
        
    }//GEN-LAST:event_menuHomeActionPerformed

    private void menuHomeMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuHomeMenuSelected
        // TODO add your handling code here:
          Main main=new Main();
        main.show();
        this.hide();
    }//GEN-LAST:event_menuHomeMenuSelected

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
            java.util.logging.Logger.getLogger(AddRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRequest().setVisible(true);
            }
        });
    }
Image img =(new ImageIcon(getClass().getResource("blooddrop.png"))).getImage();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRequest;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbBG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNBG;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSample1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenuItem menuAvailBlood;
    private javax.swing.JMenu menuBlood;
    private javax.swing.JMenuItem menuBloodRequ;
    private javax.swing.JMenuItem menuCP;
    private javax.swing.JMenu menuDonor;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuPatient;
    private javax.swing.JMenuItem menuRegDonor;
    private javax.swing.JMenuItem menuRegPatient;
    private javax.swing.JMenu menuRegister;
    private javax.swing.JMenu menuSearch;
    private javax.swing.JMenuItem menuSearchBlood;
    private javax.swing.JMenuItem menuSearchDonor;
    private javax.swing.JMenuItem menuSearchPatient;
    private javax.swing.JMenuItem menuViewDonor;
    private javax.swing.JMenuItem menuViewPatient;
    private javax.swing.JPanel panel3;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}