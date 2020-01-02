package app;
import app.data.Buku;
import app.data.Member;
import app.transaction.Peminjaman;
import java.util.Scanner;

import java.util.HashMap;

public class App{
    public static void main(String[] args) {

        // database buku

        HashMap<String, Buku> lemariBuku = new HashMap<String, Buku>();

        lemariBuku.put("idn-001",new Buku("Kaguya-sama wa Kokurasetai","idn-001","Aka Akasaka","Viz Media","16 Volume",17));
        lemariBuku.put("idn-002",new Buku("Shingeki no Kyojin","idn-002","Hajime Isayama","Kondansha","30 Volume",27));
        lemariBuku.put("idn-003",new Buku("Kimetsu no Yaiba","idn-003","Koyoharu Gotoge","Shueisha","17 Volume",5));

        int no = 1;
        for (String key : lemariBuku.keySet()){
            
            String judul = lemariBuku.get(key).getJudulBuku();
            String penulis = lemariBuku.get(key).getPenulis();
            String jumlah = lemariBuku.get(key).getJumlahHalaman();
            System.out.println("Nomor       :   "+no++);
            System.out.println("Judul Buku  :   "+judul);
            System.out.println("Penulis     :   "+penulis);
            System.out.println("Volume      :   "+jumlah);
            System.out.println();

        }

        // database member

        HashMap<String, Member> daftarMember = new HashMap<String, Member>();

        daftarMember.put("id-001", new Member("id-001","Sumireko Sanshokuin","Malromarc District","07771245299"));
        daftarMember.put("id-002", new Member("id-002","Mikasa Ackerman","Shigansina District","07709471620"));
        daftarMember.put("id-003", new Member("id-002","Izumi Sagiri","Tegal District","07777444612"));

        int noM = 1;
        for (String key : daftarMember.keySet()){
            
            String nama = daftarMember.get(key).getNamaMember();
            String alamat = daftarMember.get(key).getAlamatMember();
            String nohp = daftarMember.get(key).getNoHp();
            System.out.println("Nomor       :   "+noM++);
            System.out.println("Nama Member :   "+nama);
            System.out.println("Alamat      :   "+alamat);
            System.out.println("nomor Hp    :   "+nohp);
            System.out.println();

        }

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan ISBN buku yang akan dipinjam : ");
        String isbn = input.nextLine();

        Member member = daftarMember.get("id-001");
        Peminjaman transaction = new Peminjaman(member);
        transaction.setKodeTransaksi();
        System.out.println(transaction.getKodeTransaksi());

        if(lemariBuku.containsKey(isbn)){
            System.out.println("Buku Ada");
            Buku borrowBooks = lemariBuku.get(isbn);
            borrowBooks.dipinjam();
        }else{
            System.out.println("Buku tidak ada");
        }


    }
}
