/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.emplyees;
import dao.SanPhamDAO;
import java.util.ArrayList;
import model.SanPhamModel;

/**
 *
 * @author Nhu Pham
 */
public class TimSanPham {

    public static TimSanPham getInstance() {
        return new TimSanPham();
    }

    public ArrayList<SanPhamModel> searchTatCa(String text) {
        ArrayList<SanPhamModel> result = new ArrayList<>();
        ArrayList<SanPhamModel> arms = SanPhamDAO.getInstance().selectAll();
        for (var sp : arms) {
            if (sp.getMaSP().toLowerCase().contains(text.toLowerCase())
                    || sp.getTenSP().toLowerCase().contains(text.toLowerCase())
                    || sp.getXuatXu().toLowerCase().contains(text.toLowerCase())
                    ) {
                result.add(sp);
            }
        }
        return result;
    }

    public ArrayList<SanPhamModel> searchTenSP(String text) {
        ArrayList<SanPhamModel> result = new ArrayList<>();
        ArrayList<SanPhamModel> arms = SanPhamDAO.getInstance().selectAll();
        for (var sp : arms) {
            if (sp.getTenSP().toLowerCase().contains(text.toLowerCase())) {
                result.add(sp);
            }
        }
        return result;
    }

    public ArrayList<SanPhamModel> searchMaSP(String text) {
        ArrayList<SanPhamModel> result = new ArrayList<>();
        ArrayList<SanPhamModel> arms = SanPhamDAO.getInstance().selectAll();
        for (var sp : arms) {
            if (sp.getMaSP().toLowerCase().contains(text.toLowerCase())) {
                result.add(sp);
            }
        }
        return result;
    }
    
    public ArrayList<SanPhamModel> searchSoLuongSP(String text) {
        ArrayList<SanPhamModel> result = new ArrayList<>();
        ArrayList<SanPhamModel> arms = SanPhamDAO.getInstance().selectAll();
        for (var sp : arms) {
            if (text.length() != 0) {
                if (sp.getSoLuongSP() > Integer.parseInt(text)) {
                    result.add(sp);
                }
            } else {
                result.add(sp);
            }
        }
        return result;
    }
    
    public ArrayList<SanPhamModel> searchGiaSP(String text) {
        ArrayList<SanPhamModel> result = new ArrayList<>();
        ArrayList<SanPhamModel> arms = SanPhamDAO.getInstance().selectAll();
        for (var sp : arms) {
            if (text.length() != 0) {
                if (sp.getGiaSP() > Integer.parseInt(text)) {
                    result.add(sp);
                }
            }
            else {
                result.add(sp);
            }
        }
        return result;
    }

    public ArrayList<SanPhamModel> searchXuatXuSP(String text) {
        ArrayList<SanPhamModel> result = new ArrayList<>();
        ArrayList<SanPhamModel> arms = SanPhamDAO.getInstance().selectAll();
        for (var sp : arms) {
            if (sp.getXuatXu().toLowerCase().contains(text.toLowerCase())) {
                result.add(sp);
            }
        }
        return result;
    }
}

