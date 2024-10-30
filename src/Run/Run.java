/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

import Entities.*;
import GUI.DangNhapUI;
import Tools.GhiFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxs18
 */
public class Run {
    public static void main(String[] args) {
        ArrayList<TaiKhoan> listTK = new ArrayList<>();
        TaiKhoan admin = new TaiKhoan("admin", "123", "1");
        TaiKhoan user = new TaiKhoan("user", "123", "0");
        
        listTK.add(admin);
        listTK.add(user);
        try {
            GhiFile.ghiTaiKhoan(listTK);
        } catch (IOException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DangNhapUI dn = new DangNhapUI();
        dn.setVisible(true);
    }
}
