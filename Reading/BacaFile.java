import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class BacaFile{
    public static void main(String[] args)
    throws FileNotFoundException
    {             
        Scanner console = new Scanner(System.in);
        System.out.print("Masukkan Nama Filenya?");
        String namaFileInput = console.next();
        System.out.print("Nama File outputnya?");
        String namaFileOutput = console.next();
        
        File FileInput = new File(namaFileInput);
        Scanner in = new Scanner(FileInput);
        File FileOutput = new File(namaFileOutput);
        PrintWriter out = new PrintWriter(namaFileOutput);
        
        int a = 1;
        while(in.hasNextLine()){    
            String line = in.nextLine();
            out.printf(String.format("/* %d */ %s\n", a, line));
        a++;
        }
        out.close();
        in.close();
    }
}