package Controller;

import Model.AllObjectModel;

import Entity.peminjam_entity;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class peminjamController {
//    public void dataPeminjam() {
//        String namaPmj[] = { "Yardan", "Wildan", "Nanda", "Jefri" };
//        String noHPmj[] = { "08976640458", "081330890166", "0881026764787", "085174117230" };
//        int lamaPmj[] = { 7, 5, 10, 8 };
//        String alamatPmj[] = { "Sidoarjo", "Bojonegoro", "Trenggalek", "Tuban" };
//        for (int i = 0; i < namaPmj.length; i++) {
//            AllObjectModel.peminjamM.masuk(new peminjam_entity(namaPmj[i], noHPmj[i], lamaPmj[i], alamatPmj[i]));
//        }
//    }

    public void buat(peminjam_entity pmj) {
        AllObjectModel.peminjamM.masuk(pmj);
    }

    public void hapusPJ(int Index) {

        AllObjectModel.peminjamM.hapusPJ(Index);
    }

    public ArrayList<peminjam_entity> getDATAPMJ(){

        return AllObjectModel.peminjamM.pmj;
    }

    public DefaultTableModel dataPMJ() {
        DefaultTableModel dataPeminjam = new DefaultTableModel();
        Object[] kolom = { "Index", "Nama", "No HP", "Lama Pinjaman", "Alamat","Buku Dipinjam"};
        dataPeminjam.setColumnIdentifiers(kolom);
        int size = AllObjectModel.peminjamM.DataPeminjam().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[6];
            data[0] = i;
            data[1] = AllObjectModel.peminjamM.DataPeminjam().get(i).getName();
            data[2] = AllObjectModel.peminjamM.DataPeminjam().get(i).getNoHP();
            data[3] = AllObjectModel.peminjamM.DataPeminjam().get(i).getLamapinjaman();
            data[4] = AllObjectModel.peminjamM.DataPeminjam().get(i).getAlamat();
            data[5] = AllObjectModel.peminjamM.DataPeminjam().get(i).getJudul();
            dataPeminjam.addRow(data);
        }
        return dataPeminjam;
    }

}
