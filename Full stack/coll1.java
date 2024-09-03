import java.util.ArrayList;
import java.util.Scanner;

public class coll1{
    public static void main(String args[]){
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<5; i++){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            a1.add(a);

        }
        a1.remove(1);
        System.out.println(a1+" ");
       
    }
}