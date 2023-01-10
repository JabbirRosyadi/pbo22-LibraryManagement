package Model;

import Entity.buku_entity;

public interface bukuInterface {
    public void inputBuku(buku_entity bukuEnt);
    public void tampilan();
    public void hapusBuku(int index);
    public void editBuku(int index, buku_entity bukuEnt);
}
