import Controller.AdminController_07264;
import Controller.PendudukController_07264;
import Entity.AdminEntity07264;
import Entity.PendudukEntity07264;
import GUI.*;
import Helper.KoneksiDb_07264;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class main_07264 {


    public static Scanner input = new Scanner(System.in);
    public static AdminController_07264 adminController07264 = new AdminController_07264();
    public static PendudukController_07264 pendudukController07264 = new PendudukController_07264();

    public static void main(String[] args) {
        new Login_07264();
       /* int choice, choices;
        int idAdmin = 0;
        //public void gui() {}
        while (true) {
            idAdmin = login_07264();
            if (idAdmin > 0) {
                break;
            }
        }
        do {
            System.out.print("""
                    Admin Menu:
                    1. Setting Admin
                    2. Setting Penduduk
                    3. logout
                    """);
            choices = input.nextInt();
            switch (choices) {
                case 1 -> {
                    do {
                        System.out.print("""
                                Data Admin Menu:
                                1. Insert Admin
                                2. Update Password
                                3. Update No Telfon
                                4. Delete data admin
                                5. Exit
                                Enter your choices:
                                """);
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> regisData_07264();
                            case 2 -> updatepassadmin_07264(idAdmin);
                            case 3 -> updatenotelpadmin_07264(idAdmin);
                            case 4 -> deleteadmin_07264();
                            case 5 -> System.out.println("Logging out...");
                            default -> System.out.println("Invalid Input");
                        }
                    } while (choice != 5);
                }
                case 2 -> {
                    do {
                        System.out.print("""
                                Data Penduduk Menu:
                                1. Insert Data Vaksinasi Penduduk
                                2. Edit Penduduk
                                3. Delete Data Vaksinasi
                                4. Show Data
                                5. Exit
                                Enter your choices:"""
                        );
                        choice = input.nextInt();
                        switch (choice) {
                            case 1 -> tambahdata_07264();
                            case 2 -> showData_07264();
                            case 3 -> hapusData_07264();
                            case 4 -> lihatdata_07264();
                            case 5 -> System.out.println("Logging out...");
                            default -> System.out.println("Invalid input");
                        }
                    } while (choice != 5);
                }
                case 3 -> System.out.println("Logout");
                default -> System.out.println("Invalid input");
            }

        } while (choices != 3);

    }

    public void console() {

    }

    public static void regisData_07264() {
        AdminEntity07264 adminEntity = new AdminEntity07264();
        System.out.print("Masukan NIP: ");
        adminEntity.setNip_07264(input.next());
        System.out.print("Masukan Nama: ");
        adminEntity.setNama_07264(input.next());
        System.out.print("Masukan Alamat: ");
        adminEntity.setAlamat_07264(input.next());
        System.out.print("Masukan Password: ");
        adminEntity.setPassword_07264(input.next());
        System.out.print("Masukan No Telp: ");
        adminEntity.setNoTelp_07264(input.next());

        AdminController_07264 adminController07264 = new AdminController_07264();
        adminController07264.insertData_07264(adminEntity.getNip_07264(), adminEntity.getNama_07264(), adminEntity.getAlamat_07264(),
                adminEntity.getPassword_07264(), adminEntity.getNoTelp_07264());
    }

    public static int login_07264() {
        AdminController_07264 loginController = new AdminController_07264();
        String hasil;
        int id = 0;
        System.out.println("Vaksinasi");
        System.out.print("Nip: ");
        String nip = input.next();
        System.out.print("Password: ");
        String password = input.next();

        id =loginController.login_07264(nip, password);
        if (id > 0) {
            hasil = "login success";
        } else {
            hasil = "login failed";
        }
        System.out.println(hasil);
        return id;
    }

    public static void updatepassadmin_07264(int id) {
        System.out.println("Masukan Password Baru: ");
        String pass = input.next();
        AdminController_07264 cont = new AdminController_07264();
        cont.updatePassword_07264(pass, id);
    }

    public static void updatenotelpadmin_07264(int id) {
        System.out.println("Masukan No Telp Baru: ");
        String notelp = input.next();
        AdminController_07264 cont = new AdminController_07264();
        cont.updatenoTelp_07264(notelp, id);
    }

    public static void tambahdata_07264() {
        PendudukEntity07264 pendudukEntity = new PendudukEntity07264();
        System.out.print("Masukan NIK: ");
        pendudukEntity.setNik_07264(input.next());
        System.out.print("Masukan Nama: ");
        pendudukEntity.setNama_07264(input.next());
        System.out.print("Masukan Notelfon: ");
        pendudukEntity.setNoTelp_07264(input.next());
        System.out.print("Masukan dosis: ");
        pendudukEntity.setDosis_07264(input.next());
        System.out.print("Masukan Jenis Vaksin: ");
        pendudukEntity.setJns_vaksin_07264(input.next());
        System.out.print("Masukan Alamat: ");
        pendudukEntity.setAlamat_07264(input.next());

        PendudukController_07264 pendudukController07264 = new PendudukController_07264();
        pendudukController07264.insertData_07264(pendudukEntity.getNik_07264(), pendudukEntity.getNama_07264(), pendudukEntity.getAlamat_07264(),
                pendudukEntity.getNoTelp_07264(), pendudukEntity.getDosis_07264(), pendudukEntity.getJns_vaksin_07264());
    }

    public static void lihatdata_07264() {
        PendudukController_07264 pendudukController07264 = new PendudukController_07264();
        ArrayList<PendudukEntity07264> pendudukEntities = pendudukController07264.getDataPenduduk_07264();
        if (pendudukEntities.size() == 0) {
            System.out.println("There is no data");
            return;
        }
        //System.out.println("ID\t\tShoes\t\tPrice $\t\tSize");
        for (PendudukEntity07264 index : pendudukEntities) {
            System.out.println("id : " + index.getId_07264());
            System.out.println("nik :" + index.getNik_07264());
            System.out.println("nama :" + index.getNama_07264());
            System.out.println("no telp : " + index.getNoTelp_07264());
            System.out.println("dosis :" + index.getDosis_07264());
            System.out.println("jenis vaksin :" + index.getJns_vaksin_07264());
            System.out.println("alamat :" + index.getAlamat_07264());

            System.out.println("");
        }
    }

    public static void showData_07264() {
        int currentId = 0;
        System.out.println("Masukan Id yang di inginkan");
        currentId = input.nextInt();
        showData_07264(currentId);
    }

    public static void showData_07264(int id) {
        int choice;
        PendudukController_07264 pendudukController07264 = new PendudukController_07264();
        ArrayList<PendudukEntity07264> pendudukEntities = pendudukController07264.getById_07264(id);
        if (pendudukEntities.size() > 0) {
            PendudukEntity07264 pendudukEntity = pendudukEntities.get(0);
            System.out.println("id : " + pendudukEntity.getId_07264());
            System.out.println("nik :" + pendudukEntity.getNik_07264());
            System.out.println("nama :" + pendudukEntity.getNama_07264());
            System.out.println("no telp : " + pendudukEntity.getNoTelp_07264());
            System.out.println("dosis :" + pendudukEntity.getDosis_07264());
            System.out.println("jenis vaksin :" + pendudukEntity.getJns_vaksin_07264());
            System.out.println("alamat :" + pendudukEntity.getAlamat_07264());

            do {
                System.out.print("""
                        Masukan Pilihan:
                        1. Update No Telp
                        2. Update Dosis
                        3. Kembali ke menu awal
                        Enter your choices:"""
                );
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> updatenotelppenduduk_07264(id);
                    case 2 -> updatedosispenduduk_07264(id);
                    case 3 -> System.out.println("Kembali ke menu awal");
                    default -> System.out.println("Invalid input");
                }
            } while (choice != 3);
        }
    }

    public static void hapusData_07264() {
        int currentId = 0;
        System.out.println("Masukan Id yang di inginkan");
        currentId = input.nextInt();
        int result = 0;

        try {
            Connection conn = KoneksiDb_07264.getconection_07264();
            String sql = String.format("DELETE FROM penduduk WHERE id = '%s';",
                    currentId
            );
            PreparedStatement statement = conn.prepareStatement(sql);
            result = statement.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil Menghapus Data");
            } else {
                System.out.println("Gagal Menghapus Data");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteadmin_07264(){
        int currentId = 0;
        System.out.println("Masukan Id yang di inginkan");
        currentId = input.nextInt();
        AdminController_07264 cont = new AdminController_07264();
        cont.deleteData_07264(currentId);
    }

    public void cekData() {

    }

    public static void updatenotelppenduduk_07264(int id) {
        System.out.println("Masukan No Telp : ");
        String notelp = input.next();
        PendudukController_07264 cont = new PendudukController_07264();
        cont.updatenoTelp_07264(notelp, id);
    }

    public static void updatedosispenduduk_07264(int id) {
        System.out.println("Masukan Dosis : ");
        String dosis = input.next();
        PendudukController_07264 cont = new PendudukController_07264();
        cont.updateDosis_07264(dosis, id);
    }

     */
    }
}