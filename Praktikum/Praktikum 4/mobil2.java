package belajarclass ;


public class mobil {
    private String jenis;
    private String merk;
    private int cc;

    mobil(String city, String honda) {
        
    }
  
    public void isikanjenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void isikanmerk(String merk){
        this.merk = merk;
    }
    
    public void isikancc(int cc){
        this.cc = cc;
    }
    public String perolehjenis(){
        return jenis;
    }
    public String perolehmerk(){
        return merk;
        
    }
    public int perolehcc(){
        return cc;
    }




   
        
    
}