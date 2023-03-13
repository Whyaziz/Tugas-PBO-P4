public class Mainbuku {
    public static void main (String[] args){

        Perpustakaan perpusat = new Perpustakaan();

        perpusat.tambahBuku("1001", "Naruto : Road to Hokage", 2);
        perpusat.tambahBuku("1002", "Naruto : The Last", 4);
        perpusat.tambahBuku("1003", "Naruto : Shipuden", 4);
        perpusat.tambahBuku("1004", "Spongebob", 4);
        perpusat.tambahBuku("1005", "The Hulk", 4);



        perpusat.caribuku("Naruto");
        perpusat.cekBuku("1005");
        perpusat.cekKetersediaan("1004");


    }
}
