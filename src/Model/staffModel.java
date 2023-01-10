package Model;


import Entity.staff_entity;
import java.util.ArrayList;

public class staffModel implements staffInterface {
    ArrayList<staff_entity> stf = new ArrayList<>();

    public void daftar(staff_entity stfEnt) {
        // Scanner inout = new Scanner(System.in);
        // System.out.print("Masukkan Nama : ");
        // s.setName(inout.next());
        // System.out.print("Masukkan Nomor HP : ");
        // s.setNoHP(inout.next());
        // System.out.print("Masukkan Password : ");
        // s.setPassword(inout.next());
        stf.add(stfEnt);
    }

    public void tampilan() {
        for (staff_entity sf : stf) {
            System.out.println("DATA STAFF");
            System.out.println("Index Staff : " + stf.indexOf(sf));
            System.out.println("Nama : " + sf.getName());
            System.out.println("Nomor HP : " + sf.getNoHP());
            System.out.println("Password : " + sf.getPassword());
        }
    }

    public void ganti(int index, staff_entity stfEnt) {
        // Scanner inout = new Scanner(System.in);
        // System.out.print("Masukkan Nama : ");
        // String nm = inout.next();
        // System.out.print("Masukkan Nomor HP : ");
        // String hp = inout.next();
        // System.out.print("Masukkan Password : ");
        // String pass = inout.next();
        // System.out.print("Masukkan index : ");
        // int i =  inout.nextInt();
        stf.set(index, stfEnt);
    }

    public void hapus(int index) {
        // Scanner inout = new Scanner(System.in);
        // System.out.print("Masukkan index : ");
        // int i =  inout.nextInt();
        stf.remove(index);
    }

    public ArrayList<staff_entity> viewData() {
        return stf;
    }
}