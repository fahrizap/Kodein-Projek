package sistem.isiSistem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import sistem.Entitas.benda;
import sistem.Entitas.bendaT;

public class listBendaTemuan {
    laporMenemukan tmbhanBndaTmn = new laporMenemukan();
    public void daftarBendaT (){
        Scanner in = new Scanner(System.in);
        HashMap<String, bendaT>bendaTm = new HashMap<>();
        bendaT bendaTm1 = new bendaT(
            "1",
            "Sempak",
            "Pink",
            "Tengahnya basah"
        );
        bendaT bendaTm2 = new bendaT(
            "2",
            "Sepatu",
            "Hitam",
            "Merk Adios"
        );
        bendaT bendaTm3 = new bendaT(
            "3",
            "Topi",
            "Merah",
            "Bentuknya Bundar"
        );

        bendaTm.put(bendaTm1.idBenda, bendaTm1);
        bendaTm.put(bendaTm2.idBenda, bendaTm2);
        bendaTm.put(bendaTm3.idBenda, bendaTm3);

        System.out.println("====[[List Barang Temuan]]====");
        System.out.println();
        for(Map.Entry<String, bendaT>bendaTmu : bendaTm.entrySet()){
            String key = bendaTmu.getKey();
            benda liBenda = bendaTmu.getValue();
            System.out.println(key+")"+ liBenda.ambilNamaBenda()+" Warna "+ liBenda.ambilWarnaBenda()+", "+liBenda.ambilDetilBenda());
        }
    }
}

