
package Sorting;

import java.util.Scanner;


public class shellSort {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        
        System.out.println("Elements before sorting:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        System.out.println("");
        
        int diff=(n/2)+1;
        while(diff!=0)
        {
            for(j=0;j+diff<n;j++)
            {
                
                if(a[j]>a[j+diff])
                {
                    int temp=a[j];
                    a[j]=a[j+diff];
                    a[j+diff]=temp;
                }
            }
            diff=diff/2;
        }
        
        System.out.println("Array after sorting:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
        System.out.println();
    }
}
