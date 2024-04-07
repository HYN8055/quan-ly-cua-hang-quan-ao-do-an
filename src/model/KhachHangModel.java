/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Nhu Pham
 */
public class KhachHangModel {
    private String maKH;
    private String tenKH;
    private String sdtKH;
    private String emailKH;

    public KhachHangModel() {
    }

    public KhachHangModel(String maKH, String tenKH, String sdtKH, String emailKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdtKH = sdtKH;
        this.emailKH = emailKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getEmailKH() {
        return emailKH;
    }

    public void setEmailKH(String emailKH) {
        this.emailKH = emailKH;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.maKH);
        hash = 59 * hash + Objects.hashCode(this.tenKH);
        hash = 59 * hash + Objects.hashCode(this.sdtKH);
        hash = 59 * hash + Objects.hashCode(this.emailKH);
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
        final KhachHangModel other = (KhachHangModel) obj;
        if (!Objects.equals(this.maKH, other.maKH)) {
            return false;
        }
        if (!Objects.equals(this.tenKH, other.tenKH)) {
            return false;
        }
        if (!Objects.equals(this.sdtKH, other.sdtKH)) {
            return false;
        }
        return Objects.equals(this.emailKH, other.emailKH);
    }

    @Override
    public String toString() {
        return "KhachHangModel{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", sdtKH=" + sdtKH + ", emailKH=" + emailKH + '}';
    }
    
    
}
