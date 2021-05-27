package faishal_kalkulator;

/**
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class Kalkulator {
    
    Tampilan tmp;
    Data data;
    boolean main;
    
    public Kalkulator() {
        this.tmp = new Tampilan();
        this.data = new Data();
        this.main = true;
    }
    
    public void play() {
        tmp.displayMenu();
        int i = tmp.promtpPilihan();
        this.processByPilihan(i);
    }
    
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        do {            
            kalkulator.play();
        } while (kalkulator.main);
    }
    
    public void processByPilihan(int p) {
        if (p == 0) {
            tmp.displayClosing();
            this.main = false;
        } else if (p < 4 | p > 0) {
            tmp.promptPilihan2(data);
            switch (p) {
                case 1:
                    data.countPenjumlahan();
                    break;
                case 2:
                    data.countPengurangan();
                    break;
                
                case 3:
                    data.countPerkalian();
                    break;                
            }
            tmp.displayHasil(data);
        }
    }
}
