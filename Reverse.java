import java.util.*;
class Reverse{
    public static void main(String[] args){
        System.out.println("Enter the size of an array:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
        System.out.println("The array elements in Reverse order is: ");
        for(int i=n-1;i>=0;i--)
        System.out.println(arr[i]);
    }
}
