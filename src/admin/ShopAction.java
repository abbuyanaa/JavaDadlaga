/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbconnector.dbconnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariunbuyan
 */
public class ShopAction extends javax.swing.JFrame {

    dbconnect db = new dbconnect();
    Dashboard d = new Dashboard();
    ResultSet urdun;

    String shopName, shopAddress;
    int get_id, xMouse, yMouse;

    /**
     * Creates new form ShopAction
     */
    public ShopAction(String get_shop_id) {
        initComponents();
        this.setLocation(250, 150);
        viewAddress.setLineWrap(true);

        urdun = db.login("select * from shops where id = " + get_shop_id);
        try {
            if (urdun.next()) {
                viewName.setText(urdun.getString("sname"));
                viewAddress.setText("address");
                get_id = Integer.parseInt(get_shop_id);
            } else {
                setVisible(false);
                d.setVisible(true);
                d.tabbedPane.setSelectedIndex(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShopAction.class.getName()).log(Level.SEVERE, null, ex);
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

        shop_bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewAddress = new javax.swing.JTextArea();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shop_bg.setBackground(new java.awt.Color(0, 51, 153));
        shop_bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                shop_bgMouseDragged(evt);
            }
        });
        shop_bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shop_bgMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Дэлгүүр засах устгах хэсэг");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Дэлгүүрийн нэр:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Дэлгүүрийн хаяг:");

        viewAddress.setColumns(20);
        viewAddress.setRows(5);
        jScrollPane1.setViewportView(viewAddress);

        updateBtn.setText("Засах");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Устгах");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Буцах");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shop_bgLayout = new javax.swing.GroupLayout(shop_bg);
        shop_bg.setLayout(shop_bgLayout);
        shop_bgLayout.setHorizontalGroup(
            shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_bgLayout.createSequentialGroup()
                .addGroup(shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, shop_bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, shop_bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(viewName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(shop_bgLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addGap(40, 40, 40)
                        .addComponent(updateBtn)
                        .addGap(9, 9, 9)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(shop_bgLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shop_bgLayout.setVerticalGroup(
            shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_bgLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(viewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shop_bgLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3))
                    .addGroup(shop_bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBtn)
                    .addGroup(shop_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn)
                        .addComponent(backBtn)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(shop_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        shopName = viewName.getText().toString().trim();
        shopAddress = viewAddress.getText().toString().trim();

        db.exec("update shops set sname = '" + shopName + "', "
                + "address = '" + shopAddress + "'"
                + "where id = " + get_id);
        setVisible(false);
        d.setVisible(true);
        d.Tbl_Shop_Hewleh();
        d.tabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            urdun = db.login("select * from baraa where sid = " + get_id);
            if (urdun.next()) {
                JOptionPane.showMessageDialog(null, "Устгах боломжгүй.");
            } else {
                db.exec("delete from shops where id = " + get_id);
                setVisible(false);
                d.setVisible(true);
                d.Tbl_Shop_Hewleh();
                d.tabbedPane.setSelectedIndex(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShopAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        d.tabbedPane.setSelectedIndex(1);
        d.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void shop_bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shop_bgMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_shop_bgMouseDragged

    private void shop_bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shop_bgMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_shop_bgMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel shop_bg;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextArea viewAddress;
    private javax.swing.JTextField viewName;
    // End of variables declaration//GEN-END:variables
}
