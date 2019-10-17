import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class BacaFile{
    public static void main(String[] args)
    {
       
        
        Scanner console = new Scanner(System.in);
        System.out.println("Masukkan Nama Filenya?");
        String namaFileInput = console.nextLine();
        System.out.println("Nama File outputnya?");
        String namaFileOutput = console.nextLine();
        
        console = new Scanner(System.in);
        File FileInput = new File(namaFileInput);
        Scanner in = new Scanner(FileInput);
        File FileOutput = new File(namaFileOutput);
        PrintWriter out = new PrintWriter(namaFileOutput);

        try{  
            in = new Scanner(FileInput);
            out = new PrintWriter(FileOutput);
        } catch (FileNotFoundException e1) {

        System.out.println("File tidak ada!");
        }


        int a = 1;

        while(in.hasNextLine()){    
            String line = in.nextLine();
            out.println("/*" + a + "*/" + line);
            a++;
}
out.close();
in.close();
    }
}