/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author user-root
 */
public class Karyawan {
    private String nik, nama, kodeJabatan, status;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeJabatan() {
        return kodeJabatan;
    }

    public void setKodeJabatan(String kodeJabatan) {
        this.kodeJabatan = kodeJabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getNamaJabatan(){
        if (kodeJabatan.equalsIgnoreCase("PM")) {
            return "Pemasaran";
        } else if(kodeJabatan.equalsIgnoreCase("PS")){
            return "Personalia";
        }else{
            return "Keuangan";
        }
    }
    
    public int getGajiPokok(){
        if (kodeJabatan.equalsIgnoreCase("PM")) {
            return 10000000;
        } else if(kodeJabatan.equalsIgnoreCase("PS")){
            return 5000000;
        }else{
            return 3000000;
        }
    }
    
    public int getPajak(){
        return (int) (getGajiPokok() * 0.1);
    }
    
    public int getTunjanganKeluarga(){
        if (status.equalsIgnoreCase("Menikah")) {
            return (int) (getGajiPokok() * 1.5);
        } else {
            return 0;
        }
    }
    
    public int getTunjanganAnak(){
        if (status.equalsIgnoreCase("Menikah")) {
            return (int) (3 * getGajiPokok() * 0.05);
        } else {
            return 0;
        }
    }
    
    public int getGajiTotal(){
        return (getGajiPokok() + getTunjanganKeluarga() + getTunjanganAnak()) - getPajak();
    }
    
}
