package sistem.isiSistem;

import java.util.Scanner;
import sistem.Entitas.Orang;
public class buatAkun {
    Scanner inp = new Scanner(System.in);
    public String namaOrang;
    public String noTelp;
    public void buatAkunn (){
        System.out.println("              ,---------------------------,\r\n" + //
                "              |  /---------------------\\  |\r\n" + //
                "              | |                       | |\r\n" + //
                "              | |          IKAN         | |\r\n" + //
                "              | |  Installing.....      | |\r\n" + //
                "              | |                       | |\r\n" + //
                "              | |                       | |\r\n" + //
                "              |  \\_____________________/  |\r\n" + //
                "              |___________________________|\r\n" + //
                "            ,---\\_____     []     _______/------,\r\n" + //
                "          /         /______________\\           /|\r\n" + //
                "        /___________________________________ /  | ___\r\n" + //
                "        |                                   |   |    )\r\n" + //
                "        |  _ _ _                 [-------]  |   |   (\r\n" + //
                "        |  o o o                 [-------]  |  /    _)_\r\n" + //
                "        |__________________________________ |/     /  /\r\n" + //
                "    /-------------------------------------/|      ( )/\r\n" + //
                "  /-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/ /\r\n" + //
                "/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/ /\r\n" + //
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("============[[Buat Akun]]==============");

        System.out.print("Nama: ");
        String nama = inp.nextLine();
        
        System.out.print("No Telp: ");
        String telp = inp.nextLine();

        Orang orang = new Orang (nama, telp);
        namaOrang = orang.nama;
        noTelp = orang.noTelp; 
    }
}
