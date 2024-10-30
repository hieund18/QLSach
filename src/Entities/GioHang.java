/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.io.Serializable;

/**
 *
 * @author Maxs18
 */
public class GioHang implements Serializable{

    private String maTaiKhoan;
    private Sach sachChon;
    private int soLuong;
    private double thanhTien;

    public GioHang() {
    }

    public GioHang(String maTaiKhoan, Sach sachDat, int soLuong, double thanhTien) {
        this.maTaiKhoan = maTaiKhoan;
        this.sachChon = sachDat;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public Sach getSachChon() {
        return sachChon;
    }

    public void setSachChon(Sach sachChon) {
        this.sachChon = sachChon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) throws Exception {
        if (soLuong <= 0) {
            throw new Exception("Số lượng đặt phải lớn hơn 0");
        }
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien = soLuong * sachChon.getDonGia();
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "GioHang{" + "maTaiKhoan=" + maTaiKhoan + ", sachChon=" + sachChon + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }

}
