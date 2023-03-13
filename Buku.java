public class Buku {
    String idBuku;
    double rate;
    String judul;
    int jumlah;
    int denda;
    int totalRate;
    int jmlReviewer;

    Buku(String idBuku,String judul,int jumlah){
        this.idBuku = idBuku;
        this.judul = judul;
        this.jumlah = jumlah;
        this.rate = 0;
        this.totalRate = 0;
        this.jmlReviewer = 0;
    }

    Buku(){

    }

    boolean bisaDiPinjam(){
        if (jumlah > 0){
            return true;
        }
        return false;
    }
}
