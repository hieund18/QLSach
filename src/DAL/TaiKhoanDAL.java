/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.TaiKhoan;
import Tools.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxs18
 */
public class TaiKhoanDAL {

    public static ArrayList<TaiKhoan> listTaiKhoan() {
        try {
            ArrayList<TaiKhoan> list = DocFile.docTaiKhoan();
            Collections.sort(list, new Comparator<TaiKhoan>() {
                @Override
                public int compare(TaiKhoan o1, TaiKhoan o2) {
                    return o1.getVaiTro().compareTo(o2.getVaiTro());
                }
            });
            return list;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }

    public static boolean insert(ArrayList<TaiKhoan> list, TaiKhoan tk) throws Exception {
        for (var item : list) {
            if (item.getMaTK().equals(tk.getMaTK())) {
                throw new Exception("Tài khoản đã tồn tại");
            }
        }
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (tk.getMaTK().compareTo(list.get(i).getMaTK()) > 0) {
                index = i + 1;
            }
        }
        list.add(index, tk);
        GhiFile.ghiTaiKhoan(list);
        return true;
    }

    public static boolean update(ArrayList<TaiKhoan> list, TaiKhoan tk) throws Exception {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (tk.getMaTK().equals(list.get(i).getMaTK())) {
                index = i;
            }
        }
        if (index != -1) {
            list.set(index, tk);
            GhiFile.ghiTaiKhoan(list);
            return true;
        } else {
            throw new Exception("Tài khoản không tồn tại");
        }
    }

    public static boolean delete(ArrayList<TaiKhoan> list, TaiKhoan tk) throws Exception {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (tk.getMaTK().equals(list.get(i).getMaTK())) {
                index = i;
            }
        }
        if (index != -1) {
            list.remove(index);
            GhiFile.ghiTaiKhoan(list);
            return true;
        } else {
            throw new Exception("Tài khoản không tồn tại");
        }
    }
}
