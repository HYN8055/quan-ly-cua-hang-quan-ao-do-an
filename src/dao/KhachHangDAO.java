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
import model.KhachHangModel;

/**
 *
 * @author Nhu Pham
 */
public class KhachHangDAO implements DAOInterface<KhachHangModel> {

    public static KhachHangDAO getInstance() {
        return new KhachHangDAO();
    }

    @Override
    public int insert(KhachHangModel k) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO KHACHHANG (makh, hoten, sdt, email) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, k.getMaKH());
            pst.setString(2, k.getTenKH());
            pst.setString(3, k.getSdtKH());
            pst.setString(4, k.getEmailKH());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Không thêm được khách hàng " + k.getMaKH(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(KhachHangModel k) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE KHACHHANG SET makh=?, hoten=?, sdt=?, email=?  WHERE makh=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, k.getMaKH());
            pst.setString(2, k.getTenKH());
            pst.setString(3, k.getSdtKH());
            pst.setString(4, k.getEmailKH());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;

    }

    @Override
    public int delete(KhachHangModel k) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM KHACHHANG WHERE makh=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, k.getMaKH());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<KhachHangModel> selectAll() {
        ArrayList<KhachHangModel> ketQua = new ArrayList<KhachHangModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM KHACHHANG";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maKH = rs.getString("makh");
                String tenKH = rs.getString("hoten");
                String sdtKH = rs.getString("sdt");
                String emailKH = rs.getString("email");
                KhachHangModel kh = new KhachHangModel(maKH, tenKH, sdtKH, emailKH);
                ketQua.add(kh);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public KhachHangModel selectById(String s) {
        KhachHangModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM KHACHHANG WHERE makh?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maKH = rs.getString("makh");
                String tenKH = rs.getString("hoten");
                String sdtKH = rs.getString("sdt");
                String emailKH = rs.getString("email");
                ketQua = new KhachHangModel(maKH, tenKH, sdtKH, emailKH);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}

