/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.GioHang;
import GUI.DangNhapUI;
import Tools.DocFile;
import Tools.GhiFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maxs18
 */
public class GioHangDAL {

    public static ArrayList<GioHang> listGioHang() {
        try {
            ArrayList<GioHang> list = DocFile.docGioHang();
            return list;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }

    }

    public static ArrayList<GioHang> listGioHangNow(String maTK) {
        try {
            ArrayList<GioHang> list = DocFile.docGioHang();
            ArrayList<GioHang> listGioHang = new ArrayList<>();
            for (GioHang item : list) {
                if (item.getMaTaiKhoan() != null && item.getMaTaiKhoan().equals(maTK)) {
                    listGioHang.add(item);
                }
            }
            return listGioHang;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }

    public static double tongTien(String maTK) {
        ArrayList<GioHang> list = listGioHangNow(maTK);
        double tien = 0.0;
        for (GioHang item : list) {
            tien = tien + item.getThanhTien();
        }
        return tien;
    }

    public static boolean insert(ArrayList<GioHang> list, GioHang gh) throws IOException, Exception {
        String maSachGioHang = "";
        if (gh.getSachChon() != null) {
            maSachGioHang = gh.getSachChon().getMaSach();
        }
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                String maTK = list.get(i).getMaTaiKhoan() + "";
                String maSach = "";
                if (list.get(i).getSachChon() != null) {
                    maSach = list.get(i).getSachChon().getMaSach();
                }
                if (maTK.equals(DangNhapUI.username) && maSach.equals(maSachGioHang)) {
                    list.get(i).setSoLuong(gh.getSoLuong() + list.get(i).getSoLuong());
                    GhiFile.ghiGioHang(list);
                    return true;
                }
            }
        }
        if (list == null) {
            list = new ArrayList<>();
        }

        list.add(gh);
        GhiFile.ghiGioHang(list);
        return true;
    }

    public static boolean delete(ArrayList<GioHang> list, GioHang gh) throws IOException {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaTaiKhoan().equals(gh.getMaTaiKhoan()) && list.get(i).getSachChon().getMaSach().equals(gh.getSachChon().getMaSach())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            list.remove(index);
            GhiFile.ghiGioHang(list);
            return true;

        } else {
            return false;
        }
    }

    public static boolean deleteAll(ArrayList<GioHang> list) throws Exception {
        if (listGioHangNow(DangNhapUI.username).isEmpty()) {
            throw new Exception("Không có sản phẩm để xóa");
        }
        ArrayList<GioHang> listXoa = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaTaiKhoan() != null && list.get(i).getMaTaiKhoan().equals(DangNhapUI.username)) {
                listXoa.add(list.get(i));
            }
        }
        list.removeAll(listXoa);
        GhiFile.ghiGioHang(list);
        return true;
    }
}
