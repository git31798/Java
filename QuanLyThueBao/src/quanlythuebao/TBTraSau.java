/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuebao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class TBTraSau extends ThueBao {

    private int soTinNhan, soCuocGoi;
    private double phiTinNhan, phiCuocGoi;

    public TBTraSau(int soTinNhan, int soCuocGoi, double phiTinNhan, double phiCuocGoi, Date ngayTB, String maTB, String tenTB, double khuyenMai) {
        super(maTB, tenTB, khuyenMai);
        this.soTinNhan = soTinNhan;
        this.soCuocGoi = soCuocGoi;
        this.phiTinNhan = phiTinNhan;
        this.phiCuocGoi = phiCuocGoi;
        this.ngayTB = ngayTB;
    }

    public int getSoTinNhan() {
        return soTinNhan;
    }

    public void setSoTinNhan(int soTinNhan) {
        this.soTinNhan = soTinNhan;
    }

    public int getSoCuocGoi() {
        return soCuocGoi;
    }

    public void setSoCuocGoi(int soCuocGoi) {
        this.soCuocGoi = soCuocGoi;
    }

    public double getPhiTinNhan() {
        return phiTinNhan;
    }

    public void setPhiTinNhan(double phiTinNhan) {
        this.phiTinNhan = phiTinNhan;
    }

    public double getPhiCuocGoi() {
        return phiCuocGoi;
    }

    public void setPhiCuocGoi(double phiCuocGoi) {
        this.phiCuocGoi = phiCuocGoi;
    }

    @Override
    public String toString() {
        return "TBTraSau{" + "soTinNhan=" + soTinNhan + ", soCuocGoi=" + soCuocGoi + ", phiTinNhan=" + phiTinNhan + ", phiCuocGoi=" + phiCuocGoi + '}';
    }

    @Override
    public double tinhCuoc() {
        return this.soTinNhan * this.phiTinNhan + this.soCuocGoi * phiCuocGoi;
    }

    @Override
    public double khuyenMai() {
        long soNgay = (Calendar.getInstance().getTime().getTime() - this.ngayTB.getTime()) / 1000 / 60 / 60 / 24;
        return this.khuyenMai * soNgay;
    }

}
