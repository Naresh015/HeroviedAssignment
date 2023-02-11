//Missing Numbers
import java.util.Scanner;
class Questionn1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,arr[];
        N=sc.nextInt();
        arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int e=arr[N-1];
        for(int i=1;i<=e;i++){
            int c=0;
            for(int j=0;j<N;j++){
                if(i==arr[j]){
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
