package app.data;

public class Buku{

    private String judulBuku;
    private String isbn;
    private String penulis;
    private String penerbit;
    private String jumlahHalaman;

    public Buku(String judul, String isbn, String penulis, String penerbit, String jumlah){

        this.judulBuku = judul;
        this.isbn = isbn;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlah;
        
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


}