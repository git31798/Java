/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyGiangVien;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class DSGV {

    private ArrayList<GiangVien> m = new ArrayList<>();

    public ArrayList<GiangVien> getM() {
        return m;
    }

    // 1.Thêm giảng viên vào danh sách
    public void them(GiangVien v) {
        m.add(v);
    }

    // 2.Xoá GV có mã chỉ định
    public int xoaMa(String ma) {
        for (int i = 0; i < m.size(); i++) {
            if (ma.equals(m.get(i).getMa())) {
                m.remove(i);
                return i;
            }
        }
        return -1;

    }

    // 3. Tính Trung bình (lương + phụ cấp) của GV cơ hữu
    public double tbLuongPC() {
        double s = 0;
        int d = 0;
        for (GiangVien v : m) {
            if (v instanceof GVCoHuu) {
                s += v.luong() + v.phuCap();
                d++;
            }
        }
        return (double) s / d;
    }

    // 4.Tìm GV có mã cho chỉ định
    public GiangVien timMa(String ma) {
        for (GiangVien v : m) {
            if (ma.equals(v.getMa())) {
                return v;
            }
        }
        return null;
    }

    // 4.Tìm GV có mã cho chỉ định Arr
    public ArrayList<GiangVien> timMaArr(String ma) {
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (GiangVien v : m) {
            if (ma.equals(v.getMa())) {
                arr.add(v);
            }
        }
        return arr;
    }

    // 5.Hiển thị danh sách GV cơ hữu
    public String xuatCoHuu() {
        String s = "";
        for (GiangVien v : m) {
            if (v instanceof GVCoHuu) {
                s += v.toString();
            }
        }
        return s;
    }

    // 5.Hiển thị danh sách GV cơ hữu Arr
    public ArrayList<GiangVien> xuatCoHuuArr() {
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (GiangVien v : m) {
            if (v instanceof GVCoHuu) {
                arr.add(v);

            }
        }
        return arr;
    }

    // 6.Hiển thị danh sách GV 
    public String xuat() {
        String s = "";
        for (GiangVien v : m) {
            s += v.toString();
        }
        return s;
    }

    // 6.Hiển thị danh sách GV Arr
    public ArrayList<GiangVien> xuatArr() {
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (GiangVien v : m) {
            arr.add(v);
        }
        return arr;
    }

    // 7. Trả về GV thứ i
    public GiangVien getGiangVien(int i) {
        return m.get(i);
    }

    // 9.xóa GV
    public void xoaGV(GiangVien v) {
        m.remove(v);
    }

    // 10.xóa GV thứ i
    public void xoaGVThui(int i) {
        m.remove(i);
    }

    // 11.chèn GV vào vị trí thứ i
    public void chen(int i, GiangVien v) {
        m.add(i, v);
    }

    // 12.sửa GV tại vị trí thứ i
    public GiangVien sua(int i, GiangVien v) {
        return m.set(i, v);
    }

    // 13.Tính tổng lương và phụ cấp của GV
    public double tongLuongPC() {
        double s = 0;
        for (GiangVien v : m) {
            s += v.luong() + v.phuCap();
        }
        return s;
    }

    //14. TB lương GV thỉnh giảng
    public double tbLuong() {
        double s = 0;
        int d = 0;
        for (GiangVien v : m) {
            if (v instanceof GVThinhGiang) {
                s += v.luong();
                d++;
            }
        }
        return (double) s / d;
    }

    // 16. tìm GV có phái chỉ định
    public String timPhai(boolean phai) {
        String s = "";
        for (GiangVien v : m) {
            if (phai == v.isPhai()) {
                s += v.toString() + "\n";
            }
        }
        return s;
    }

    // 16. tìm GV có phái chỉ định Arr
    public ArrayList<GiangVien> timPhaiArr(boolean phai) {
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (GiangVien v : m) {
            if (phai == v.isPhai()) {
                arr.add(v);
            }
        }
        return arr;
    }

    // 17. Xóa GV cơ hữu vào làm đúng ngày chỉ định
    public Vector xoaNgay(Date ngay) {
        Vector vt = new Vector();
        for (int i = 0; i < m.size(); i++) {
            if (((GVCoHuu) m.get(i)).getNgayVao().compareTo(ngay) == 0) {
                m.remove(i);
                vt.add(i);
            }
        }
        return vt;
    }

    // Xóa GV cơ hữu vào làm sau ngày chỉ định
    public Vector xoaNgaySau(Date ngay) {
        Vector vt = new Vector();
        for (int i = 0; i < m.size(); i++) {
            if (((GVCoHuu) m.get(i)).getNgayVao().compareTo(ngay) > 0) {
                m.remove(i);
                vt.add(i);
            }
        }
        return vt;
    }

// 19. Tìm GV cơ hữu sau ngày chỉ định
    public String timNgaySau(Date ngay) {
        String s = "";
        for (GiangVien v : m) {
            if (v instanceof GVCoHuu) {
                if (ngay.compareTo(((GVCoHuu) v).getNgayVao()) <= 0) {
                    s += v.toString() + "\n";
                }
            }
        }
        return s;
    }

    // 19. Tìm GV cơ hữu sau ngày chỉ định Arr
    public ArrayList<GiangVien> timNgaySauArr(Date ngay) {
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (GiangVien v : m) {
            if (v instanceof GVCoHuu) {
                if (ngay.compareTo(((GVCoHuu) v).getNgayVao()) <= 0) {
                    arr.add(v);
                }
            }
        }
        return arr;
    }

    // 20.Tìm GV có họ tên chỉ định
    public String timHoTen(String hoten) {
        String s = "";
        for (GiangVien v : m) {
            if (hoten.equals(v.getHoTen())) {
                s += v.toString() + "\n";
            }
        }
        return s;
    }

    // 20.Tìm GV có họ tên chỉ định Arr
    public ArrayList<GiangVien> timHoTenArr(String hoten) {
        ArrayList<GiangVien> arr = new ArrayList<>();
        for (GiangVien v : m) {
            if (hoten.equals(v.getHoTen())) {
                arr.add(v);
            }
        }
        return arr;
    }

    // 21.Tìm GV cuối cùng có lương cao nhất
    public GiangVien maxLuong() {
        int max = 0;
        for (int i = 1; i < m.size(); i++) {
            if (m.get(i).luong() >= m.get(max).luong()) {
                max = i;
            }
        }
        return m.get(max);
    }

    public static void main(String[] args) {
        DSGV ds = new DSGV();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so GV vien can them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap GV co huu hay thinh giang (ch or tg):");
            String s = sc.nextLine();
            System.out.println("Ma:");
            String ma = sc.nextLine();
            System.out.println("Ho ten:");
            String hoTen = sc.nextLine();
            System.out.println("So gio:");
            int soGio = sc.nextInt();
            System.out.println("Phai (Nam = true, Nu = false) :");
            boolean phai = sc.nextBoolean();
            sc.nextLine();
            GiangVien v;
            if (s.equals("ch")) {
                System.out.println("Nhap ngay vao:");
                String ngay = sc.nextLine();
                DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
                Date ngayVao = new Date();
                try {
                    ngayVao = df.parse(ngay);
                } catch (ParseException e) {
                }
                System.out.println("Nhap luong co ban:");
                Double luongCB = sc.nextDouble();
                v = new GVCoHuu(ngayVao, luongCB, ma, hoTen, soGio, phai);
            } else {
                System.out.println("Ma hop dong:");
                String maHopDong = sc.nextLine();
                v = new GVThinhGiang(maHopDong, ma, hoTen, soGio, phai);
            }
            ds.them(v);
            sc.nextLine();
        }

    }
}
