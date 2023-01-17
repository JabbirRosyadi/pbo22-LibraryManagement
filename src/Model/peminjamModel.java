package Model;

import java.util.ArrayList;
import Entity.peminjam_entity;
import Interface.peminjamInterface;

public class PeminjamModel implements peminjamInterface {
    public ArrayList<peminjam_entity> pmj = new ArrayList<>();
    public ArrayList<peminjam_entity> DataPeminjam() {

        return pmj;
    }

    public void masuk(peminjam_entity pmjEnt) {
        // Scanner inout = new Scanner(System.in);
        // System.out.print("Masukkan Nama : ");
        // p.setName(inout.next());
        // System.out.print("Masukkan Nomor HP : ");
        // p.setNoHP(inout.next());
        // System.out.print("Lama Meminjam Buku : ");
        // p.setLamapinjaman(inout.nextInt());
        // System.out.println("Masukkan Alamat : ");
        // p.setAlamat(inout.next());
        pmj.add(pmjEnt);
    }

    public void tampil() {
        for (peminjam_entity pj : pmj) {
            System.out.println("Nama  : " + pj.getName());
            System.out.println("No Hp : " + pj.getNoHP());
            System.out.println("Lama Peminjaman : " + pj.getLamapinjaman() + " hari ");
            System.out.println("Alamat : " + pj.getAlamat());
            System.out.println("Buku Yang Dipinjam " + pj.getJudul());
        }
    }

    public void hapusPJ(int Index) {
        // System.out.println("Masukkan Nama Peminjam : ");
        // String nama = inout.next();
        // for (int i = 0 ; i < pmj.size(); i++ ){
        // if(pmj.get(i).getName().equals(nama)){
        // pmj.remove(i);
        // }
        // else{
        // System.out.println("Nama Peminjam Tidak Ada");
        // }
        pmj.remove(Index);
    }
}
