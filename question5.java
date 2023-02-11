//File handling in Java
import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
public class question5{
    public static void main(String[] args) {
        try {
        int total=0;
        String s;
        Double tb=0.00,max=0.00,min=99999.00;
        BufferedReader b=new BufferedReader(new FileReader("question5.csv"));
        while ((s=b.readLine())!=null) {
            String ta[]=s.split(",");
            int n=ta.length;
            total++;
            Double k=Double.parseDouble(ta[n-1]);
            tb+=k;
            if(k>max){
                max=k;
            }
            if(k<min){
                min=k;
            }
        }
        System.out.println("Total number of Transactions (bills) :"+total);
        System.out.println("Total Bill amount :"+tb);
        System.out.println("Maximum Bill amount :"+max);
        System.out.println("Minimum Bill amount :"+min);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Running Error");
        }
       

    }
}