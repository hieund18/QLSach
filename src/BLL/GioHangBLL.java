/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import Entities.GioHang;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maxs18
 */
public class GioHangBLL extends AbstractTableModel {

    private String[] name = {"STT", "Mã sách", "Tên sách", "Đơn giá", "Số lượng", "Thành tiền"};
    private Class classes[] = {Integer.class, String.class, String.class, Double.class, Integer.class, Double.class};
    ArrayList<GioHang> list = new ArrayList<>();

    public GioHangBLL(ArrayList<GioHang> listGioHang) {
        list = listGioHang;
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
                return list.get(rowIndex).getSachChon().getMaSach();
            case 2:
                return list.get(rowIndex).getSachChon().getTenSach();
            case 3:
                return list.get(rowIndex).getSachChon().getDonGia();
            case 4:
                return list.get(rowIndex).getSoLuong();
            case 5:
                return list.get(rowIndex).getThanhTien();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }

}
