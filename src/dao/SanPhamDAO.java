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
import model.SanPhamModel;

/**
 *
 * @author Nhu Pham
 */
public class SanPhamDAO implements DAOInterface<SanPhamModel> {

    public static SanPhamDAO getInstance() {
        return new SanPhamDAO();
    }

    @Override
    public int insert(model.SanPhamModel s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "INSERT INTO SANPHAM (masp, tensp, soluong, giaban, xuatxu) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getMaSP());
            pst.setString(2, s.getTenSP());
            pst.setInt(3, s.getSoLuongSP());
            pst.setDouble(4, s.getGiaSP());
            pst.setString(5, s.getXuatXu());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Không thêm được sản phẩm " + s.getMaSP(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(model.SanPhamModel s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "UPDATE SANPHAM SET masp=?, tensp=?, soluong=?, giaban=?, xuatxu=?  WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getMaSP());
            pst.setString(2, s.getTenSP());
            pst.setInt(3, s.getSoLuongSP());
            pst.setDouble(4, s.getGiaSP());
            pst.setString(5, s.getXuatXu());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;

    }

    @Override
    public int delete(model.SanPhamModel s) {
        int ketQua = 0;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "DELETE FROM SANPHAM WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getMaSP());
            ketQua = pst.executeUpdate();
            OracleJDBCConnection.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<SanPhamModel> selectAll() {
        ArrayList<SanPhamModel> ketQua = new ArrayList<SanPhamModel>();
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM SANPHAM";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString("masp");
                String tenSP = rs.getString("tensp");
                double giaSP = rs.getDouble("giaban");
                int soLuongSP = rs.getInt("soluong");
                String xuatXu = rs.getString("xuatxu");
                SanPhamModel sp = new SanPhamModel(maSP, tenSP, giaSP, soLuongSP, xuatXu);
                ketQua.add(sp);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public model.SanPhamModel selectById(String s) {
        model.SanPhamModel ketQua = null;
        try {
            Connection con = OracleJDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM SANPHAM WHERE masp=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSP = rs.getString("masp");
                String tenSP = rs.getString("tensp");
                double giaSP = rs.getDouble("giasp");
                int soLuongSP = rs.getInt("soluong");
                String xuatXu = rs.getString("xuatxu");
                ketQua = new model.SanPhamModel(maSP, tenSP, giaSP, soLuongSP, xuatXu);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}

