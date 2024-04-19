/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import database.OracleJDBCConnection;
import java.sql.Connection;
import model.NhaCungCapModel;

/**
 *
 * @author Nhu Pham
 */
public class NhaCungCapDAO implements DAOInterface<NhaCungCapModel> {

    public static NhaCungCapDAO getInstance() {
        return new NhaCungCapDAO();
    }

    @Override
    public int insert(NhaCungCapModel n) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO NHACUNGCAP (mancc, tenncc, diachi, sdt, email) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getMaNCC());
            pst.setString(2, n.getTenNCC());
            pst.setString(3, n.getDiaChi());
            pst.setString(4, n.getSdtNCC());
            pst.setString(5, n.getEmailNCC());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Không thêm được nhà cung cấp " + n.getMaNCC(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(NhaCungCapModel n) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE NHACUNGCAP SET tenncc='" + n.getTenNCC() + 
                    "', diachi='" + n.getDiaChi() + "', sdt='" + n.getSdtNCC() +"', email='" + 
                    n.getEmailNCC() +"'  WHERE mancc='" + n.getMaNCC() + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;

    }

    @Override
    public int delete(NhaCungCapModel n) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM NHACUNGCAP WHERE mancc=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getMaNCC());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<NhaCungCapModel> selectAll() {
        ArrayList<NhaCungCapModel> ketQua = new ArrayList<NhaCungCapModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM NHACUNGCAP";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maNCC = rs.getString("mancc");
                String tenNCC = rs.getString("tenncc");
                String diaChi = rs.getString("diachi");
                String sdtNCC = rs.getString("sdt");
                String emailNCC = rs.getString("email");
                NhaCungCapModel ncc = new NhaCungCapModel(maNCC, tenNCC, diaChi, sdtNCC, emailNCC);
                ketQua.add(ncc);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public NhaCungCapModel selectById(String s) {
        NhaCungCapModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM NHACUNGCAP WHERE mancc=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maNCC = rs.getString("mancc");
                String tenNCC = rs.getString("tenncc");
                String diaChi = rs.getString("diachi");
                String sdtNCC = rs.getString("sdt");
                String emailNCC = rs.getString("email");
                ketQua = new NhaCungCapModel(maNCC, tenNCC, diaChi, sdtNCC, emailNCC);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}

