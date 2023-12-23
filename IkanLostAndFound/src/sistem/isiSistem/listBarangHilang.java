package sistem.isiSistem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import sistem.Entitas.benda;
public class listBarangHilang {
    HashMap<String, benda> bendaHilng = new HashMap<>();
    public void daftarBendaH (){
        Scanner in = new Scanner(System.in);
        benda bendaHlg1 = new benda(
            "1",
            "Baju",
            "Biru",
            "Merk Green Light"
        );
        benda bendaHlg2 = new benda(
            "2",
            "Tumbler",
            "Oranye",
            "Ukuran 600ml"
        );
        benda bendaHlg3 = new benda(
            "3",
            "Handphone",
            "Merah",
            "Merk Oppo A71"
        );
        benda bendaHlg4 = new benda(
            "4",
            "Dompet",
            "Hitam",
            "ada sim, ktp, dan uang sekitar 500rb"
        );
        benda bendaHlg5 = new benda(
            "5",
            "Name tag",
            "Biru",
            "Terakhir ingat dipakai di kantin"
        );


        bendaHilng.put(bendaHlg1.idBenda, bendaHlg1);
        bendaHilng.put(bendaHlg2.idBenda, bendaHlg2);
        bendaHilng.put(bendaHlg3.idBenda, bendaHlg3);
        bendaHilng.put(bendaHlg4.idBenda, bendaHlg4);
        bendaHilng.put(bendaHlg5.idBenda, bendaHlg5);

        System.out.println("=========[List Barang Hilang]========");
        System.out.println();
         for(Map.Entry<String,benda> bendaHlgg : bendaHilng.entrySet()){
            String key = bendaHlgg.getKey();
            benda liBenda = bendaHlgg.getValue();
            System.out.println(key + ") " + liBenda.ambilNamaBenda() + " Warna " + liBenda.ambilWarnaBenda() + ", " + liBenda.ambilDetilBenda());
        }


    }
    public void daftarBendaHi (){
        Scanner in = new Scanner(System.in);
        benda bendaHlg1 = new benda(
            "1",
            "Baju",
            "Biru",
            "Merk Green Light"
        );
        benda bendaHlg2 = new benda(
            "2",
            "Tumbler",
            "Oranye",
            "Ukuran 600ml"
        );
        benda bendaHlg3 = new benda(
            "3",
            "Handphone",
            "Merah",
            "Merk Oppo A71"
        );
        benda bendaHlg4 = new benda(
            "4",
            "Dompet",
            "Hitam",
            "ada sim, ktp, dan uang sekitar 500rb"
        );
        benda bendaHlg5 = new benda(
            "5",
            "Name tag",
            "Biru",
            "Terakhir ingat dipakai di kantin"
        );


        bendaHilng.put(bendaHlg1.idBenda, bendaHlg1);
        bendaHilng.put(bendaHlg2.idBenda, bendaHlg2);
        bendaHilng.put(bendaHlg3.idBenda, bendaHlg3);
        bendaHilng.put(bendaHlg4.idBenda, bendaHlg4);
        bendaHilng.put(bendaHlg5.idBenda, bendaHlg5);

        System.out.println("====[[List Barang Hilang]]====");
        System.out.println();
         for(Map.Entry<String,benda> bendaHlgg : bendaHilng.entrySet()){
            String key = bendaHlgg.getKey();
            benda liBenda = bendaHlgg.getValue();
            System.out.println(key + ") " + liBenda.ambilNamaBenda() + " Warna " + liBenda.ambilWarnaBenda() + ", " + liBenda.ambilDetilBenda());
        }
        System.out.println(" ");
        System.out.println(">>kembali (ketik 1)");
        int ketik = in.nextInt();
        if(ketik != 1){
            System.out.println("");
            System.out.println("Error: input yang anda masukkan error");
            System.out.println(" ");
            System.out.println(" ");

        }
    }
}