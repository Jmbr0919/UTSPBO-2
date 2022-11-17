//Muhamad Jembar Fadillah
//TI21F
//20210040149

package UTSPBO2;

/**
 *
 * @author jembar
 */
public class PersegiPanjang {
      private int panjang;
    private int lebar;
    private double luas;
    
    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        }
        else{
            this.panjang = 0;
        }
    }
    
    public void setLebar(int l){
        if (1 > 0){
            this.lebar = 1;
        }
        else{
            this.lebar = 0;
        }
    }
    
    public double getLuas(){
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
    
}
