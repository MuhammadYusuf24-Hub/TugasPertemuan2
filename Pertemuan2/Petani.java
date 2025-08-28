/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan2;

/**
 *
 * @author LENOVO
 */
public class Petani extends manusia implements Bertani, Beternak, Berdagang {

    public Petani(String nama, int umur) {
        super(nama, umur); // panggil constructor manusia   
    }
    
    public void menanam() {
        System.out.println("\n=== Bertani ===");
        System.out.println(getNama() + " sedang menanam padi.");
    }

    public void memanen() {
        System.out.println(getNama() + " sedang memanen hasil padi. ");
    }

    public void merawatTanaman() {
        System.out.println(getNama() + " sedang merawat tanaman dengan baik.\n");
    }

    public void memberiMakan() {
        System.out.println("=== Beternak");
        System.out.println(getNama() + " sedang memberi makan ternak. ");
    }

    public void membersihkanKandang() {
        System.out.println(getNama() + " sedang membersihkan kandang ternak.");
    }

    public void memerahSusu() {
        System.out.println(getNama() + " sedang memerah susu sapi.\n");
    }

    public void menjual() {
        System.out.println("=== Berdagang ===");
        System.out.println(getNama() + " sedang menjual hasil panen di pasar.  ");
    }

    public void membeli() {
        System.out.println(getNama() + " sedang membeli bibit baru. ");
    }

    public void menawar() {
        System.out.println(getNama() + " sedang sedang menawar harga barang. ");
    }

    public static void main(String[] args) {
        Petani p1 = new Petani("Budi", 35);
        p1.info();
        
        // Coba method dari interface
        p1.menanam();
        p1.memanen();
        p1.merawatTanaman();

        p1.memberiMakan();
        p1.membersihkanKandang();
        p1.memerahSusu();

        p1.menjual();
        p1.membeli();
        p1.menawar();
    }

}
