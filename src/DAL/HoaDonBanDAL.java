/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.HoaDonBan;
import Tools.DocFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxs18
 */
public class HoaDonBanDAL {

    public static ArrayList<HoaDonBan> listHoaDonBan() {
        try {
            ArrayList<HoaDonBan> list = new ArrayList<>();
            list = DocFile.docHoaDonBan();
            return list;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
//    public static boolean insert(ArrayList<HoaDonBan> list, HoaDonBan hd){
//        
//    }
}
