package Controller;
import Entity.buku_entity;
import Model.AllObjectModel;

public class bukuController {
    public void inputBuku(buku_entity dtbk){
        AllObjectModel.bukuM.inputBuku(dtbk);
    }
    public void hapusBuku(int index){
        AllObjectModel.bukuM.hapusBuku(index);
    }
    public void editBuku(int index, buku_entity dtbk){
        AllObjectModel.bukuM.editBuku(index, null);
    }
}
