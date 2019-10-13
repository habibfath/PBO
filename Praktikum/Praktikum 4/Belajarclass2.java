package belajarclass;

public class Belajarclass {
    
    public static void main(String [] args) {
        mobil sedan = new mobil("City","Honda");
        
        /*sedan.isikanjenis("City");
        sedan.isikanmerk("Honda");
        sedan.isikancc(1600);*/
        
        sedan.isikancc(2000);
        
        System.out.println("Sedan");
        System.out.println("Jenis : " + sedan.perolehjenis());
        System.out.println("Merk : " + sedan.perolehmerk());
        System.out.println("CC" + sedan.perolehcc());
               
    }
}