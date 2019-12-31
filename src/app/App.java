package app;
import app.data.Buku;

import java.util.HashMap;

public class App{
    public static void main(String[] args) {

        HashMap<String, Buku> lemariBuku = new HashMap<String, Buku>();

        lemariBuku.put("idn-001",new Buku("Kaguya-sama wa Kokurasetai","idn-001","Aka Akasaka","Viz Media","16 Volume"));
        lemariBuku.put("idn-002",new Buku("Shingeki no Kyojin","idn-002","Hajime Isayama","Kondansha","30 Volume"));
        lemariBuku.put("idn-003",new Buku("Kimetsu no Yaiba","idn-003","Koyoharu Gotoge","Shueisha","17 Volume"));

        int no = 1;
        for (String key : lemariBuku.keySet()){
            
            String judul = lemariBuku.get(key).getJudulBuku();
            String penulis = lemariBuku.get(key).getPenulis();
            System.out.println("Nomor       :   "+no++);
            System.out.println("Judul Buku  :   "+judul);
            System.out.println("Penulis     :   "+penulis);
            System.out.println();

        }


    }
}
