
package model;

/**
 *
 * @author hyn09
 */
public class Taikhoan {
    private int id_taikhoan;
    private String ten_dn;
    private String mat_khau;
    private boolean status;

    public int getId_taikhoan() {
        return id_taikhoan;
    }

    public void setId_taikhoan(int id_taikhoan) {
        this.id_taikhoan = id_taikhoan;
    }

    public String getTen_dn() {
        return ten_dn;
    }

    public void setTen_dn(String ten_dn) {
        this.ten_dn = ten_dn;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
