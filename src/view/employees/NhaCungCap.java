/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.employees;

import controller.emplyees.TimNhaCungCap;
import dao.NhaCungCapDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.NhaCungCapModel;
import view.employees.SuaNCC;

/**
 *
 * @author hyn09
 */
public class NhaCungCap extends javax.swing.JPanel implements ActionListener {

    private DefaultTableModel tblModel;
    private static ArrayList<NhaCungCapModel> armt;
    /**
     * Creates new form NhaCungCapJPanel
     */
    public NhaCungCap() {
        initComponents();
        jTable_NCC.setDefaultEditor(Object.class, null);
        initTable();
        armt = NhaCungCapDAO.getInstance().selectAll();
        loadDataToTable(armt);
}   
        public void loadDataToTable(ArrayList<NhaCungCapModel> ncc) {
        try {
            tblModel.setRowCount(0);
            for (NhaCungCapModel i : ncc) {
                tblModel.addRow(new Object[]{
                    i.getMaNCC(), i.getTenNCC(),i.getDiaChi(), i.getSdtNCC(), i.getEmailNCC()
                });
            }
        } catch (Exception e) {
        } 
    }
        
    public NhaCungCapModel getNhaCungCapSelect() {
        int i_row = jTable_NCC.getSelectedRow();
        NhaCungCapModel ncc = NhaCungCapDAO.getInstance().selectAll().get(i_row);
        return ncc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"Mã nhà cung cấp", "Tên nhà cung cấp","Địa chỉ", "Số điện thoại", "Email"};
        tblModel.setColumnIdentifiers(headerTbl);
        jTable_NCC.setModel(tblModel);
        jTable_NCC.getColumnModel().getColumn(0).setPreferredWidth(1);
        jTable_NCC.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable_NCC.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable_NCC.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable_NCC.getColumnModel().getColumn(4).setPreferredWidth(200);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        cbxlLuaChon = new javax.swing.JComboBox<>();
        txtSearchForm = new javax.swing.JTextField();
        btnXemCTNCC = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_NCC = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(230, 255, 243));

        btnThem.setBackground(new java.awt.Color(32, 178, 170));
        btnThem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(32, 178, 170));
        btnXoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        cbxlLuaChon.setBackground(new java.awt.Color(32, 178, 170));
        cbxlLuaChon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxlLuaChon.setForeground(new java.awt.Color(255, 255, 255));
        cbxlLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã hóa đơn", "Mã khách hàng", "Mã nhân viên" }));
        cbxlLuaChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxlLuaChonActionPerformed(evt);
            }
        });

        txtSearchForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchFormKeyReleased(evt);
            }
        });

        btnXemCTNCC.setBackground(new java.awt.Color(32, 178, 170));
        btnXemCTNCC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnXemCTNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnXemCTNCC.setText("Xem chi tiết");
        btnXemCTNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemCTNCCActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(32, 178, 170));
        btnSua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(32, 178, 170));
        btnRefresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSua)
                .addGap(36, 36, 36)
                .addComponent(btnXemCTNCC)
                .addGap(91, 91, 91)
                .addComponent(cbxlLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchForm, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxlLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchForm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemCTNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable_NCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable_NCC);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (jTable_NCC.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp muốn xoá");
        } else {
            int output = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá nhà cung cấp", "Xác nhận xoá nhà cung cấp", JOptionPane.YES_NO_OPTION);
            if (output == JOptionPane.YES_OPTION) {
                NhaCungCapDAO.getInstance().delete(getNhaCungCapSelect());
                JOptionPane.showMessageDialog(this, "Xóa thành công !");
                loadDataToTable(NhaCungCapDAO.getInstance().selectAll());
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbxlLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxlLuaChonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxlLuaChonActionPerformed

    private void btnXemCTNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemCTNCCActionPerformed
        // TODO add your handling code here:
        if (jTable_NCC.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp !");
        } else {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(NhaCungCap.this);
            XemCTNCC dialog = new XemCTNCC(this, parentFrame, true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnXemCTNCCActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (jTable_NCC.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp cần sửa");
        } else {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(NhaCungCap.this);
            SuaNCC dialog = new SuaNCC(this,parentFrame, true);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(NhaCungCap.this);
        ThemNCC dialog = new ThemNCC(this, parentFrame, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtSearchForm.setText("");
        cbxlLuaChon.setSelectedIndex(0);
        loadDataToTable(NhaCungCapDAO.getInstance().selectAll());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtSearchFormKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchFormKeyReleased
     // TODO add your handling code here:
        String luachon = (String) cbxlLuaChon.getSelectedItem();
        String searchContent = txtSearchForm.getText();
        ArrayList<NhaCungCapModel> result = new ArrayList<>();
        switch (luachon) {
            case "Tất cả":
                result = TimNhaCungCap.getInstance().searchTatCa(searchContent);
                break;
            case "Mã nhà cung cấp":
                result = TimNhaCungCap.getInstance().searchMaNCC(searchContent);
                break;
            case "Tên nhà cung cấp":
                result = TimNhaCungCap.getInstance().searchTenNCC(searchContent);
                break;
            case "Email":
                result = TimNhaCungCap.getInstance().searchEmail(searchContent);
                break;
            case "Địa chỉ":
                result = TimNhaCungCap.getInstance().searchDiaChi(searchContent);
                break;
            case "Số điện thoại":
                result = TimNhaCungCap.getInstance().searchSdt(searchContent);
                break;
        }
        loadDataToTable(result);
    }//GEN-LAST:event_txtSearchFormKeyReleased

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemCTNCC;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxlLuaChon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_NCC;
    private javax.swing.JTextField txtSearchForm;
    // End of variables declaration//GEN-END:variables
}
