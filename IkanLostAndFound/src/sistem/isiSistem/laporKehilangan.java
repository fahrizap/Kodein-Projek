package sistem.isiSistem;
import java.util.Scanner;
import sistem.Entitas.benda;

public class laporKehilangan {
    public String namaBendaHilang;
    public String warnaBendaHilang;
    public String detilBendaHilang;
    public String idBendaHilang;

    public void laporHilang(){
        System.out.println(
        "  .--.      .--.      .--.      .--.      .--.      .--.\r\n" + //
        ":::::.\\::::::::.\\::::Laporan Kehilangan::::::.\\::::::::.\\::\r\n" + //
        "'      `--'      `.-'      `--'      `--'      `--'      `-");
        Scanner in = new Scanner(System.in);

        String idBnd = "6";
        System.out.print("Nama benda: ");
        String namaBnd = in.nextLine();
        System.out.print("Warna benda: ");
        String warnaBnd = in.nextLine();
        System.out.print("Detil lain: ");
        String detilLain = in.nextLine();

        benda bendaHlg6 = new benda(idBnd, namaBnd, warnaBnd, detilLain);
        idBendaHilang = bendaHlg6.idBenda;
        namaBendaHilang = bendaHlg6.namaBenda;
        warnaBendaHilang = bendaHlg6.warnaBenda;
        detilBendaHilang = bendaHlg6.detilLainnya;
    }
}
