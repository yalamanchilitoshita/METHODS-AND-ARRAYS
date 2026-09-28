import java.util.Scanner;
public class CopyArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements of the array");
        int n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        System.out.println("enter elements to the array");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        // Copying elements from a1 to a2
        for(int i=0;i<n;i++){
            a2[i]=a1[i];
        }
        System.out.println("elements of the original array are");
        for(int i=0;i<n;i++){
            System.out.print(" "+a1[i]);
        }
        System.out.println();
        
        // Displaying the copied array
        System.out.println("Copied Array:");
        for(int i=0;i<n;i++){
            System.out.print(a2[i]+" ");
        }
        sc.close();
    }
}
