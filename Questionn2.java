//Unique Numbers
import java.util.*;
public class Questionn2 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,arr[];
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int j=0;j<n;j++){
            hs.add(arr[j]);
        }
        System.out.println(hs);

}
}
