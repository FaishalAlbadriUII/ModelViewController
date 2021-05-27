package faishal_kalkulator;

import java.util.Scanner;

/**
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */

public class Tampilan {
    
    private Scanner scanner;

    public Tampilan() {
        this.scanner = new Scanner(System.in);
    }
    
    public void displayMenu() {
        System.out.println("Menu Kalkulator");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("0. Keluar");
    }
    
    public int promtpPilihan(){
        System.out.print("Menu yang dipilih (0-3): ");
        return scanner.nextInt();
    }
    
    public void promptPilihan2(Data d) {
        System.out.print("Masukan Bilangan Pertama : ");
        d.setOperan1(scanner.nextInt());
        System.out.print("Masukan Bilangan Kedua : ");
        d.setOperan2(scanner.nextInt());
    }
    
    public void displayHasil(Data d) {
        System.out.println("Hasilnya : " + d.getHasil());
        System.out.println("");
    }

    public void displayClosing() {
        System.out.println("Terima Kasih....");
    }
    
}
