package Controller;

import Entity.PendudukEntity07264;
import Model.PendudukModel_0726407264;

import java.util.ArrayList;

public class PendudukController_07264 {
    public void insertData_07264(String nik,String nama,String alamat,String noTelp,String dosis,String jns_vaksin){
        PendudukModel_0726407264 pendudukModel07264 = new PendudukModel_0726407264();
        PendudukEntity07264 pendudukEntity = new PendudukEntity07264(0,nik,nama,noTelp,dosis,jns_vaksin,alamat);
        pendudukModel07264.insertData_07264(pendudukEntity);
    }
    public void updateDosis_07264(String dosis,int id){
        PendudukModel_0726407264 pendudukModel07264 = new PendudukModel_0726407264();
        pendudukModel07264.updateDosis_07264(dosis, id);
    }
    public void updatenoTelp_07264(String noTelp,int id){
        PendudukModel_0726407264 pendudukModel07264 = new PendudukModel_0726407264();
        pendudukModel07264.updatenoTelp_07264(noTelp, id);
    }
    public ArrayList<PendudukEntity07264> getDataPenduduk_07264(){
        return new PendudukModel_0726407264().getPenduduk_07264();
    }
    /*
    public int data(String nik){

    }*/
    public ArrayList<PendudukEntity07264> getById_07264(int cekdata){
        PendudukModel_0726407264 pendudukModel07264 = new PendudukModel_0726407264();
        return pendudukModel07264.getPenduduk_07264(cekdata);
    }
    public PendudukEntity07264 daftarPeduduk(){
        return new PendudukEntity07264();
    }
}
