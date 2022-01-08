package Controller;

import Entity.AdminEntity07264;
import Entity.PendudukEntity07264;
import Model.PendudukModel07264;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PendudukController_07264 {
    public void insertData_07264(String nik,String nama,String alamat,String noTelp,String dosis,String jns_vaksin){
        PendudukModel07264 pendudukModel07264 = new PendudukModel07264();
        PendudukEntity07264 pendudukEntity = new PendudukEntity07264(0,nik,nama,noTelp,dosis,jns_vaksin,alamat);
        pendudukModel07264.insertData_07264(pendudukEntity);
    }
    public void updateDosis_07264(String dosis,int id){
        PendudukModel07264 pendudukModel07264 = new PendudukModel07264();
        pendudukModel07264.updateDosis_07264(dosis, id);
    }
    public void updatenoTelp_07264(String noTelp,int id){
        PendudukModel07264 pendudukModel07264 = new PendudukModel07264();
        pendudukModel07264.updatenoTelp_07264(noTelp, id);
    }
    public ArrayList<PendudukEntity07264> getDataPenduduk_07264(){
        return new PendudukModel07264().getPenduduk_07264();
    }
    /*
    public int data(String nik){

    }*/
    public ArrayList<PendudukEntity07264> getById_07264(int cekdata){
        PendudukModel07264 pendudukModel07264 = new PendudukModel07264();
        return pendudukModel07264.getPenduduk_07264(cekdata);
    }
    public PendudukEntity07264 daftarPeduduk(){
        return new PendudukEntity07264();
    }

    public void insertData(String nik, String nama, String notelp, String dosis, String alamat) {
        PendudukEntity07264 pendudukEntity07264 = new PendudukEntity07264();
        pendudukEntity07264.setNik_07264(nik);
        pendudukEntity07264.setNama_07264(nama);
        pendudukEntity07264.setNoTelp_07264(notelp);
        pendudukEntity07264.setDosis_07264(dosis);
        pendudukEntity07264.setAlamat_07264(alamat);
        AllObjectModel_07264.pendudukModel07264.insertData_07264(pendudukEntity07264);
    }

    public ArrayList<PendudukEntity07264> getDataPenduduk() {
        return AllObjectModel_07264.pendudukModel07264.getPenduduk_07264();
    }

    public static DefaultTableModel syncTablePenduduk_07264() {
        DefaultTableModel pendudukDataSet = new DefaultTableModel();
        Object[] column = {"ID", "NIK", "Nama", "NoTelp","Dosis","Jenis Vaksin","Alamat"};
        pendudukDataSet.setColumnIdentifiers(column);
        ArrayList<PendudukEntity07264> penduduk = AllObjectModel_07264.pendudukModel07264.getPenduduk_07264();
        for(PendudukEntity07264 i : penduduk) {
            Object[] data = new Object[7];
            data[0] = i.getId_07264();
            data[1] = i.getNik_07264();
            data[2] = i.getNama_07264();
            data[3] = i.getNoTelp_07264();
            data[4] = i.getDosis_07264();
            data[5] = i.getJns_vaksin_07264();
            data[6] = i.getAlamat_07264();
            pendudukDataSet.addRow(data);
        }
        return pendudukDataSet;
    }
}
