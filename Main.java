//Muhamad Jembar Fadillah
//TI21F
//20210040149

package UTSPBO2;

/**
 *
 * @author jembar
 */
public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(12);
        pp1.setLebar(7);
        double luasCDEF = pp1.getLuas();
        
        Lingkaran l1 = new Lingkaran();
        l1.setJejari(6);
        double luasX = 0.5 * l1.getLuas();
        
        double luasArsir = luasCDEF - luasX;
        System.out.println("Luas daerah diarsir: "+ luasArsir + "cm2");
    }
}
