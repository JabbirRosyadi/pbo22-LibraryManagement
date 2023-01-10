package Model;

import Entity.staff_entity;

public interface staffInterface {
    public void daftar(staff_entity stfEnt);
    public void tampilan();
    public void ganti(int index, staff_entity stfEnt);
    public void hapus(int index);
}
