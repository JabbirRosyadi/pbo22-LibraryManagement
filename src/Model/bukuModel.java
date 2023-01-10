package Model;

import java.util.ArrayList;

import Entity.buku_entity;

public class bukuModel implements bukuInterface {

    static ArrayList<buku_entity> dtBk = new ArrayList<>();

    public void inputBuku(buku_entity bukuEnt) {
        // System.out.println("DATA BUKU");
        // System.out.print("Masukkan Judul : ");
        // bk.setJudul(inout.next());
        // System.out.print("Masukkan Penerbit : ");
        // bk.setPenerbit(inout.next());
        // System.out.print("Masukkan Tahun Terbit : ");
        // bk.setTahun(inout.nextInt());
        // System.out.print("Masukkan Nama Penulis : ");
        // bk.setPenulis(inout.next());
        dtBk.add(bukuEnt);
    }

    public void tampilan() {
        for (buku_entity dtBkE : dtBk) {
            System.out.println("DATA BUKU");
            System.out.println("Judul : " + dtBkE.getJudul());
            System.out.println("Penerbit : " + dtBkE.getPenerbit());
            System.out.println("Tahun Terbit : " + dtBkE.getTahun());
            System.out.println("Nama Penulis : " + dtBkE.getPenulis());
        }
    }

    public void hapusBuku(int index){
        // System.out.println("Masukkan Judul Buku : ");
        // String judul = inout.next();
        // for(int i = 0;i< dtBk.size();i++){
        //     if(dtBk.get(i).getJudul().equals(judul)){
        //         dtBk.remove(i);
        //     }
        //     else{
        //         System.out.println("Buku yang dicari tidak ada");
        // }
        // }
        dtBk.remove(index);
    }

    public void editBuku(int index, buku_entity bukuEnt){
        // Scanner inout = new Scanner(System.in);
        // tampilan();
        // System.out.print("Masukkan Judul Buku : ");
        // String judul = inout.next();
        // if(judul.equals(bk.getJudul())){
        //     System.out.print("Masukkan Penerbit : ");
        //     String pnb = inout.next();
        //     System.out.print("Masukkan Tahun Penerbit : ");
        //     String thn = inout.next();
        //     System.out.print("Masukkan Nama Penulis");
        //     String nm = inout.next();
        //     for(int i = 0;i< dtBk.size();i++){
        //         if(dtBk.get(i).getJudul().equals(judul)){
        //             dtBk.set(i, new dataBuku_entity(bk.getJudul(), bk.getPenerbit(), bk.getTahun(), bk.getPenulis()));
        //         }
        //     }
        // }else{
        //     System.out.println("Buku yang dicari tidak ada");
        dtBk.set(index, bukuEnt);
    }
}