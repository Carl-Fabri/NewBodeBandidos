/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.print.attribute.standard.PresentationDirection;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Fabricio
 */
public class DashboardProducts extends javax.swing.JFrame implements DashboardInterface {

    static CardLayout cardLayout;
    /**
     * Creates new form DashboardProductos
     */
    public DashboardProducts() {
        initComponents();
        //initContet();
        
       // panContent = new JPanel(new CardLayout());
        cardLayout = (CardLayout)panContent.getLayout();
        // Crear y agregar los paneles
        JPanel panel1 = new MantenimientosPreview(this);
        JPanel panel2 = new ProductPanel(this);

        panContent.add(panel1, "Panel1");
        panContent.add(panel2, "Panel2");
        
        cardLayout.show(panContent,"Panel1");
    }
    
    
    @Override
    public void switchPanel(String panelName) {
        cardLayout.show(panContent, panelName);
    }

    
    private void initContet() {
        
        //Principal plPrincipal = new Principal();
        //ShowJPanel(plPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBackground = new javax.swing.JPanel();
        panMenu = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnCustomersPan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnProductsPan = new javax.swing.JButton();
        btnOrdersPan = new javax.swing.JButton();
        btnCategoriesPan = new javax.swing.JButton();
        panContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 400));

        panMenu.setBackground(new java.awt.Color(255, 102, 102));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("BodeBandidos");
        lblTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTitleMouseClicked(evt);
            }
        });

        btnCustomersPan.setBackground(new java.awt.Color(255, 102, 102));
        btnCustomersPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCustomersPan.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomersPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-ico.png"))); // NOI18N
        btnCustomersPan.setText("Customers");
        btnCustomersPan.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnCustomersPan.setBorderPainted(false);
        btnCustomersPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCustomersPan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCustomersPan.setIconTextGap(10);
        btnCustomersPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersPanActionPerformed(evt);
            }
        });

        btnProductsPan.setBackground(new java.awt.Color(255, 102, 102));
        btnProductsPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProductsPan.setForeground(new java.awt.Color(255, 255, 255));
        btnProductsPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-product-30.png"))); // NOI18N
        btnProductsPan.setText("Products");
        btnProductsPan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnProductsPan.setBorderPainted(false);
        btnProductsPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductsPan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductsPan.setIconTextGap(10);
        btnProductsPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsPanActionPerformed(evt);
            }
        });

        btnOrdersPan.setBackground(new java.awt.Color(255, 102, 102));
        btnOrdersPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrdersPan.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdersPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order-ico.png"))); // NOI18N
        btnOrdersPan.setText("Orders");
        btnOrdersPan.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnOrdersPan.setBorderPainted(false);
        btnOrdersPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdersPan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrdersPan.setIconTextGap(10);
        btnOrdersPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersPanActionPerformed(evt);
            }
        });

        btnCategoriesPan.setBackground(new java.awt.Color(255, 102, 102));
        btnCategoriesPan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCategoriesPan.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriesPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/categoryico.png"))); // NOI18N
        btnCategoriesPan.setText("Categories");
        btnCategoriesPan.setBorder(javax.swing.BorderFactory.createMatteBorder(20, 10, 20, 20, new java.awt.Color(0, 0, 0)));
        btnCategoriesPan.setBorderPainted(false);
        btnCategoriesPan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoriesPan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCategoriesPan.setIconTextGap(10);
        btnCategoriesPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriesPanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMenuLayout = new javax.swing.GroupLayout(panMenu);
        panMenu.setLayout(panMenuLayout);
        panMenuLayout.setHorizontalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTitle))
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnProductsPan, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCustomersPan, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCategoriesPan, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btnOrdersPan, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panMenuLayout.setVerticalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnProductsPan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnCustomersPan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnCategoriesPan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnOrdersPan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panContent.setBackground(new java.awt.Color(255, 0, 51));
        panContent.setRequestFocusEnabled(false);
        panContent.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panContent, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addComponent(panContent, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomersPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersPanActionPerformed
        switchPanel("Panel1");
    }//GEN-LAST:event_btnCustomersPanActionPerformed

    private void btnOrdersPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersPanActionPerformed
        switchPanel("Panel2");
    }//GEN-LAST:event_btnOrdersPanActionPerformed

    private void btnProductsPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsPanActionPerformed
        switchPanel("Panel2");
        //.switchPanel("Panel2");
//ProductPanel pl = new ProductPanel();
        //ShowJPanel(pl);
    }//GEN-LAST:event_btnProductsPanActionPerformed

    private void btnCategoriesPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriesPanActionPerformed

    }//GEN-LAST:event_btnCategoriesPanActionPerformed

    private void lblTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleMouseClicked
        Principal pl = new Principal();
        ShowJPanel(pl);
    }//GEN-LAST:event_lblTitleMouseClicked

    public void ShowJPanel(JPanel p){
        p.setSize(700, 400);
        p.setLocation(0,0);
        
        panContent.removeAll();
        panContent.add(p, BorderLayout.CENTER);
        panContent.revalidate();
        panContent.repaint();   
    }
    
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
            java.util.logging.Logger.getLogger(DashboardProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatLightLaf.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoriesPan;
    private javax.swing.JButton btnCustomersPan;
    private javax.swing.JButton btnOrdersPan;
    private javax.swing.JButton btnProductsPan;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panContent;
    private javax.swing.JPanel panMenu;
    // End of variables declaration//GEN-END:variables

}
