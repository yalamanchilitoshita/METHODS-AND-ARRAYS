import java.util.Scanner;
public class ArraySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of the elements of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the elements of the array are");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        System.out.println("enter the element to search");
        int x=sc.nextInt();
        int found=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                found=1;
                break;
            }
        }
        if(found==1){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
        sc.close();

    }
}
