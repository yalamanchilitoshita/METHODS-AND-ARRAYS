import java.util.Scanner;
public class ArraySumAverage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements to the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        System.out.println("elements of the array are");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
            sum=sum+a[i];
        }
        double average=(double)sum/n;
        System.out.println();
        System.out.println("sum of the array is "+sum);
        System.out.println("average of the array is "+average);
        sc.close();

    }
   
}

