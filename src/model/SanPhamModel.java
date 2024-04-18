/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Nhu Pham
 */
public class SanPhamModel {
    private String maSP;
    private String tenSP;
    private double giabanSP;
    private double gianhapSP;
    private int soLuongSP;
    private String kichThuoc;
    private String chatLieu;
    private String maNCC;
    private String xuatXu;

    public SanPhamModel() {
    }

    public SanPhamModel(String maSP, String tenSP, double giabanSP, double gianhapSP, int soLuongSP, String kichThuoc, String chatLieu, String maNCC, String xuatXu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giabanSP = giabanSP;
        this.gianhapSP = gianhapSP;
        this.soLuongSP = soLuongSP;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.maNCC = maNCC;
        this.xuatXu = xuatXu;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiabanSP() {
        return giabanSP;
    }

    public void setGiabanSP(double giabanSP) {
        this.giabanSP = giabanSP;
    }

    public double getGianhapSP() {
        return gianhapSP;
    }

    public void setGianhapSP(double gianhapSP) {
        this.gianhapSP = gianhapSP;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maSP);
        hash = 29 * hash + Objects.hashCode(this.tenSP);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.giabanSP) ^ (Double.doubleToLongBits(this.giabanSP) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.gianhapSP) ^ (Double.doubleToLongBits(this.gianhapSP) >>> 32));
        hash = 29 * hash + this.soLuongSP;
        hash = 29 * hash + Objects.hashCode(this.kichThuoc);
        hash = 29 * hash + Objects.hashCode(this.chatLieu);
        hash = 29 * hash + Objects.hashCode(this.maNCC);
        hash = 29 * hash + Objects.hashCode(this.xuatXu);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SanPhamModel other = (SanPhamModel) obj;
        if (Double.doubleToLongBits(this.giabanSP) != Double.doubleToLongBits(other.giabanSP)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gianhapSP) != Double.doubleToLongBits(other.gianhapSP)) {
            return false;
        }
        if (this.soLuongSP != other.soLuongSP) {
            return false;
        }
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        if (!Objects.equals(this.tenSP, other.tenSP)) {
            return false;
        }
        if (!Objects.equals(this.kichThuoc, other.kichThuoc)) {
            return false;
        }
        if (!Objects.equals(this.chatLieu, other.chatLieu)) {
            return false;
        }
        if (!Objects.equals(this.maNCC, other.maNCC)) {
            return false;
        }
        return Objects.equals(this.xuatXu, other.xuatXu);
    }

    @Override
    public String toString() {
        return "SanPhamModel{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", giabanSP=" + giabanSP + ", gianhapSP=" + gianhapSP + ", soLuongSP=" + soLuongSP + ", kichThuoc=" + kichThuoc + ", chatLieu=" + chatLieu + ", maNCC=" + maNCC + ", xuatXu=" + xuatXu + '}';
    }
   
    
}
    
    