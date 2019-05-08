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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class GiangVienGUI extends javax.swing.JFrame {
    
    DSGV ds = new DSGV();
    DefaultTableModel dm = new DefaultTableModel();

    /**
     * Creates new form GiangVienGUI
     */
    public GiangVienGUI() {
        super("Cập nhật giảng viên");
        initComponents();
        this.jTable1.setModel(dm);
        String[] tenCot = {"Mã", "Họ tên", "Số giờ", "Phái", "Ngày vào", "Lương CB", "Mã hợp đồng"};
        dm.setColumnIdentifiers(tenCot);
        
    }
    
    private void xuatTable(ArrayList<GiangVien> m) {
        for (int i = dm.getRowCount() - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        for (GiangVien v : m) {
            if (v instanceof GVCoHuu) {
                DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
                dm.addRow(new Object[]{v.getMa(), v.getHoTen(), v.getSoGio(), (v.isPhai() ? "Nam" : "Nữ"), df.format(((GVCoHuu) v).getNgayVao()), ((GVCoHuu) v).getLuongCB()});
            } else {
                dm.addRow(new Object[]{v.getMa(), v.getHoTen(), v.getSoGio(), (v.isPhai() ? "Nam" : "Nữ"), "", "", ((GVThinhGiang) v).getMaHopDong()});
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfhoten = new javax.swing.JTextField();
        tfma = new javax.swing.JTextField();
        tfsogio = new javax.swing.JTextField();
        tfngayvao = new javax.swing.JTextField();
        tfluongcb = new javax.swing.JTextField();
        tfmahopdong = new javax.swing.JTextField();
        rbnam = new javax.swing.JRadioButton();
        rbnu = new javax.swing.JRadioButton();
        rbcohuu = new javax.swing.JRadioButton();
        rbthinhgiang = new javax.swing.JRadioButton();
        btthem = new javax.swing.JButton();
        btxoama = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bttimma = new javax.swing.JButton();
        bttbluong = new javax.swing.JButton();
        btxuatch = new javax.swing.JButton();
        btxuattable = new javax.swing.JButton();
        btxuatgvi = new javax.swing.JButton();
        btxoagv = new javax.swing.JButton();
        btxoagvi = new javax.swing.JButton();
        btchen = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        bttongluongpc = new javax.swing.JButton();
        bttbluongtg = new javax.swing.JButton();
        bttimphai = new javax.swing.JButton();
        btxoangay = new javax.swing.JButton();
        bttimngay = new javax.swing.JButton();
        bttimhoten = new javax.swing.JButton();
        btluongmax = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfhoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhotenActionPerformed(evt);
            }
        });

        tfma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmaActionPerformed(evt);
            }
        });

        tfsogio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsogioActionPerformed(evt);
            }
        });

        tfngayvao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfngayvaoActionPerformed(evt);
            }
        });

        tfluongcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfluongcbActionPerformed(evt);
            }
        });

        tfmahopdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmahopdongActionPerformed(evt);
            }
        });

        rbnam.setText("Nam");
        rbnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnamActionPerformed(evt);
            }
        });

        rbnu.setText("Nữ");
        rbnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnuActionPerformed(evt);
            }
        });

        rbcohuu.setText("Cơ hữu");

        rbthinhgiang.setText("Thỉnh giảng");

        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btxoama.setText("Xóa mã GV");
        btxoama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã Giảng Viên");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Số Giờ");

        jLabel4.setText("Lương CB");

        jLabel5.setText("Ngày Vào");

        jLabel7.setText("Mã Hợp Đồng");

        bttimma.setText("Tìm mã");
        bttimma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimmaActionPerformed(evt);
            }
        });

        bttbluong.setText("TB (Lương+PC) GVCH");
        bttbluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttbluongActionPerformed(evt);
            }
        });

        btxuatch.setText("Xuất Cơ Hữu");
        btxuatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxuatchActionPerformed(evt);
            }
        });

        btxuattable.setText("Xuất Table");
        btxuattable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxuattableActionPerformed(evt);
            }
        });

        btxuatgvi.setText("Xuất GV thứ i");
        btxuatgvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxuatgviActionPerformed(evt);
            }
        });

        btxoagv.setText("Xóa GV");
        btxoagv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoagvActionPerformed(evt);
            }
        });

        btxoagvi.setText("Xóa GV thứ i");
        btxoagvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoagviActionPerformed(evt);
            }
        });

        btchen.setText("Chèn");
        btchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchenActionPerformed(evt);
            }
        });

        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        bttongluongpc.setText("Tổng Lương + PC");
        bttongluongpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttongluongpcActionPerformed(evt);
            }
        });

        bttbluongtg.setText("TB lương GVTG");
        bttbluongtg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttbluongtgActionPerformed(evt);
            }
        });

        bttimphai.setText("Tìm phái");
        bttimphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimphaiActionPerformed(evt);
            }
        });

        btxoangay.setText("Xóa Ngày");
        btxoangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoangayActionPerformed(evt);
            }
        });

        bttimngay.setText("Tìm ngày");
        bttimngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimngayActionPerformed(evt);
            }
        });

        bttimhoten.setText("Tìm họ Tên");
        bttimhoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimhotenActionPerformed(evt);
            }
        });

        btluongmax.setText("Lương max");
        btluongmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluongmaxActionPerformed(evt);
            }
        });

        jLabel8.setText("Phái");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Họ tên", "Số giờ", "Phái", "Ngày vào", "Lương CB", "Mã hợp đồng"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bttbluongtg, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btxuatgvi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rbnam, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btxoagv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btxoama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btxoagvi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bttbluong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttimphai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btxoangay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfhoten, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(tfma)
                                        .addComponent(tfsogio)))
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(17, 17, 17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbnu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfmahopdong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(tfluongcb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfngayvao, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(118, 118, 118))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rbcohuu)
                                        .addGap(47, 47, 47)
                                        .addComponent(rbthinhgiang)
                                        .addGap(79, 79, 79))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btchen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bttimma, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btxuatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btxuattable, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bttongluongpc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(bttimngay, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(bttimhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btluongmax, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(tfngayvao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfmahopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfsogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbnam)
                            .addComponent(rbnu)
                            .addComponent(rbcohuu)
                            .addComponent(rbthinhgiang)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttimma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btthem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btxoama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttbluong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btxuatch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btxuattable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btxuatgvi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btxoagv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btxoagvi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btchen, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttongluongpc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttbluongtg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimphai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btxoangay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btluongmax, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimngay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfhotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfhotenActionPerformed

    private void tfmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmaActionPerformed

    private void tfsogioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsogioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsogioActionPerformed

    private void tfngayvaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfngayvaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfngayvaoActionPerformed

    private void tfluongcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfluongcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfluongcbActionPerformed

    private void tfmahopdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmahopdongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmahopdongActionPerformed

    private void rbnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnamActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        // TODO add your handling code here:
        String ma = this.tfma.getText();
        String ht = this.tfhoten.getText();
        int sg = Integer.parseInt(this.tfsogio.getText());
        boolean phai = true;
        if (this.rbnu.isSelected()) {
            phai = false;
        }
        GiangVien v;
        if (this.rbcohuu.isSelected()) {
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date nv = new Date();
            try {
                nv = df.parse(this.tfngayvao.getText());
            } catch (ParseException ex) {
            }
            double luongCB = Double.parseDouble(this.tfluongcb.getText());
            v = new GVCoHuu(nv, luongCB, ma, ht, sg, phai);
        } else {
            String maHD = this.tfmahopdong.getText();
            v = new GVThinhGiang(maHD, ma, ht, sg, phai);
        }
        ds.them(v);
        xuatTable(ds.getM());
    }//GEN-LAST:event_btthemActionPerformed

    private void btxoamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoamaActionPerformed
        // TODO add your handling code here:
        int i = ds.xoaMa(this.tfma.getText());
        if (i != -1) {
            dm.removeRow(i);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy GV có mã" + this.tfma.getText());
        }
        this.xuatTable(ds.getM());
    }//GEN-LAST:event_btxoamaActionPerformed

    private void rbnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnuActionPerformed

    private void btchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchenActionPerformed
        // TODO add your handling code here:
        String ma = this.tfma.getText();
        String ht = this.tfhoten.getText();
        int sg = Integer.parseInt(this.tfsogio.getText());
        boolean phai = true;
        if (this.rbnu.isSelected()) {
            phai = false;
        }
        GiangVien v;
        if (this.rbcohuu.isSelected()) {
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date nv = new Date();
            try {
                nv = df.parse(this.tfngayvao.getText());
            } catch (ParseException ex) {
            }
            double luongCB = Double.parseDouble(this.tfluongcb.getText());
            v = new GVCoHuu(nv, luongCB, ma, ht, sg, phai);
        } else {
            String maHD = this.tfmahopdong.getText();
            v = new GVThinhGiang(maHD, ma, ht, sg, phai);
        }
        int i = this.jTable1.getSelectedRow();
        ds.chen(i, v);
        this.xuatTable(ds.getM());

    }//GEN-LAST:event_btchenActionPerformed

    private void bttimngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimngayActionPerformed
        // TODO add your handling code here:
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {
            //JOptionPane.showConfirmDialog(this, ds.timNgaySau(df.parse(this.tfngayvao.getText())));
            ArrayList<GiangVien> arr = ds.timNgaySauArr(df.parse(this.tfngayvao.getText()));
            this.xuatTable(arr);
        } catch (ParseException ex) {
        }

    }//GEN-LAST:event_bttimngayActionPerformed

    private void btxuattableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxuattableActionPerformed
        // TODO add your handling code here:
        ArrayList<GiangVien> arr = ds.xuatArr();
        this.xuatTable(arr);
    }//GEN-LAST:event_btxuattableActionPerformed

    private void btxuatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxuatchActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "Danh sách GV Cơ hữu:\n" + ds.xuatCoHuu());
        ArrayList<GiangVien> arr = ds.xuatCoHuuArr();
        this.xuatTable(arr);
        

    }//GEN-LAST:event_btxuatchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = this.jTable1.getSelectedRow();
        GiangVien v = ds.getGiangVien(i);
        this.tfma.setText(v.getMa());
        this.tfhoten.setText(v.getHoTen());
        this.tfsogio.setText("" + v.getSoGio());
        if (v.isPhai()) {
            this.rbnam.setSelected(true);
        } else {
            this.rbnu.setSelected(true);
        }
        if (v instanceof GVCoHuu) {
            this.rbcohuu.setSelected(true);
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            this.tfngayvao.setText(df.format(((GVCoHuu) v).getNgayVao()));
            this.tfluongcb.setText("" + ((GVCoHuu) v).getLuongCB());
        } else {
            this.rbthinhgiang.setSelected(true);
            this.tfmahopdong.setText("" + ((GVThinhGiang) v).getMaHopDong());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void bttbluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttbluongActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Trung Bình (lương+PC) GVCH: " + ds.tbLuongPC());
    }//GEN-LAST:event_bttbluongActionPerformed

    private void bttimmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimmaActionPerformed
        // TODO add your handling code here:
        ArrayList<GiangVien> arr = ds.timMaArr(this.tfma.getText());
        if (arr != null) {
            //JOptionPane.showMessageDialog(this, v.toString());
            this.xuatTable(arr);
        } else {
            JOptionPane.showConfirmDialog(this, "Không tìm thấy GV mã " + this.tfma.getText());
        }

    }//GEN-LAST:event_bttimmaActionPerformed

    private void btxuatgviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxuatgviActionPerformed
        // TODO add your handling code here:
        int i = this.jTable1.getSelectedRow();
        JOptionPane.showMessageDialog(this, ds.getGiangVien(i));
    }//GEN-LAST:event_btxuatgviActionPerformed

    private void btxoagvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoagvActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btxoagvActionPerformed

    private void btxoagviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoagviActionPerformed
        // TODO add your handling code here:
        int i = this.jTable1.getSelectedRow();
        dm.removeRow(i);
        ds.xoaGVThui(i);
    }//GEN-LAST:event_btxoagviActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        // TODO add your handling code here:
        String ma = this.tfma.getText();
        String ht = this.tfhoten.getText();
        int sg = Integer.parseInt(this.tfsogio.getText());
        boolean phai = true;
        if (this.rbnu.isSelected()) {
            phai = false;
        }
        GiangVien v;
        int i = this.jTable1.getSelectedRow();
        if (this.rbcohuu.isSelected()) {
            DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date nv = new Date();
            try {
                nv = df.parse(this.tfngayvao.getText());
            } catch (ParseException ex) {
            }
            double luongCB = Double.parseDouble(this.tfluongcb.getText());
            v = new GVCoHuu(nv, luongCB, ma, ht, sg, phai);
            dm.removeRow(i);
            dm.insertRow(i, new Object[]{ma, ht, sg, phai, nv, luongCB});
        } else {
            String maHD = this.tfmahopdong.getText();
            v = new GVThinhGiang(maHD, ma, ht, sg, phai);
            dm.removeRow(i);
            dm.insertRow(i, new Object[]{ma, ht, sg, phai, maHD});
        }
        ds.sua(i, v);
        this.xuatTable(ds.getM());

    }//GEN-LAST:event_btsuaActionPerformed

    private void bttongluongpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttongluongpcActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Tổng Lương + PC của GV: " + ds.tongLuongPC());
    }//GEN-LAST:event_bttongluongpcActionPerformed

    private void bttbluongtgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttbluongtgActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Trung bình lương GVTG: " + ds.tbLuong());
    }//GEN-LAST:event_bttbluongtgActionPerformed

    private void bttimphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimphaiActionPerformed
        // TODO add your handling code here:

        if (this.rbnu.isSelected()) {
            //JOptionPane.showConfirmDialog(this, "Danh sách phái " + (this.rbnu.isSelected() ? "Nam" : "Nữ") + "\n" + ds.timPhai(false));
            ArrayList<GiangVien> arr = ds.timPhaiArr(false);
            this.xuatTable(arr);
        } else {
            // JOptionPane.showConfirmDialog(this, "Danh sách phái " + (this.rbnam.isSelected() ? "Nam" : "Nữ") + "\n" + ds.timPhai(true));
            ArrayList<GiangVien> arr = ds.timPhaiArr(true);
            this.xuatTable(arr);
        }
    }//GEN-LAST:event_bttimphaiActionPerformed

    private void btxoangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoangayActionPerformed
        // TODO add your handling code here:
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date ngay = new Date();
        try {
            ngay = df.parse(this.tfngayvao.getText());
        } catch (ParseException ex) {
        }
        Vector vt = ds.xoaNgay(ngay);
        for (int i = vt.size() - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        this.xuatTable(ds.getM());
    }//GEN-LAST:event_btxoangayActionPerformed

    private void bttimhotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimhotenActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, ds.timHoTen(this.tfhoten.getText()));
        ArrayList<GiangVien> arr = ds.timHoTenArr(this.tfhoten.getText());
        this.xuatTable(arr);
    }//GEN-LAST:event_bttimhotenActionPerformed

    private void btluongmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluongmaxActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, ds.maxLuong());
    }//GEN-LAST:event_btluongmaxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiangVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiangVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiangVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiangVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiangVienGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btchen;
    private javax.swing.JButton btluongmax;
    private javax.swing.JButton btsua;
    private javax.swing.JButton bttbluong;
    private javax.swing.JButton bttbluongtg;
    private javax.swing.JButton btthem;
    private javax.swing.JButton bttimhoten;
    private javax.swing.JButton bttimma;
    private javax.swing.JButton bttimngay;
    private javax.swing.JButton bttimphai;
    private javax.swing.JButton bttongluongpc;
    private javax.swing.JButton btxoagv;
    private javax.swing.JButton btxoagvi;
    private javax.swing.JButton btxoama;
    private javax.swing.JButton btxoangay;
    private javax.swing.JButton btxuatch;
    private javax.swing.JButton btxuatgvi;
    private javax.swing.JButton btxuattable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbcohuu;
    private javax.swing.JRadioButton rbnam;
    private javax.swing.JRadioButton rbnu;
    private javax.swing.JRadioButton rbthinhgiang;
    private javax.swing.JTextField tfhoten;
    private javax.swing.JTextField tfluongcb;
    private javax.swing.JTextField tfma;
    private javax.swing.JTextField tfmahopdong;
    private javax.swing.JTextField tfngayvao;
    private javax.swing.JTextField tfsogio;
    // End of variables declaration//GEN-END:variables
}
