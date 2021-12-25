/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gateway.DBClass;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class UpdateRequests extends javax.swing.JFrame {

    Image img =(new ImageIcon(getClass().getResource("blooddrop.png"))).getImage();
    Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form UpdateRequests
     */
    public UpdateRequests() {
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
        txtName = new javax.swing.JTextField();
        lblNBG = new javax.swing.JLabel();
        cmbBG = new javax.swing.JComboBox<>();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        lblNo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblSample2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lblName1 = new javax.swing.JLabel();
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
        setTitle("Update Requests");
        setIconImage(img);

        lblName.setText("Patient ID:");

        lblNBG.setText("Blood Group:");

        cmbBG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        lblQuantity.setText("Quantity (Pack):");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        lblNo.setText("Serial NO:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblDate.setText("When Needed:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblSample2.setText("(DD/MM/YY)");

        panel.setBackground(new java.awt.Color(255, 51, 51));

        lblName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Blood Bank Management System");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lblName1)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName1)
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
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblNBG)
                    .addComponent(lblNo)
                    .addComponent(lblQuantity)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSample2)
                                .addGap(154, 154, 154))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCheck)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNo)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNBG)
                            .addComponent(cmbBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSample2))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        try{
            con=DBClass.getConnection();
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Request No","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            String sql="Select * from Requests where id= '" + txtID.getText() + "'";
            PreparedStatement stmt;
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){

                txtID.setText(rs.getString("id"));
                txtName.setText(rs.getString("PID"));
                txtQuantity.setText(rs.getString("Quantity"));
                cmbBG.addItem(rs.getString("NBG"));
                txtDate.setText(rs.getString("Date"));

                txtID.requestDefaultFocus();

            }
            pst.close();

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisterPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            
            con=DBClass.getConnection();
          
            String sql= "update Requests set PID='"+ txtName.getText() + "',NBG='"+ cmbBG.getSelectedItem().toString() + "',Quantity='" + txtQuantity.getText() + "',Date='" + txtDate.getText() + "' where id='" + txtID.getText() + "'";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);
pst.close();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch (Exception ex) {  
              Logger.getLogger(UpdateBlood.class.getName()).log(Level.SEVERE, null, ex);
          }  
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ViewRequests requ=new ViewRequests();
        requ.show();
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=DBClass.getConnection();
                String sql= "delete from Requests where id = '" + txtID.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

            
            }
            pst.close();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch (Exception ex) {
            Logger.getLogger(UpdateRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbBG;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblNBG;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSample2;
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
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}