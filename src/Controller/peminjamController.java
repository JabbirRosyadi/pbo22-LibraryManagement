package Controller;
import Model.AllObjectModel;
import Entity.peminjam_entity;

public class peminjamController {
    public void masuk (peminjam_entity pmj){
        AllObjectModel.peminjamM.masuk(pmj);
    }
    public void hapusPJ(int Index){
        AllObjectModel.peminjamM.hapusPJ(Index);
    }
}
