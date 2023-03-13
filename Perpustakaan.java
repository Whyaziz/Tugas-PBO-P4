import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    List<Buku> listBuku;

    //constructor
    Perpustakaan(){
        listBuku = new ArrayList<>();
    }

    //method untuk input buku
    void tambahBuku(String idBuku, String judul, int jumlah){
        Buku buku1 = new Buku(idBuku, judul, jumlah);
        listBuku.add(buku1);
    }

    //cek ketersediaan buku
    void cekKetersediaan(String idBuku) {
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.idBuku == idBuku) {
                if (currentBuku.bisaDiPinjam()) {
                    System.out.println("Buku " + currentBuku.judul + " ready");
                } else {
                    System.out.println("Buku " + currentBuku.judul + " kosong");
                }
            }
        }
    }

    //cek apakah buku dengan id tertentu ada
    void cekBuku(String idBuku){
        boolean bukuDitemukan = false;
        for (int i = 0; i < listBuku.size(); i++){
            Buku check = listBuku.get(i);

            if(check.idBuku.equals(idBuku)){
                System.out.println("Buku Ada dengan juduk : " + check.judul);
                bukuDitemukan = true;
                break;
            }
        }
        if (!bukuDitemukan) {
            System.out.println("Buku Tidak Ada");
        }
    }


    //cek buku dengan judul tertentu
    void caribuku(String judul){
        boolean bukuDitemukan = false;
        for (int j = 0; j < listBuku.size(); j++){
            Buku check = listBuku.get(j);

            if ((check.judul).contains(judul)){
                System.out.println("Buku Ada : " + check.judul);
                bukuDitemukan = true;
            }
        }
        if (!bukuDitemukan) {
            System.out.println("Buku Tidak Ada");
        }
    }

}
