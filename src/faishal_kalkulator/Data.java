package faishal_kalkulator;

/**
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */

public class Data {
    
    private int operan1;
    private int operan2;
    private int hasil;

    public Data() {
        this.operan1 = 0;
        this.operan2 = 0;
        this.hasil = 0;
    }

    public void setOperan1(int operan1) {
        this.operan1 = operan1;
    }

    public void setOperan2(int operan2) {
        this.operan2 = operan2;
    }

    public int getHasil() {
        return hasil;
    }    
    
    public void countPenjumlahan() {
        this.hasil = this.operan1 + this.operan2;
    }
    
    public void countPengurangan() {
        this.hasil = this.operan1 - this.operan2;
    }
    
    public void countPerkalian() {
        this.hasil = this.operan1 * this.operan2;
    }
}
