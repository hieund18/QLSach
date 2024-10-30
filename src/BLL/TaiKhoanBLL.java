/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import Entities.TaiKhoan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maxs18
 */
public class TaiKhoanBLL extends AbstractTableModel {

    private String name[] = {"STT", "Tên tài khoản", "Mật khẩu", "Vai trò"};
    private Class classes[] = {Integer.class ,String.class, String.class, String.class};
    ArrayList<TaiKhoan> list = new ArrayList<>();

    public TaiKhoanBLL(ArrayList<TaiKhoan> listTK) {
        list = listTK;
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
                return list.get(rowIndex).getMaTK();
            case 2:
                return list.get(rowIndex).getMatKhau();
            case 3:
                return list.get(rowIndex).getVaiTro();
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
