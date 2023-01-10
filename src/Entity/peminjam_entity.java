package Entity;

public class peminjam_entity extends member_entity {
    private String alamat;
    private int lamapinjaman;

    public peminjam_entity(String name, String noHP, int lamapinjaman, String alamat){
        super(name,noHP);
        this.lamapinjaman = lamapinjaman;
        this.alamat = alamat;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getNoHP() {
        // TODO Auto-generated method stub
        return super.getNoHP();
    }

    public String getAlamat() {
        return alamat;
    }

    public int getLamapinjaman() {
        return lamapinjaman;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setNoHP(String noHP) {
        // TODO Auto-generated method stub
        super.setNoHP(noHP);
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setLamapinjaman(int lamapinjaman) {
        this.lamapinjaman = lamapinjaman;
    }
}