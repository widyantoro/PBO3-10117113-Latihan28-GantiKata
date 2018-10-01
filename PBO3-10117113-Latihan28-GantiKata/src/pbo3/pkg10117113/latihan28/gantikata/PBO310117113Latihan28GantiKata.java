/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan28.gantikata;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program mengganti kata
 */
public class PBO310117113Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat,Kata,Ubah;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====PROGRAM MENGGANTI KATA====");
        System.out.println("");
        System.out.print("Masukan Kalimat : ");
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        Kata = scanner.nextLine();
        
        System.out.print("Menjadi kata : ");
        Ubah = scanner.nextLine();
        
        String Ganti = Kalimat.replace(Kata, Ubah);
        System.out.println("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+ Kalimat);
        System.out.println("Kalimat baru : "+ Ganti);
    }
    
}
