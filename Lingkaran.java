//Muhamad Jembar Fadillah
//TI21F
//20210040149

package UTSPBO2;

/**
 *
 * @author jembar
 */
public class Lingkaran {
     // Atribut
    private int jejari;
    private double luas;
    
    //Setter method untuk jejari
    public void setJejari(int r){
        if (r > 0 ){
            this.jejari = r;
        }
        else{
            this.jejari = 0;
        }
    }
    
    public double getLuas(){
        this.luas = Math.PI * Math.pow(this.jejari, 2);
        return this.luas;
    }
    
}
