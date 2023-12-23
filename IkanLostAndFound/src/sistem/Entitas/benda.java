package sistem.Entitas;

public class benda {
    public String idBenda;
    public String namaBenda;
    public String warnaBenda;
    public String detilLainnya;
    public benda(String idBenda, String namaBenda, String warnaBenda, String detilLainnya){
        this.idBenda = idBenda;
        this.namaBenda = namaBenda;
        this.warnaBenda = warnaBenda;
        this.detilLainnya = detilLainnya;
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
