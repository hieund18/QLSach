/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxs18
 */
public class GhiFile {

    public static void ghiTaiKhoan(Object obj) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("CSDL\\TaiKhoan.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger("TaiKhoan.DAT", ex.getMessage());
        }
    }

    public static void ghiSach(Object obj) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("CSDL\\Sach.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger("Sach.DAT", ex.getMessage());
        }
    }

    public static void ghiGioHang(ArrayList<GioHang> list) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("CSDL\\GioHang.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger("GioHang.DAT", ex.getMessage());
        }
    }

    public static void ghiKhachHang(ArrayList<KhachHang> list) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("CSDL\\KhachHang.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger("KhachHang.DAT", ex.getMessage());
        }
    }

    public static void ghiHoaDonBan(ArrayList<HoaDonBan> list) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("CSDL\\HoaDonBan.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger("HoaDonBan.DAT", ex.getMessage());
        }
    }
}
