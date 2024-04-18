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
public class NhaCungCapModel {
    private String maNCC;
    private String tenNCC;
    private String diaChi;
    private String sdtNCC;
    private String emailNCC;

    public NhaCungCapModel() {
    }

    public NhaCungCapModel(String maNCC, String tenNCC, String diaChi, String sdtNCC, String emailNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.sdtNCC = sdtNCC;
        this.emailNCC = emailNCC;
        this.diaChi = diaChi;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getSdtNCC() {
        return sdtNCC;
    }

    public void setSdtNCC(String sdtNCC) {
        this.sdtNCC = sdtNCC;
    }

    public String getEmailNCC() {
        return emailNCC;
    }

    public void setEmailNCC(String emailNCC) {
        this.emailNCC = emailNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maNCC);
        hash = 29 * hash + Objects.hashCode(this.tenNCC);
        hash = 29 * hash + Objects.hashCode(this.sdtNCC);
        hash = 29 * hash + Objects.hashCode(this.emailNCC);
        hash = 29 * hash + Objects.hashCode(this.diaChi);
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
        final NhaCungCapModel other = (NhaCungCapModel) obj;
        if (!Objects.equals(this.maNCC, other.maNCC)) {
            return false;
        }
        if (!Objects.equals(this.tenNCC, other.tenNCC)) {
            return false;
        }
        if (!Objects.equals(this.sdtNCC, other.sdtNCC)) {
            return false;
        }
        if (!Objects.equals(this.emailNCC, other.emailNCC)) {
            return false;
        }
        return Objects.equals(this.diaChi, other.diaChi);
    }

    @Override
    public String toString() {
        return "NhaCungCapModel{" + "maNCC=" + maNCC + ", tenNCC=" + tenNCC + ", sdtNCC=" + sdtNCC + ", emailNCC=" + emailNCC + ", diaChi=" + diaChi + '}';
    }
    
    
}
