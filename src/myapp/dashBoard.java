package myapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import config.Session;
import config.Singleton;
import config.loggedUser;
import java.awt.Color;
import internalPages.*;
import internalPages.dashBoardPage;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC-MIKE
 */
public class dashBoard extends javax.swing.JFrame {

    
    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
       
        initComponents();
        
        dashBoardPage dbp = new dashBoardPage();
        maindesktop.add(dbp).setVisible(true);
        
    }
    
  private void getData(){
  Singleton singletonInstance = Singleton.getInstance();

    if(singletonInstance.getId() == 0){
        JOptionPane.showMessageDialog(null, "Login First!");
        loginForm lf = new loginForm();
        lf.setVisible(true);
        this.dispose();
    }else{
           int retrievedData = singletonInstance.getId();
            user_ID.setText(""+retrievedData);
    }
 
  }
    
    Color navcolor = new Color(140,104,141);
    Color headcolor = new Color(102,102,255);
    Color bodycolor = new Color(153,153,255);
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        students = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        department = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        enrollees = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        user_ID = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(140, 104, 141));
        navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbarMouseEntered(evt);
            }
        });
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(140, 104, 141));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, -1));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 40));

        students.setBackground(new java.awt.Color(140, 104, 141));
        students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentsMouseExited(evt);
            }
        });
        students.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENTS");
        students.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, -1));

        navbar.add(students, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 40));

        users.setBackground(new java.awt.Color(140, 104, 141));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USERS");
        users.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, -1));

        navbar.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, 40));

        account.setBackground(new java.awt.Color(140, 104, 141));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACCOUNT");
        account.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, -1));

        navbar.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 170, 40));

        department.setBackground(new java.awt.Color(140, 104, 141));
        department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                departmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                departmentMouseExited(evt);
            }
        });
        department.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEPARTMENT");
        department.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, -1));

        navbar.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, 40));

        enrollees.setBackground(new java.awt.Color(140, 104, 141));
        enrollees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrolleesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enrolleesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enrolleesMouseExited(evt);
            }
        });
        enrollees.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENROLLEES");
        enrollees.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 170, -1));

        navbar.add(enrollees, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, 40));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 170, 480);

        header.setBackground(new java.awt.Color(102, 102, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 40, 40));

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        user_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_IDMouseClicked(evt);
            }
        });
        user_ID.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                user_IDComponentShown(evt);
            }
        });
        header.add(user_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jPanel1.add(header);
        header.setBounds(170, 0, 760, 40);

        maindesktop.setBackground(new java.awt.Color(153, 153, 255));
        maindesktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maindesktopMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(170, 40, 760, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
            dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
            dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void studentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseEntered
            students.setBackground(bodycolor);
    }//GEN-LAST:event_studentsMouseEntered

    private void studentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseExited
            students.setBackground(navcolor);
    }//GEN-LAST:event_studentsMouseExited

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setBackground(bodycolor);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBackground(navcolor);
    }//GEN-LAST:event_usersMouseExited

    private void studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseClicked
        studentPage up = new studentPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_studentsMouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        dashBoardPage dbp = new dashBoardPage();
        maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void maindesktopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maindesktopMouseEntered
       
    }//GEN-LAST:event_maindesktopMouseEntered

    private void navbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMouseEntered

    }//GEN-LAST:event_navbarMouseEntered

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(bodycolor);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setBackground(navcolor);
    }//GEN-LAST:event_accountMouseExited

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        settingsPage set = new settingsPage();
       maindesktop.add(set).setVisible(true);
        System.out.println(""+loggedUser.getAdminUser());
  
    }//GEN-LAST:event_accountMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        userPage up = new userPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_usersMouseClicked

    private void departmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseClicked
        deptPage up = new deptPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_departmentMouseClicked

    private void departmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseEntered
       department.setBackground(bodycolor);
    }//GEN-LAST:event_departmentMouseEntered

    private void departmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentMouseExited
        department.setBackground(navcolor);
    }//GEN-LAST:event_departmentMouseExited

    private void enrolleesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolleesMouseClicked
        enrollPage up = new enrollPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_enrolleesMouseClicked

    private void enrolleesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolleesMouseEntered
       enrollees.setBackground(bodycolor);
    }//GEN-LAST:event_enrolleesMouseEntered

    private void enrolleesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrolleesMouseExited
        enrollees.setBackground(navcolor);
    }//GEN-LAST:event_enrolleesMouseExited

    private void user_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_IDMouseClicked

    }//GEN-LAST:event_user_IDMouseClicked

    private void user_IDComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_user_IDComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_user_IDComponentShown

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
             getData();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel department;
    private javax.swing.JPanel enrollees;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel students;
    private javax.swing.JLabel user_ID;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
