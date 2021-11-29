package Entity;

public class AdminEntity07264 extends UserEntityAbstract_07264 {
    protected String nip, password;

    public AdminEntity07264(){}
    public AdminEntity07264(int id, String nip, String nama, String alamat, String password, String noTelp) {
        this.id=id;
        this.nip = nip;
        this.password = password;
        this.nama=nama;
        this.alamat=alamat;
        this.noTelp=noTelp;
    }

    public String getNip_07264() {
        return nip;
    }

    public void setNip_07264(String nip) {
        this.nip = nip;
    }

    public String getPassword_07264() {
        return password;
    }

    public void setPassword_07264(String password) {
        this.password = password;
    }
}
