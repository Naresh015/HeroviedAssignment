//Inventory management System for a Small Electronics Store using Arrays
import java.util.*;
public class question3 {
    public static void print1(String arr[]){
        int i=1;
        for(String id:arr){
            System.out.println(i+"."+id);i++;
        }
    }
    public static void print2(String arr[],int a[]){
        for(int j=0;j<4;j++){
            System.out.println(j+1+"."+arr[j]+"-->count:"+a[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]={"PRODUCT LIST","PRODUCT COUNT","VIEW PRODUCT DETAILS","EDIT PRODUCTS","UPDATE INVENTORY"};
        print1(arr);
        String a1[]={"Laptops","Mobiles","Ear buds","Watchs"};
        int a2[]={26,187,300,200};
        String a31[]={"DELL-->cost-55,000-->count-5","HP-->cost-50,000-->count-5","LENOVO-->cost-45,000-->count-6","ASUS-->cost-40,000-->count-10"};
        String a32[]={"REDMI-->cost-15,000-->count-37","VIVO-->cost-10,000-->count-50","INFINIX-->cost-9,000-->count-50","IQ-->cost-30,000-->count-50"};
        String a33[]={"BOAT-->cost-1,200-->count-90","NOISE-->cost-1,100-->count-110","REALME-->cost-1,000-->count-150","NOTHING-->cost-1,800-->count-50"};
        String a34[]={"FASTRACK-->cost-2,000-->count-90","TITAN-->cost-18,000-->count-20","REALME-->cost-4,000-->count-70","ROLEX-->cost-16,000-->count-10"};
        System.out.println("Select the above list:");
        int n=sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("PRODUCT LIST");
                print1(a1);
                break;
            case 2:
            System.out.println("PRODUCT COUNT");
                print2(a1,a2);
                break;
            case 3:
            System.out.println("VIEW PRODUCT DETAILS");
            print1(a1);
            System.out.println("Select product in above list:");
            int a=sc.nextInt();
            switch (a){
                case 1:
                System.out.println("LAPTOPS");
                    print1(a31);
                    break;
                case 2:
                System.out.println("MOBILES");
                    print1(a32);
                    break;
                case 3:
                System.out.println("EAR BUDS");
                    print1(a33);
                    break;
                case 4:
                System.out.println("WATCHS");
                    print1(a34);
                    break;
                default:
                    break;
            }
            break;  
            case 4:
            System.out.println("EDIT PRODUCTS");
            print1(a1);
            System.out.println("Choose which product number want be edit:");
            int a4=sc.nextInt();
            System.out.println("Enter the New product name:");
            sc.nextLine();
            String p=sc.nextLine();
            a1[a4-1]=p;
            print1(a1);
            break;
            case 5:
            System.out.println("Add/Delete Product Quantities");
            print2(a1,a2);
            System.out.println("Choose which product Quantities want be edit:");
            int q=sc.nextInt();
            System.out.println("Enter the product count:");
            int z=sc.nextInt();
            a2[q-1]=z;
            print2(a1,a2);
            break;     
            default:
                break;
        }
    }
}

