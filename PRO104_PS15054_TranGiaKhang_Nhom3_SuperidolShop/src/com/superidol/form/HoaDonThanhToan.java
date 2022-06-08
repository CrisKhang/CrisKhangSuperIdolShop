/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superidol.form;

import com.superidol.model.SanPham;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonThanhToan extends javax.swing.JFrame {

    public static int maHoaDon;
    public static String tenKhachHang;
    public static Date ngayMuaHang;
    public static List<SanPham> sanPham;

    int textLegnthMax = 0;
    /**
     * Creates new form HoaDonThanhToan
     */
    public HoaDonThanhToan() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtHoaDonThanhToan.setText("*******************************************\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "*              Super Idol Shop            *\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "*******************************************\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "Hoá đơn số: " + maHoaDon + "\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "Khách hàng: " + tenKhachHang + "\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "Ngày mua hàng: " + ngayMuaHang + "\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "--------------------------------------------\n");
        double tongTien = 0;
        for (SanPham sp : sanPham) {
            txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + sp.getTenSanPham() + "\n" + sp.getSoLuongConLai() + "\t" + sp.getGiaBanRa() + "\t\n");
            tongTien += sp.getGiaBanRa() * sp.getSoLuongConLai();
        }
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText() + "--------------------------------------------\n");
        txtHoaDonThanhToan.setText(txtHoaDonThanhToan.getText()+"\t\t\t" + "Tổng tiền: " + tongTien + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtHoaDonThanhToan = new javax.swing.JTextArea();
        btnIn = new javax.swing.JButton();
        btnTroVe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtHoaDonThanhToan.setEditable(false);
        txtHoaDonThanhToan.setColumns(20);
        txtHoaDonThanhToan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtHoaDonThanhToan.setRows(5);
        txtHoaDonThanhToan.setText("*******************************\n*       Super Idol Shop                *\n*****************************\n");
        jScrollPane1.setViewportView(txtHoaDonThanhToan);

        btnIn.setText("In");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        btnTroVe.setText("Trở về");
        btnTroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTroVe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIn)
                    .addComponent(btnTroVe))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnTroVeActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        // TODO add your handling code here:
        try{
            txtHoaDonThanhToan.print();
        } catch (Exception ex){
            
        }
    }//GEN-LAST:event_btnInActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnTroVe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtHoaDonThanhToan;
    // End of variables declaration//GEN-END:variables
}