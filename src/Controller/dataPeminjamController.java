package Controller;

import javax.swing.table.DefaultTableModel;

import Entity.dataPeminjamEntity;
import Model.AllObjectModel;

public class dataPeminjamController {

    public void tambahPctrl(dataPeminjamEntity dataP) {
        AllObjectModel.dataPM.tambahData(dataP);
    }

    public DefaultTableModel daftarPMJ() {
        DefaultTableModel dtPeminjam = new DefaultTableModel();
        Object[] kolom = { "Index", "Nama", "No HP", "Judul Buku"};
        dtPeminjam.setColumnIdentifiers(kolom);
        int size = AllObjectModel.dataPM.DatabasePeminjam.size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = i;
            data[1] = AllObjectModel.dataPM.DatabasePeminjam.get(i).getNama();
            data[2] = AllObjectModel.dataPM.DatabasePeminjam.get(i).getNoHp();
            data[3] = AllObjectModel.dataPM.DatabasePeminjam.get(i).getJudul();
            dtPeminjam.addRow(data);
        }
        return dtPeminjam;
    }
}
