
package Sorting;

import java.util.Scanner;

public class insertionSort {
 public static void main(String args[])
 {
     Scanner in=new Scanner(System.in);
     int i,j;
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.println("Array before sorting:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        long start=System.currentTimeMillis();
        int temp;
        for(i=1;i<n;i++)
        {
            temp=a[i];
            for(j=i-1;j>=0;j--)
            {
                if(temp<a[j])
                {
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("Time complexity:"+(end-start));
        System.out.println();
         System.out.println("Sorted array:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        System.out.println();
 }
}
