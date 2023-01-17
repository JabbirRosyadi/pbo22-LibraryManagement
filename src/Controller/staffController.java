package Controller;

import Entity.staff_entity;
import Model.AllObjectModel;

public class staffController {
    public void dataStaff() {
        String UsernameStaff[] = { "Jabbir", "Budi", "Slamet", "Untung" };
        String PasswordStaff[] = { "666", "321", "11", "666" };
        String noHp[] = { "08979923795", "089667323101", "085440586123", "08123137952" };
        for (int i = 0; i < UsernameStaff.length; i++) {
            AllObjectModel.staffM.daftar(new staff_entity(UsernameStaff[i], noHp[i], PasswordStaff[i]));
        }
    }
    // public void daftar(staff_entity stf) {
    // AllObjectModel.staffM.daftar(stf);
    // }

    // public void hapus(int Index) {
    // AllObjectModel.staffM.hapus(Index);
    // }

    // public void ganti(int Index, staff_entity stf) {
    // AllObjectModel.staffM.ganti(Index, stf);
    // }

    public boolean cekLogin(String nama, String password) {
        boolean test = false;
        for (int i = 0; i < AllObjectModel.staffM.viewData().size(); i++) {
            if (nama.equals(AllObjectModel.staffM.viewData().get(i).getName()) &&
                    password.equals(AllObjectModel.staffM.viewData().get(i).getPassword())) {
                test = true;
                break;
            } else {
                break;
            }
        }
        return test;
    }

    int indexLogin = 0;

    public void login(String username, String passwordAdmin) {
        indexLogin = AllObjectModel.staffM.cekData(username, passwordAdmin);
    }

    public staff_entity StaffEt() {
        return AllObjectModel.staffM.showDataAdmin(indexLogin);
    }
}