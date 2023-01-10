package Main;

import java.util.Scanner;

import Controller.AllObjectController;
import Model.*;
import View.loginGUI;

public class PerpusMain {

//    staffModel ls = new staffModel();
//    peminjamModel lp = new peminjamModel();
//    bukuModel bk = new bukuModel();
//    static PerpusMain info = new PerpusMain();

    public static void main(String[] args) {
        loginGUI gui = new loginGUI();
//        info.loginPerpus();
    }

//    public void loginPerpus() {
//        Scanner p = new Scanner(System.in);
//        int pilihan;
//        do {
//            System.out.println("1. Sign Up Petugas");
//            System.out.println("2. Sign In Petugas");
//            System.out.println("3. Masuk Peminjam");
//            System.out.println("4. Keluar");
//            System.out.print("Masukkan Pilihan Anda : ");
//            pilihan = p.nextInt();
//            switch (pilihan) {
//                // case 1:
//                //     ls.daftar();
//                //     break;
//                //  case 2:
//                //  System.out.print("Masukkan nama : ");
//                //  String nama = p.next();
//                //  System.out.print("Masukkan Password : ");
//                //  String password = p.next();
//                //  if(AllObjectController.Sctrl.cekLogin(nama, password)){
//                //      System.out.println("berhasil :)");
//                //      TerminalMenu();
//                //  }else{
//                //      System.out.println("gagal");
//                //  }
//                //     break;
//                // case 3:
//                //     lp.masuk();
//                //     lp.tampil();
//                //     break;
//                // case 4:
//                //     System.exit(0);
//                //     break;
//                // default:
//                //     System.out.println("Maaf Pilihan anda tidak ada\n");
//                //     break;
//            }
//            System.out.print("Input ulang? : (y/n) ");
//            String ulang = p.next();
//            if (ulang.equalsIgnoreCase("y")) {
//                loginPerpus();
//            } else {
//                System.exit(0);
//            }
//        } while (pilihan != 0);
//    }
//
//    public void TerminalMenu() {
//        int pil;
//        Scanner p = new Scanner(System.in);
//        do {
//            System.out.println("\n===MENU===");
//            System.out.println("1. Tambah Buku");
//            System.out.println("2. Hapus  Buku");
//            System.out.println("3. Edit   Buku");
//            System.out.println("4. Lihat  Buku");
//            System.out.println("5. Lihat  Peminjam");
//            System.out.println("6. Hapus  Peminjam");
//            System.out.println("7. Log Out");
//            System.out.print("Masukkan Pilihan Anda : ");
//            pil = p.nextInt();
//            switch (pil) {
//                // case 1:
//                //     bk.inputBuku();
//                //     break;
//                // case 2:
//                //     bk.hapusBuku();
//                //     break;
//                // case 3:
//                //     bk.editBuku();
//                //     break;
//                // case 4:
//                //     bk.tampilan();
//                //     break;
//                // case 5:
//                //     lp.tampil();
//                //     break;
//                // case 6:
//                //     lp.hapusPJ();
//                //     break;
//                // case 7:
//                //     loginPerpus();
//                //     break;
//                // default:
//                //     System.out.println("Maaf Pilihan anda tidak ada");
//                //     break;
//
//            }
//            System.out.println("Apakah Anda ingin memilih lagi? (y/n) ");
//            String yn = p.next();
//            if (yn.equalsIgnoreCase("y")) {
//                TerminalMenu();
//            } else {
//                System.exit(0);
//            }
//        } while (pil != 0);
//    }
}