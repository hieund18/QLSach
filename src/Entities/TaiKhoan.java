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
public class TaiKhoan implements Serializable {

    protected String maTK;
    protected String matKhau;
    protected String vaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String maTK, String matKhau, String vaiTro) {
        this.maTK = maTK;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) throws Exception {
        if (maTK.trim().equals("")) {
            throw new Exception("Tài khoản không được trống");
        }
        this.maTK = maTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) throws Exception {
        if (matKhau.trim().equals("")) {
            throw new Exception("Mật khẩu không được trống");
        }
        if (matKhau.length() < 6) {
            throw new Exception("Mật khẩu phải chứa ít nhất 6 kí tự");
        }
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) throws Exception {
        if (vaiTro.trim().equals("")) {
            throw new Exception("Vai trò không được trống");
        }
        if (Integer.parseInt(vaiTro) != 1 && Integer.parseInt(vaiTro) != 0) {
            throw new Exception("Sai kiểu vai trò ! 0: Khách hàng. 1: Admin");
        }
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "maTK=" + maTK + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + '}';
    }

}
