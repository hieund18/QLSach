/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Maxs18
 */
public class HoaDonBan implements Serializable{
    private String maHD;
    private String ngayGD;
    private KhachHang KHMua;
    private ArrayList<GioHang> sachMua;
    private double thanhTien;

    public HoaDonBan() {
    }

    public HoaDonBan(String maHD, String ngayGD, KhachHang KHMua, ArrayList<GioHang> sachMua, double thanhTien) {
        this.maHD = maHD;
        this.ngayGD = ngayGD;
        this.KHMua = KHMua;
        this.sachMua = sachMua;
        this.thanhTien = thanhTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public KhachHang getKHMua() {
        return KHMua;
    }

    public void setKHMua(KhachHang KHMua) {
        this.KHMua = KHMua;
    }

    public ArrayList<GioHang> getSachMua() {
        return sachMua;
    }

    public void setSachMua(ArrayList<GioHang> sachMua) {
        this.sachMua = sachMua;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "HoaDonBan{" + "maHD=" + maHD + ", ngayGD=" + ngayGD + ", KHMua=" + KHMua + ", sachMua=" + sachMua + ", thanhTien=" + thanhTien + '}';
    }

}
