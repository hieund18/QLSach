/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.KhachHang;
import Tools.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxs18
 */
public class KhachHangDAL {

    public static ArrayList<KhachHang> listKhachHang() {
        try {
            ArrayList<KhachHang> kh = DocFile.docKhachHang();
            return kh;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }

    public static KhachHang getKhachHang(String maTK) {
        try {
            ArrayList<KhachHang> list = DocFile.docKhachHang();
            for (KhachHang item : list) {
                if (item.getMaTK().equals(maTK)) {
                    return item;
                }
            }
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
        return null;
    }

    public static boolean update(ArrayList<KhachHang> list, KhachHang kh) throws IOException {
        if (list == null) {
            list = new ArrayList<>();
            list.add(kh);
        } else {
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaTK().equals(kh.getMaTK())) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                list.set(index, kh);
            } else {
                list.add(kh);
            }
        }
        GhiFile.ghiKhachHang(list);
        return true;
    }
}
