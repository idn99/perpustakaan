package app.transaction;
import java.util.HashMap;
import app.data.Buku;
import app.data.Member;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Peminjaman{
    private String kodeTransaksi;
    private HashMap<String, Buku> books = new HashMap<String, Buku>();
    private Member member;
    private Date dateTime;

    public Peminjaman(Member member){
        this.member = member;
        Date today = new Date();
        this.dateTime = today;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date = formatter.format(this.dateTime);
        this.kodeTransaksi = this.member.getIdMember() + date;
    }

    public HashMap<String, Buku> getBooks() {
        return books;
    }

    public void setBooks(HashMap<String, Buku> books) {
        this.books = books;
    }

    public void tambahBukuKeTransaksi(String isbn, Buku buku){
        this.books.put(isbn, buku);
        System.out.println("Buku "+books.get(isbn).getJudulBuku()+" berhasil ditambahkan di transaksi");
    }

    public Buku getBook(String isbn){
        return this.books.get(isbn);
        
    }

} 