package Main;

import Controller.*;
import Entity.buku_entity;
import Entity.peminjam_entity;

import java.util.Scanner;


public class PerpusMain {


     static PerpusMain cli = new PerpusMain();

    public static void main(String[] args) {
      //  loginGUI gui = new loginGUI();
         cli.loginPerpus();
    }

     public void loginPerpus() {
     Scanner p = new Scanner(System.in);
     int pilihan;
     do {
     System.out.println("1. Sign In Petugas");
     System.out.println("2. Masuk Peminjam");
     System.out.println("3. Keluar");
     System.out.print("Masukkan Pilihan Anda : ");
     pilihan = p.nextInt();
     switch (pilihan) {
     case 1:
         AllObjectController.Sctrl.dataStaff();
         System.out.print("Masukkan nama : ");
         String nama = p.next();
         System.out.print("Masukkan Password : ");
         String pass = p.next();
         if(AllObjectController.Sctrl.cekLogin(nama, pass)){
             System.out.println("berhasil :)");
             TerminalMenu();
         }else{
             System.out.println("gagal");
         }
         break;
         case 2:
             System.out.print("Masukkan Nama : ");
             nama = p.next();
             System.out.print("Masukkan Nomor HP : ");
             String noHP = p.next();
             System.out.print("Lama Meminjam Buku : ");
             int lama = p.nextInt();
             System.out.println("Masukkan Alamat : ");
             String alamat = p.next();
             AllObjectController.Pctrl.buat(new peminjam_entity(nama, noHP,lama,alamat," "));
             AllObjectController.Pctrl.tampil();
             break;
         case 3:
             System.exit(0);
             break;
         default:
         System.out.println("Maaf Pilihan anda tidak ada\n");
         break;
         }
         System.out.print("Input ulang? : (y/n) ");
         String ulang = p.next();
         if (ulang.equalsIgnoreCase("y")) {
         loginPerpus();
         } else {
         System.exit(0);
         }
         } while (pilihan != 0);
         }

         public void TerminalMenu() {
         int pil;
         Scanner p = new Scanner(System.in);
         do {
     System.out.println("\n===MENU===");
     System.out.println("1. Tambah Buku");
     System.out.println("2. Hapus Buku");
     System.out.println("3. Edit Buku");
     System.out.println("4. Lihat Buku");
     System.out.println("5. Lihat Peminjam");
     System.out.println("6. Hapus Peminjam");
     System.out.println("7. Log Out");
     System.out.print("Masukkan Pilihan Anda : ");
     pil = p.nextInt();
     switch (pil) {
      case 1:
        System.out.println("DATA BUKU");
        System.out.print("Masukkan Judul : ");
        String judul = p.next();
        System.out.print("Masukkan Penerbit : ");
        String penerbit = p.next();
        System.out.print("Masukkan Tahun Terbit : ");
        int tahun = p.nextInt();
        System.out.print("Masukkan Nama Penulis : ");
        String penulis = p.next();
        AllObjectController.Bctrl.inputBuku(new buku_entity(judul,penerbit,tahun,penulis));
     break;
     case 2:
      System.out.println("Masukkan Index Buku : ");
      int indexBK = p.nextInt();
      AllObjectController.Bctrl.hapusBuku(indexBK);
     break;
     case 3:
      System.out.println("Masukkan Index Buku : ");
      indexBK = p.nextInt();
      System.out.println("Masukkan Judul Baru : ");
      judul = p.next();
      System.out.println("Masukkan Penerbit Baru : ");
      penerbit = p.next();
      System.out.println("Masukkan Tahun Terbit Baru : ");
      tahun = p.nextInt();
      System.out.println("Masukkan Nama Penulis Baru : ");
      penulis = p.next();
      AllObjectController.Bctrl.editBuku(indexBK, new buku_entity(judul,penerbit,tahun,penulis));
     break;
     case 4:
      AllObjectController.Bctrl.tampilBuku();
     break;
     case 5:
      AllObjectController.Pctrl.tampil();
     break;
     case 6:
      System.out.println("Masukkan Index : ");
      int indexPJ = p.nextInt();
      AllObjectController.Pctrl.hapusPJ(indexPJ);
     break;
     case 7:
      loginPerpus();
     break;
     default:
     System.out.println("Maaf Pilihan anda tidak ada");
     break;

     }
     System.out.println("Apakah Anda ingin memilih lagi? (y/n) ");
     String yn = p.next();
     if (yn.equalsIgnoreCase("y")) {
     TerminalMenu();
     } else {
     System.exit(0);
     }
     } while (pil != 0);
     }
}