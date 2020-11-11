/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Mahasiswa implements Serializable{

     private String nim;
     private String nama;
     private String jurusan;
     private String prodi;
     private String ipk;

    public Mahasiswa(String nim, String nama, String jurusan, String prodi, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getIpk() {
        return ipk;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

     public Mahasiswa(String nim, String nama) {
         this.nim = nim;
         this.nama = nama;
     }

     public String getNim() {
         return nim;
     }

     public void setNim(String nim) {
         this.nim = nim;
     }

     public String getNama() {
         return nama;
     }

     public void setNama(String nama) {
         this.nama = nama;
     }

     @Override
     public String toString() {
         return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + '}';
     }
     public String [] getArray(){
         return new String[]{nim, nama, jurusan, prodi, ipk};
     }
}
