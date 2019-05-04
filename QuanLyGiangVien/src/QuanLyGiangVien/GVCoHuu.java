package QuanLyGiangVien;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GVCoHuu extends GiangVien {

    private Date ngayVao;
    private double luongCB;

    public GVCoHuu() {
        super(null, null, 0, false);
    }
    
    public GVCoHuu(Date ngayVao, double luongCB, String ma, String hoTen, int soGio, boolean phai) {
        super(ma, hoTen, soGio, phai);
        this.ngayVao = ngayVao;
        this.luongCB = luongCB;
    }

   
    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
        return "GVCoHuu{" + super.toString() + ", ngayVao=" + df.format(ngayVao) + ", luongCB=" + luongCB;
    }

    @Override
    public double luong() {
        return this.luongCB + this.soGio * 100000;
    }

    @Override
    public double phuCap() {
        long soNam = (Calendar.getInstance().getTime().getTime() - this.ngayVao.getTime()) / 1000 / 60 / 60 / 24 / 365;
        return soNam * 50000;
    }

}
