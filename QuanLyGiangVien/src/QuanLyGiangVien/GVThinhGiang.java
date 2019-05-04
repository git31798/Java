/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyGiangVien;

/**
 *
 * @author Administrator
 */
public class GVThinhGiang extends GiangVien {

    private String maHopDong;

    public GVThinhGiang(String maHopDong, String ma, String hoTen, int soGio, boolean phai) {
        super(ma, hoTen, soGio, phai);
        this.maHopDong = maHopDong;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    @Override
    public String toString() {
        return "GVTinhGiang{" + super.toString() + ", maHopDong=" + maHopDong;
    }

    @Override
    public double luong() {
        return this.soGio * 100000;
    }

    @Override
    public double phuCap() {
        return 50000;
    }

}
