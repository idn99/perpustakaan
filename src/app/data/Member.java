package app.data;

public class Member{
    
    private String idMember;
    private String namaMember;
    private String alamatMember;
    private String noHp;

    public Member(String idMember, String namaMember, String alamatMember, String noHp) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
        this.noHp = noHp;
    }

    public void meminjamBuku(){
        System.out.println(this.idMember+" Telah meminjam buku");
    }

    public void mengembalikanBuku(){
        System.out.println(this.idMember+" Telah mengembalikan buku");
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getAlamatMember() {
        return alamatMember;
    }

    public void setAlamatMember(String alamatMember) {
        this.alamatMember = alamatMember;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    
}