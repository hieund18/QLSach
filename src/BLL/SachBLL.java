/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.SachDAL;
import Entities.Sach;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maxs18
 */
public class SachBLL extends AbstractTableModel {

    private String[] name = {"STT", "Mã sách", "Tên sách", "Tác giả", "Nhà xuất bản", "Năm xuất bản", "Số trang", "Đơn giá", "Số lượng còn"};
    private Class classes[] = {Integer.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Double.class, Integer.class};
    ArrayList<Sach> list = new ArrayList<>();

    public SachBLL(ArrayList<Sach> listSach) {
        list = listSach;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return (rowIndex + 1);
            case 1:
                return list.get(rowIndex).getMaSach();
            case 2:
                return list.get(rowIndex).getTenSach();
            case 3:
                return list.get(rowIndex).getTacGia();
            case 4:
                return list.get(rowIndex).getNhaXuatBan();
            case 5:
                return list.get(rowIndex).getNamXuatBan();
            case 6:
                return list.get(rowIndex).getSoTrang();
            case 7:
                return list.get(rowIndex).getDonGia();
            case 8:
                return list.get(rowIndex).getSoLuongCon();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
