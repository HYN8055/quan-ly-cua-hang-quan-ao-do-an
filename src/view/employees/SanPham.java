
package view.employees;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.ArrayList;
import dao.SanPhamDAO;
import javax.swing.table.TableColumn;
import model.SanPhamModel;



//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;



/**
 *
 * @author hyn09
 */
public class SanPham extends javax.swing.JPanel implements ActionListener{
    private DefaultTableModel tblModel;
    private static ArrayList<SanPhamModel> arms;
   
    public SanPham() {
        initComponents();
        jTable1_SP.setDefaultEditor(Object.class, null);
        initTable();
        arms = SanPhamDAO.getInstance().selectAll();
        loadDataToTable(arms);
        
        btnThem.addActionListener((ActionEvent e) -> {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(SanPham.this);
                ThemSP dialog = new ThemSP(parentFrame, true);
                dialog.setVisible(true);});
        btnSua.addActionListener((ActionEvent e) -> {
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(SanPham.this);
        SuaSP dialog = new SuaSP(parentFrame, true);
        dialog.setVisible(true);
    });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public final void initTable() {
        tblModel = new DefaultTableModel();
        String[] headerTbl = new String[]{"Mã SP", "Tên sản phẩm","Số lượng", "Giá", "Xuất xứ"};
        tblModel.setColumnIdentifiers(headerTbl);
        jTable1_SP.setModel(tblModel);
        jTable1_SP.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1_SP.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTable1_SP.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable1_SP.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable1_SP.getColumnModel().getColumn(3).setPreferredWidth(200);
        
    }

    public void loadDataToTable(ArrayList<SanPhamModel> sp) {
        try {
            tblModel.setRowCount(0);
            for (SanPhamModel i : sp) {
                tblModel.addRow(new Object[]{
                    i.getMaSP(), i.getTenSP(), i.getSoLuongSP(), i.getGiaSP(),
                    i.getXuatXu()
                });
            }
        } catch (Exception e) {
        }
    }

    public SanPhamModel getSPSelect() {
        int i_row = jTable1_SP.getSelectedRow();
        SanPhamModel sp = SanPhamDAO.getInstance().selectAll().get(i_row);
        return sp;
    }
//    public SanPham() {
//        initTable();
//        initTable();
//        
//        btnThem.addActionListener((ActionEvent e) -> {
//    JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(SanPham.this);
//                ThemXoaSua dialog = new ThemXoaSua(parentFrame, true);
//                dialog.setVisible(true);
//        });
//        btnSua.addActionListener((ActionEvent e) -> {
//        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(SanPham.this);
//        ThemXoaSua dialog = new ThemXoaSua(parentFrame, true);
//        dialog.setVisible(true);
//    });
//    }
//    /*private void initButtonEvent() {
//        btnThem = new JButton("Thêm");
//        btnThem.addMouseListener(new MouseAdapter() {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            // Hiển thị khung Thêm sản phẩm từ file ThemXoaSua
//            ThemXoaSua dialog = new ThemXoaSua();
//            dialog.setTitle("Thêm Sản Phẩm");
//            dialog.setVisible(true);
//        }
//    });
//    // Thêm nút "Thêm" vào JPanel
//    add(btnThem);
//    }*/
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    private void initTable() {
//        Object[][] data = {
//            {"1", "Áo thun", "Vàng", "ML"},
//            {"2", "Quần Jean", "Xanh", "XL"},
//            {"3", "Áo Sơ Mi", "Trắng", "M"},
//            {"4", "Quần Short", "Đen", "L"},
//            {"5", "Áo len", "Xám", "M"},
//            {"6", "Áo khoác", "Đen", "L"},
//            {"7", "Quần Jogger", "Navy", "S"},
//            {"8", "Áo phông", "Đỏ", "XL"}
//        };
//
//        // Tiêu đề cột
//        String[] columnNames = {"ID", "Tên", "Màu sắc", "Kích thước"};
//
//        // Tạo một đối tượng DefaultTableModel với dữ liệu và tiêu đề cột đã cho
//        DefaultTableModel model = new DefaultTableModel(data, columnNames);
//
//        // Tạo JTable với DefaultTableModel đã tạo
//        JTable table = new JTable(model);
//
//        // Tạo JScrollPane để hiển thị JTable nếu cần
//        JScrollPane scrollPane = new JScrollPane(table);
//
//        // Thêm JScrollPane chứa JTable vào JPanel table_sanpham
//        table_sanpham.setLayout(new BorderLayout());
//        table_sanpham.add(scrollPane, BorderLayout.CENTER);
     
//    }

    

    // Khai báo JPanel table_sanpham
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        btnxoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_SP = new javax.swing.JTable();

        popupMenu1.setLabel("popupMenu1");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnxoa.setBackground(new java.awt.Color(32, 178, 170));
        btnxoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(255, 255, 255));
        btnxoa.setText("Xóa");

        btnSua.setBackground(new java.awt.Color(32, 178, 170));
        btnSua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");

        jComboBox1.setBackground(new java.awt.Color(32, 178, 170));
        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mã sản phẩm", "Tên sản phẩm", "Màu sắc", "Kích cỡ" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setText("Nhập nội dung tìm kiếm... ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(32, 178, 170));
        btnThem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jTable1_SP.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1_SP.setRowHeight(30);
        jTable1_SP.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1_SP.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1_SP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnThemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_SP;
    private javax.swing.JTextField jTextField1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
