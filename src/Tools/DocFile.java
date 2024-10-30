/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxs18
 */
public class DocFile {

    public static ArrayList<TaiKhoan> docTaiKhoan() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CSDL\\TaiKhoan.DAT"));
            ArrayList<TaiKhoan> s = (ArrayList<TaiKhoan>) ois.readObject();
            ois.close();
            return s;
        } catch (FileNotFoundException ex) {
            Logger.getLogger("TaiKhoan.DAT", ex.getMessage());
            return new ArrayList<TaiKhoan>();
        }
    }

    public static ArrayList<Sach> docSach() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CSDL\\Sach.DAT"));
            ArrayList<Sach> s = (ArrayList<Sach>) ois.readObject();
            ois.close();
            return s;
        } catch (FileNotFoundException e) {
            Logger.getLogger("Sach.DAT", e.getMessage());
            return new ArrayList<Sach>();
        }
    }

    public static ArrayList<GioHang> docGioHang() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CSDL\\GioHang.DAT"));
            ArrayList<GioHang> list = (ArrayList<GioHang>) ois.readObject();
            ois.close();
            return list;
        } catch (FileNotFoundException e) {
            Logger.getLogger("GioHang.DAT", e.getMessage());
            return new ArrayList<GioHang>();
        }
    }

    public static ArrayList<KhachHang> docKhachHang() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CSDL\\KhachHang.DAT"));
            ArrayList<KhachHang> list = (ArrayList<KhachHang>) ois.readObject();
            ois.close();
            return list;
        } catch (FileNotFoundException e) {
            Logger.getLogger("KhachHang.DAT", e.getMessage());
            return new ArrayList<KhachHang>();
        }
    }

    public static ArrayList<HoaDonBan> docHoaDonBan() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CSDL\\HoaDonBan.DAT"));
            ArrayList<HoaDonBan> list = (ArrayList<HoaDonBan>) ois.readObject();
            ois.close();
            return list;
        } catch (FileNotFoundException e) {
            Logger.getLogger("HoaDonBan.DAT", e.getMessage());
            return new ArrayList<HoaDonBan>();
        }
    }
}
