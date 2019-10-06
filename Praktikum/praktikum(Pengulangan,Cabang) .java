/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author PC105-15
 */
import java.util.Scanner;
public class Praktikum2 {

    /**
     * pengulangan for 
     */
    public static void main(String[] args) {
        /*int a=0;
         INI FOR 
        int a=0;
        for(a=0; a<=5; a++){
            System.out.println("nilai dari a ke-" + a +" adalah " + a);
        }
       
        INI WHILE
        while(a <=5){ 
            System.out.println("nilai dari a ke-" + a +" adalah " + a);
            a++;
            
       }
        
        INI DO
       do{
           System.out.println("nilai dari a ke-" + a +" adalah " + a);
           a++;
       } 
       while(a<5);
        
        INI IF ELSE
        int a = 0;
        int b = 0;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print ("Masukkan angka pertama : ");
        a = masuk.nextInt();
        System.out.print ("Masukkan angka pertama : ");
        b = masuk.nextInt();      
        
        
        if (a >b) {
            System.out.println("Angka pertama lebih besar");
        }
        else if(a == b){
            System.out.println("Angka pertama sama dengan angka kedua");
        }
        else{
            System.out.println("Angka kedua lebih besar");
        }
        
    }*/
        int a = 0;
        int b = 0;
        
        Scanner masuk = new Scanner(System.in);
        a = masuk.nextInt();
        
        switch(a) {
            case 1 :
                System.out.println("ini angka satu");
            break;
            case 2 :
                System.out.println("ini angka dua");
            break;
            case 3 :
                System.out.println("ini angka tiga");
            break;    
            default :
                System.out.println("angka tidak sesuai");
}
    
    
    
    
}
