package Entity;

public class dataPeminjamEntity {
    private String nama;
    private String noHp;
    private String judul;

    public dataPeminjamEntity(String nama, String noHp, String judul) {
        this.nama = nama;
        this.noHp = noHp;
        this.judul = judul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
