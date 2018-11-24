/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.util.Scanner;
import object.Karyawan;

/**
 *
 * @author user-root
 */
public class KaryawanTester {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        Karyawan objekKaryawan = new Karyawan();
        
        System.out.print("NIK\t\t: ");
        objekKaryawan.setNik(input.next());
        System.out.print("Nama\t\t: ");
        objekKaryawan.setNama(input.next());
        System.out.print("Kode Jabatan\t: ");
        objekKaryawan.setKodeJabatan(input.next());
        System.out.print("Status\t\t: ");
        objekKaryawan.setStatus(input.next());
        
        System.out.println("");
        System.out.println("Nama Jabatan\t: " + objekKaryawan.getNamaJabatan());
        System.out.println("Gaji Pokok\t: " + objekKaryawan.getGajiPokok());
        System.out.println("Pajak\t\t: " + objekKaryawan.getPajak());
        System.out.println("Tunjangan Keluarga : " + objekKaryawan.getTunjanganKeluarga());
        System.out.println("Tunjangan Anak\t: " + objekKaryawan.getTunjanganAnak());
        System.out.println("Total Gaji\t: " + objekKaryawan.getGajiTotal());
        
    }
    
    
}
