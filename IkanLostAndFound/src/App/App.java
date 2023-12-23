package App;

import java.util.Scanner;

import sistem.isiSistem.buatAkun;
import sistem.isiSistem.laporKehilangan;
import sistem.isiSistem.laporMenemukan;
import sistem.isiSistem.listBarangHilang;
import sistem.isiSistem.listBendaTemuan;
import sistem.isiSistem.tampilanAwal;

public class App {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        buatAkun buattAkun = new buatAkun();
        laporKehilangan laporHilang = new laporKehilangan();
        laporMenemukan laporTemu = new laporMenemukan();
        listBarangHilang  listBrgHlg = new listBarangHilang();
        listBendaTemuan listBrgTmn = new listBendaTemuan();
        tampilanAwal tampilanAwall = new tampilanAwal();

        //Buat akun
        buattAkun.buatAkunn();
        System.out.println(" ");
        System.out.println(" ");
        //Tampilan Awal
        for (int x = 0; x < 1000 ; x++){
            tampilanAwall.tampilanAwall();
            System.out.print(">>Pilih menu (ketik 1/2/3/4/5): ");
            int pilihMenu = inp.nextInt();
            System.out.println(" ");
            System.out.println(" ");

            if (pilihMenu == 1){
                laporHilang.laporHilang();
                System.out.println("");
                System.out.println("");
                System.out.println("======[[Detil Laporan Kehilangan]]======");
                System.out.println("Nama Penghilang: " + buattAkun.namaOrang);
                System.out.println("No Telp: " + buattAkun.noTelp);
                System.out.println("Benda: " + laporHilang.namaBendaHilang + " Warna " + laporHilang.warnaBendaHilang);
                System.out.println("Detil benda: " + laporHilang.detilBendaHilang);
                System.out.println(" ");
                System.out.println(">>Kembali (ketik 1)");
                System.out.println(">>list barang hilang (ketik 2)");
                int ketik = inp.nextInt();
                System.out.println();
                System.out.println();
                if(ketik == 2){
                    listBrgHlg.daftarBendaH();
                    System.out.println(laporHilang.idBendaHilang + ") " + laporHilang.namaBendaHilang + " warna " + laporHilang.warnaBendaHilang + ", " +laporHilang.detilBendaHilang );
                    System.out.println(" ");
                    System.out.println(">>Kembali(ketik 1)");
                    int isi = inp.nextInt();
                    if (isi > 1 || isi < 1){
                        System.out.println(" ");
                        System.out.println("----------------------------------");
                        System.out.println("Error: input yang anda masukkan salah");
                        break;
                    }  
                } else if(ketik > 2 || ketik < 1){
                    System.out.println("Error: input yang anda masukkan salah");
                    break;
                }
                System.out.println(" ");
                System.out.println(" ");
            } else if( pilihMenu == 2) {
                laporTemu.laporMnemukan();
                System.out.println();
                System.out.println("======[[Detil Laporan Menemukan]]======");
                System.out.println("Nama Penemu: " + buattAkun.namaOrang);
                System.out.println("No Telp: " + buattAkun.noTelp);
                System.out.println("Benda: " + laporTemu.namaBendaTmn + " Warna " + laporTemu.warnaBendaTmn);
                System.out.println("Detil benda: " + laporTemu.detilBendaTmn);
                System.out.println(" ");
                System.out.println(">>Kembali(ketik 1): ");
                System.out.println(">>list barang temuan:(ketik 2)");
                int ketik = inp.nextInt();
                System.out.println();
                System.out.println();
                if(ketik == 2){
                    listBrgTmn.daftarBendaT();
                    System.out.println(laporTemu.idBendaTmn + ")" + laporTemu.namaBendaTmn + " warna " + laporTemu.warnaBendaTmn + ", " +laporTemu.detilBendaTmn );
                    System.out.println(" ");
                    System.out.println(">>Kembali(ketik 1)");
                    System.out.print("Pilih(angka): ");
                    int isi = inp.nextInt();
                    if (isi != 1){
                        System.out.println(" ");
                        System.out.println("Error: input yang anda masukkan salah");
                        System.out.println(" ");
                        System.out.println(" ");
                    }
                } else if(ketik > 2 || ketik < 1){
                    System.out.println(" ");
                    System.out.println("Error: input yang anda masukkan salah");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                }
                System.out.println(" ");
            } else if(pilihMenu == 3){
                listBrgHlg.daftarBendaHi();
            } else if(pilihMenu == 4) {
                listBrgTmn.daftarBendaT();
                int masuk = inp.nextInt();
                System.out.println(" ");
                System.out.println(">>Kembali(ketik 1)");
                if (masuk != 1){
                    System.out.println(" ");
                    System.out.println("Error: Input anda tidak valid");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                }
            } else if(pilihMenu == 5){
                System.out.println("");
                System.out.println("");
                System.out.println("Sampai jumpa");
                System.out.println("");
                System.out.println("");
                break;
            }
        }
        inp.close();
    }
}