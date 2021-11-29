package Entity;

public abstract class UserEntityAbstract_07264 {
    protected int id;
    protected String nama, alamat, noTelp;

    public UserEntityAbstract_07264(){}
    public UserEntityAbstract_07264(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public int getId_07264() {
        return id;
    }

    public void setId_07264(int id) {
        this.id = id;
    }

    public String getNama_07264() {
        return nama;
    }

    public void setNama_07264(String nama) {
        this.nama = nama;
    }

    public String getAlamat_07264() {
        return alamat;
    }

    public void setAlamat_07264(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp_07264() {
        return noTelp;
    }

    public void setNoTelp_07264(String noTelp) {
        this.noTelp = noTelp;
    }
}
