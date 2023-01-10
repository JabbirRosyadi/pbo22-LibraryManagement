package Controller;
import Entity.staff_entity;
import Model.AllObjectModel;

public class staffController {
    public void daftar(staff_entity stf) {
        AllObjectModel.staffM.daftar(stf);
    }

    public void hapus(int Index) {
        AllObjectModel.staffM.hapus(Index);
    }

    public void ganti(int Index, staff_entity stf) {
        AllObjectModel.staffM.ganti(Index, stf);
    }

    public boolean cekLogin(String nama, String password){
        boolean test = false;
        for (int i = 0; i < AllObjectModel.staffM.viewData().size(); i++) {
            if(nama.equals(AllObjectModel.staffM.viewData().get(i).getName()) &&
                    password.equals(AllObjectModel.staffM.viewData().get(i).getPassword())){
                test = true;
                break;
            }else{
                break;
            }
        }
        return test;
    }
}