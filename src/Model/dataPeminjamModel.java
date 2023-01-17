package Model;

import Entity.buku_entity;
import Entity.dataPeminjamEntity;

import java.util.ArrayList;

public class dataPeminjamModel {
    public ArrayList<dataPeminjamEntity> DatabasePeminjam;


    public dataPeminjamModel() {
        DatabasePeminjam = new ArrayList<>();
    }

    public void tambahData(dataPeminjamEntity dataP) {
        DatabasePeminjam.add(dataP);
    }
}
