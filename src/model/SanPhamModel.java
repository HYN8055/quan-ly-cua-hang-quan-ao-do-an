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
    private int soLuongSP;
    private double giaSP;
    private String xuatXu;

    public SanPhamModel() {
    }
    
    public SanPhamModel(String maSP, String tenSP, int soLuongSP, double giaSP, String xuatXu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.soLuongSP = soLuongSP;
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

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.maSP);
        hash = 17 * hash + Objects.hashCode(this.tenSP);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.giaSP) ^ (Double.doubleToLongBits(this.giaSP) >>> 32));
        hash = 17 * hash + this.soLuongSP;
        hash = 17 * hash + Objects.hashCode(this.xuatXu);
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
        if (Double.doubleToLongBits(this.giaSP) != Double.doubleToLongBits(other.giaSP)) {
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
        return Objects.equals(this.xuatXu, other.xuatXu);
    }

    @Override
    public String toString() {
        return "SanPhamModel{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", giaSP=" + giaSP + ", soLuongSP=" + soLuongSP + ", xuatXu=" + xuatXu + '}';
    }
    
    
}
