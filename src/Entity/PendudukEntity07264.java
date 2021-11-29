package Entity;

public class PendudukEntity07264 extends UserEntityAbstract_07264 {
    protected String nik, dosis, jns_vaksin;

    public PendudukEntity07264(){}
    public PendudukEntity07264(int id, String nik, String nama, String noTelp, String dosis, String jns_vaksin, String alamat) {
        this.id=id;
        this.nik = nik;
        this.dosis = dosis;
        this.jns_vaksin = jns_vaksin;
        this.nama=nama;
        this.alamat=alamat;
        this.noTelp=noTelp;
    }

    public String getNik_07264() {
        return nik;
    }

    public void setNik_07264(String nik) {
        this.nik = nik;
    }

    public String getDosis_07264() {
        return dosis;
    }

    public void setDosis_07264(String dosis) {
        this.dosis = dosis;
    }

    public String getJns_vaksin_07264() {
        return jns_vaksin;
    }

    public void setJns_vaksin_07264(String jns_vaksin) {
        this.jns_vaksin = jns_vaksin;
    }
}
