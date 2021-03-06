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
public class AddCamp extends javax.swing.JFrame {

    Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form AddCamp
     */
    public AddCamp() {
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

        lblVenue = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtVenue = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        btnAddCamp = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblSample1 = new javax.swing.JLabel();
        lblSTime = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
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
        setTitle("Add Camp");
        setIconImage(img);

        lblVenue.setText("Venue:");

        lblDate.setText("Date:");

        lblTime.setText("Time:");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        btnAddCamp.setText("Add Camp");
        btnAddCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCampActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSample1.setText("(DD/MM/YY)");

        lblSTime.setText("(TT:TT AM)");

        panel.setBackground(new java.awt.Color(255, 51, 51));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Blood Bank Management System");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblName)
                .addGap(159, 159, 159))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddCamp)
                        .addGap(54, 54, 54)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVenue)
                            .addComponent(lblDate)
                            .addComponent(lblTime))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVenue)
                            .addComponent(txtDate)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSample1)
                    .addComponent(lblSTime))
                .addGap(113, 113, 113))
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVenue)
                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSample1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTime)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSTime)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnAddCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCampActionPerformed
        // TODO add your handling code here:
        try{
            con=DBClass.getConnection();
            if (txtVenue.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Venue","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            
            if (txtDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (txtTime.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please Enter Time","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                 
   Statement stmt;
       stmt= con.createStatement();
            String sql= "insert into Camp(Venue,Date,Time)values('"+ txtVenue.getText() + "','"+ txtDate.getText() + "','"+ txtTime.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Camp",JOptionPane.INFORMATION_MESSAGE);
            btnAddCamp.setEnabled(false);
pst.close();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch (Exception ex) {
            Logger.getLogger(RegisterPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddCampActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ViewCamp camp=new ViewCamp();
        camp.show();
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    public void Reset(){
     
       
       txtVenue.setText("");
       txtDate.setText("");
       txtTime.setText("");
       
        
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(AddCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCamp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCamp().setVisible(true);
            }
        });
    }
Image img =(new ImageIcon(getClass().getResource("blooddrop.png"))).getImage();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCamp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSTime;
    private javax.swing.JLabel lblSample1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblVenue;
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
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
