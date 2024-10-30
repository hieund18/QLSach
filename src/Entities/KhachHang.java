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
public class KhachHang implements Serializable{

    private String maTK;
    private String hoTen;
    private String soDT;
    private String email;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String maTK, String hoTen, String soDT, String email, String diaChi) {
        this.maTK = maTK;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (hoTen.trim().equals("")) {
            throw new Exception("Họ tên không được để trống");
        }
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) throws Exception {
        String regex = "\\d{10}";
        if (soDT.trim().equals("")) {
            throw new Exception("Số điện thoại không được để trống");
        }
        if (!soDT.matches(regex)) {
            throw new Exception("Số điện thoại không hợp lệ");
        }
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.trim().equals("")) {
            throw new Exception("Email không được để trống");
        }
        String regex ="(\\S+)@(\\S+)$";
        if (!email.matches(regex)) {
            throw new Exception("Email không hợp lệ");
        }
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if (diaChi.trim().equals("")) {
            throw new Exception("Địa chỉ không được để trống");
        }
        this.diaChi = diaChi;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maTK=" + maTK + ", hoTen=" + hoTen + ", soDT=" + soDT + ", email=" + email + ", diaChi=" + diaChi + '}';
    }

}
