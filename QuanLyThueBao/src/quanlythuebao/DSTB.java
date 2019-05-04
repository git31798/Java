/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuebao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DSTB {

    private ArrayList<ThueBao> m = new ArrayList<ThueBao>();

    public ArrayList<ThueBao> getM() {
        return m;
    }

    //Them thue bao
    public void them(ThueBao tb) {
        m.add(tb);
    }

    //Xoa thue bao co ma chi dinh
    public void xoa(String ma) {
        for (ThueBao tb : m) {
            if (ma.equals(tb.getMaTB())) {
                m.remove(tb);
                break;
            }
        }
    }

    //Tinh tong tien phai tra TB tra sau
    public double tongTien() {
        double s = 0;
        for (ThueBao tb : m) {
            if (tb instanceof TBTraSau) {
                s += tb.tinhCuoc() - tb.khuyenMai();
            }
        }
        return s;
    }
//    //Tim cac thue bao tra sau co ngay chi dinh

    public String timNgay(Date ngay) {
        String s = "";
        for (ThueBao tb : m) {
            if (tb instanceof TBTraSau) {
                if (ngay.compareTo(tb.getNgayTB()) <= 0) {
                    s += tb.toString() + "\n";
                }
            }
        }
        return s;
    }

    // 6.Hiển thị danh sách TB bao gồm cuoc và khuyen mai
    public String xuat() {
        String s = "";
        for (ThueBao tb : m) {
            s += tb.toString() + ", Cuoc: " + tb.tinhCuoc() + ", Khuyen mai: " + tb.khuyenMai() + "}" + "\n";
        }
        return s;
    }

    //main
    public static void main(String[] args) {
        DSTB ds = new DSTB();
        int chon;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("====Menu===");
            System.out.println("1. Them TB");
            System.out.println("2. Xoa TB");
            System.out.println("3. Tinh tong tien cua TB tra sau");
            System.out.println("4. Tim thue bao tra sau ngay chi dinh");
            System.out.println("5. Hien thi danh sach thue bao");
            System.out.println("6. Thoat");
            System.out.println("Nhap chuong trinh can chay");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap so TB can them:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap TB tra truoc hay tra sau (tt or ts):");
                        String s = sc.nextLine();
                        System.out.println("Ma TB:");
                        String maTB = sc.nextLine();
                        System.out.println("Ten TB:");
                        String tenTB = sc.nextLine();
                        System.out.println("Khuyen mai :");
                        double khuyenMai = sc.nextDouble();
                        sc.nextLine();
                        ThueBao tb;
                        if (s.equals("tt")) {
                            System.out.println("Nhap tien nap:");
                            double tienNap = sc.nextDouble();
                            tb = new TBTraTruoc(tienNap, maTB, tenTB, khuyenMai);
                        } else {
                            System.out.println("So tin nhan:");
                            int soTinNhan = sc.nextInt();
                            System.out.println("So Cuoc Goi:");
                            int soCuocGoi = sc.nextInt();
                            System.out.println("Phi tin nhan:");
                            double phiTinNhan = sc.nextDouble();
                            System.out.println("Phi cuoc Goi:");
                            double phiCuocGoi = sc.nextDouble();
                            System.out.println("Nhap ngay TB:");
                            String ngay = sc.nextLine();
                            DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
                            Date ngayTB = new Date();
                            try {
                                ngayTB = df.parse(ngay);
                            } catch (ParseException e) {
                            }
                            tb = new TBTraSau(soTinNhan, soCuocGoi, phiTinNhan, phiCuocGoi, ngayTB, maTB, tenTB, khuyenMai);
                        }
                        ds.them(tb);
                        sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Nhap ma can xoa");
                    String ma = sc.nextLine();
                    ds.xoa(ma);
                    break;
                case 3:
                    System.out.println("Tong tien phai tra: " + ds.tongTien());
                    break;
                case 4:
                    System.out.println("Nhap ngay TB:");
                    String ngay = sc.nextLine();
                    DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
                    Date ngayTB = new Date();
                    try {
                        ngayTB = df.parse(ngay);
                    } catch (ParseException e) {
                    }
                    System.out.println("Cac thue bao tra sau co ngay chi dinh: " + ds.timNgay(ngayTB));
                    break;
                case 5:
                    System.out.println("Danh sach thue bao" + ds.xuat());
                    break;
            }

        } while (chon < 6);

    }
}
