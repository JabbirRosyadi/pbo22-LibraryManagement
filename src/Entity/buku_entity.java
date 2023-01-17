package Entity;

public class buku_entity {
        private String judul, penerbit, penulis;
        private int tahun;

        public buku_entity(String judul, String penerbit, int tahun, String penulis) {
                this.judul = judul;
                this.penerbit = penerbit;
                this.tahun = tahun;
                this.penulis = penulis;
        }

        public String getJudul() {
                return judul;
        }

        public String getPenerbit() {
                return penerbit;
        }

        public String getPenulis() {
                return penulis;
        }

        public int getTahun() {
                return tahun;
        }

        public void setJudul(String judul) {
                this.judul = judul;
        }

        public void setPenerbit(String penerbit) {
                this.penerbit = penerbit;
        }

        public void setPenulis(String penulis) {
                this.penulis = penulis;
        }

        public void setTahun(int tahun) {
                this.tahun = tahun;
        }
}