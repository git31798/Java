/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuebao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public abstract class ThueBao implements IThueBao {
    protected String maTB, tenTB;
    protected double khuyenMai;
    protected Date ngayTB;

    public ThueBao(String maTB, String tenTB, double khuyenMai) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.khuyenMai = khuyenMai;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public Date getNgayTB() {
        return ngayTB;
    }

    public void setNgayTB(Date ngayTB) {
        this.ngayTB = ngayTB;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
        return "ThueBao{" + "maTB=" + maTB + ", tenTB=" + tenTB + ", khuyenMai=" + khuyenMai + ", ngayTB=" + df.format(ngayTB)+ '}';
    }
    
    
    public abstract double khuyenMai();
    
}
