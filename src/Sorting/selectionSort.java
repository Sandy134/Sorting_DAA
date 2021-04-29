
package Sorting;

import java.util.Scanner;


public class selectionSort {
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
        
        System.out.println();
        
        long start=System.currentTimeMillis();
        int min;
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    int temp=a[j];
                    a[j]=a[min];
                    a[min]=temp;
                }
            }
        }
        
        long end=System.currentTimeMillis();
        System.out.println("Time complexity:"+(end-start));
        
        System.out.println("Sorted array:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        System.out.println();
    }
}
