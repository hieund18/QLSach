/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DocFile;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Maxs18
 */
public class Sach implements Serializable {

    private String maSach;
    private String tenSach;
    private String tacGia;
    private String nhaXuatBan;
    private int namXuatBan;
    private int soTrang;
    private double donGia;
    private int soLuongCon;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, String nhaXuatBan, int namXuatBan, int soTrang, double donGia, int soLuongCon) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.soTrang = soTrang;
        this.donGia = donGia;
        this.soLuongCon = soLuongCon;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setMaSach(String maSach) throws Exception {
        if (maSach.trim().equals("")) {
            throw new Exception("Mã sách không được trống");
        }
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) throws Exception {
        if (tenSach.trim().equals("")) {
            throw new Exception("Tên sách không được trống");
        }
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) throws Exception {
        if (namXuatBan < 0) {
            throw new Exception("Năm xuất bản phải >= 0");
        }
        this.namXuatBan = namXuatBan;
    }

    public void setSoTrang(int soTrang) throws Exception {
        if (soTrang < 0) {
            throw new Exception("Số trang phải >=0");
        }
        this.soTrang = soTrang;
    }

    public void setDonGia(double donGia) throws Exception {
        if (donGia < 0) {
            throw new Exception("Đơn giá phải >=0");
        }
        this.donGia = donGia;
    }

    public void setSoLuongCon(int soLuongCon) throws Exception {
        if (soLuongCon < 0) {
            throw new Exception("Số lượng còn phải >=0");
        }
        this.soLuongCon = soLuongCon;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", nhaXuatBan=" + nhaXuatBan + ", namXuatBan=" + namXuatBan + ", soTrang=" + soTrang + ", donGia=" + donGia + ", soLuongCon=" + soLuongCon + '}';
    }

}
