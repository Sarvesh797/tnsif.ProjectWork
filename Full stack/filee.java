import java.util.*;
import java.util.Scanner;
import java.io.*;
public class filee{
    public static void main(String args[]){
        //Scanner sc= new Scanner("");
        try{
            File f= new File("D:\\sssss.txt");
            f.createNewFile();
        }catch(Exception e){
            System.out.println("file error"+e.toString());
        }
        try(FileWriter f= new FileWriter("D:\\sssss.txt")){
            String str="My\n    Name\n is\nSarvesh";
            f.write(str);
            f.close();
        }
        catch(Exception e){
            System.out.println("file error"+e.toString());
        }
        try(FileReader f= new FileReader("D:\\sssss.txt")){
            Scanner sc= new Scanner(f);
            while(sc.hasNextLine());{
                String s=sc.nextLine();
                System.out.println(s);
            }

        }

    }

}