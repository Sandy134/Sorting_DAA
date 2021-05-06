
package Sorting;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n =in.nextInt();
        int arr[]=new int[n];
        Random r = new Random();
        for(int i=0;i<n;i++){
            arr[i]=r.nextInt(100);
        }
        System.out.println("Array Before sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        long start = System.currentTimeMillis();
        
        quickSort(arr,0,n-1);
        
        long end = System.currentTimeMillis();
        
        
        System.out.println("Array After sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.printf("Time complexity is:%.3f",(double)(end - start)/1000);
        System.out.println();
        
    }
    public static void quickSort(int arr[],int l,int h){
       int pi = partition(arr,l,h);
       if(l < pi - 1){
           quickSort(arr, l, pi-1);
       }
       if(h > pi){
           quickSort(arr,pi,h);
       }
    }
    public static int partition(int arr[],int l,int h){
        
        int pivot = arr[(l+h)/2];
        while(l <= h){
            while(arr[l] < pivot){
                l++;
            }
            while(arr[h]>pivot){
                h--;
            }
            if(l <= h){
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
        }
        return l;
    }
}
