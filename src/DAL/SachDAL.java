/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.Sach;
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
public class SachDAL {

    public static ArrayList<Sach> listSach() {
        try {
            ArrayList<Sach> s = new ArrayList<>();
            s = DocFile.docSach();
            return s;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }

    public static Sach getSach(String tenSach) {
        ArrayList<Sach> s = listSach();
        for (var item : s) {
            if (tenSach.equalsIgnoreCase(item.getTenSach())) {
                return item;
            }
        }
        return null;
    }

    public static boolean insert(ArrayList<Sach> list, Sach s) throws Exception {
        for (var item : list) {
            if (item.getMaSach().equals(s.getMaSach())) {
                throw new Exception("Mã sách đã tồn tại");
            }
        }
        int index = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (s.getMaSach().compareTo(list.get(i).getMaSach()) > 0) {
                index = i + 1;
            }
        }
        list.add(index, s);
        GhiFile.ghiSach(list);
        return true;
    }

    public static boolean update(ArrayList<Sach> list, Sach s) throws Exception {
        int index = -1;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getMaSach().equals(s.getMaSach())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int rs = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn cập nhật ?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                list.set(index, s);
                GhiFile.ghiSach(list);
                return true;
            } else {
                return false;
            }
        } else {
            throw new Exception("Mã sách không tồn tại");
        }
    }

    public static boolean delete(ArrayList<Sach> list, Sach s) throws Exception {
        int index = -1;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getMaSach().equals(s.getMaSach())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            int rs = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa ?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                list.remove(index);
                GhiFile.ghiSach(list);
                return true;
            } else {
                return false;
            }
        } else {
            throw new Exception("Mã sách không tồn tại");
        }
    }
}
