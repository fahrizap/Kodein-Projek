package sistem.Entitas;

public class bendaT extends benda {

    public bendaT(String idBenda, String namaBenda, String warnaBenda, String detilLainnya) {
        super(idBenda, namaBenda, warnaBenda, detilLainnya);
    }
    public String ambilNamaBenda(){
        return namaBenda;
    }
    public String ambilWarnaBenda(){
        return warnaBenda;
    }
    public String ambilIdBenda(){
        return idBenda;
    }
    public String ambilDetilBenda(){
        return detilLainnya;
    }
    
}
