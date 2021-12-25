/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gateway.DBClass;
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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class ViewDonor extends javax.swing.JFrame {

    Image img =(new ImageIcon(getClass().getResource("blooddrop.png"))).getImage();
        Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form DisplayDonor
     */
    public ViewDonor() {
        initComponents();
        setLocationRelativeTo(null);
        try {
         con = DBClass.getConnection();
         viewTable();
        
       // JOptionPane.showMessageDialog(this, "Saved");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
private void viewTable()
    {
            try {
            String sql = "select id as 'Donor ID',Name,Email,Contact,Address,Age,Sex,BG as'Blood Group',(select CDate from blood where donor.id=blood.DonorId order by CDate desc LIMIT 1) as 'Last Donated' from donor order by id desc";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            tble.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(ViewDonor.class.getName()).log(Level.SEVERE, null, ex);
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

        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        scrollPane2 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        lblName1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
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
        setTitle("View Donor");
        setIconImage(img);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update/Delete");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor ID", "Name", "Email", "Contact", "Address", "Age", "Sex", "Blood Group", "Last Donated"
            }
        ));
        scrollPane2.setViewportView(tble);

        scrollPane.setViewportView(scrollPane2);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(255, 51, 51));

        lblName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Blood Bank Management System");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(lblName1)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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
                .addGap(26, 26, 26)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(124, 124, 124))
            .addComponent(scrollPane)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        RegisterDonor donor=new RegisterDonor();
        donor.show();
        this.hide();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Main home=new Main();
        home.show();
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UpdateDonor donor=new UpdateDonor();
        donor.show();
        this.hide();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DonorSearchResult ds=new DonorSearchResult();
        ds.show();
        this.hide();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblName1;
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
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTable tble;
    // End of variables declaration//GEN-END:variables
}
