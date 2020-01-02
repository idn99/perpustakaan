package app.data;

public class Buku{

    private String judulBuku;
    private String isbn;
    private String penulis;
    private String penerbit;
    private String jumlahHalaman;
    private int stok;
    
    public Buku(String judulBuku, String isbn, String penulis, String penerbit, String jumlahHalaman, int stok) {
        this.judulBuku = judulBuku;
        this.isbn = isbn;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.stok = stok;
    }


    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void dipinjam(){
        this.stok--;
    }

}