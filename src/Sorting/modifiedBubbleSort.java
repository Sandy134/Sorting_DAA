
package Sorting;
import java.util.Scanner;

public class modifiedBubbleSort {
    public static void main(String args[])
    {
        int n;
        Scanner in=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.println("Array before sorting:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        System.out.println();
        int flag;
        
        for(i=0;i<n-1;i++)
        {
            flag=0;
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    flag=1;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(flag==0)
                break;
        }
        
        System.out.println("Sorted array:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
