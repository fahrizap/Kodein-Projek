package sistem.isiSistem;

import sistem.Entitas.benda;
import java.util.Scanner;


public class laporMenemukan {
    Scanner inp = new Scanner(System.in);
    public String idBendaTmn;
    public String namaBendaTmn;
    public String warnaBendaTmn;
    public String detilBendaTmn;
    public void laporMnemukan (){
        System.out.println("  .--.      .--.      .--.      .--.      .--.      .--.\r\n" + //
        ":::::.\\::::::::.\\:::::Laporan Menemukan::::::.\\::::::::.\\::\r\n" + //
        "'      `--'      `.-'      `--'      `--'      `--'      `-");
        Scanner in = new Scanner(System.in);

        String idBnd = "4";
        System.out.print("Nama benda: ");
        String namaBnd = in.nextLine();
        System.out.print("Warna benda: ");
        String warnaBnd = in.nextLine();
        System.out.print("Detil lain: ");
        String detilLain = in.nextLine();

        benda bendaTm4 = new benda (idBnd, namaBnd, warnaBnd, detilLain);
        idBendaTmn = bendaTm4.idBenda;
        namaBendaTmn = bendaTm4.namaBenda;
        warnaBendaTmn = bendaTm4.warnaBenda;
        detilBendaTmn = bendaTm4.detilLainnya;
        

    }


    
}
