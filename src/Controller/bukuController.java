package Controller;

import Entity.buku_entity;
import Model.AllObjectModel;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class bukuController {
    public void inputBuku(buku_entity dtbk) {
        AllObjectModel.bukuM.inputBuku(dtbk);
    }

    public void hapusBuku(int index) {
        AllObjectModel.bukuM.hapusBuku(index);
    }

    public void editBuku(int index, buku_entity dtbk) {
        AllObjectModel.bukuM.editBuku(index, dtbk);
    }

    public void tampilBuku() {
        AllObjectModel.bukuM.tampilan();
    }

    public ArrayList<buku_entity> getDATABK() {
        return AllObjectModel.bukuM.dtBk;
    }

    public DefaultTableModel daftarBuku() {
        DefaultTableModel dtBook = new DefaultTableModel();
        Object[] kolom = { "Index", "Tahun Rilis", "Judul Buku", "Penerbit Buku", "Penulis Buku" };
        dtBook.setColumnIdentifiers(kolom);
        int size = AllObjectModel.bukuM.alldatabuku().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = i;
            data[1] = AllObjectModel.bukuM.alldatabuku().get(i).getTahun();
            data[2] = AllObjectModel.bukuM.alldatabuku().get(i).getJudul();
            data[3] = AllObjectModel.bukuM.alldatabuku().get(i).getPenerbit();
            data[4] = AllObjectModel.bukuM.alldatabuku().get(i).getPenulis();
            dtBook.addRow(data);
        }
        return dtBook;
    }
}
