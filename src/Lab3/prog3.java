//WAP using Bubble sort for sorting in ascending Order.

package Lab3;

import java.util.Scanner;

public class prog3 {
 void bubbleSort(int[] arr,int n){
        int temp;
          for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");          
    }
    public static void main(String[] args) {

        prog3 sort=new prog3();
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array ");
        n=sc.nextInt();

        var arr=new int[n];

        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        sc.close();   
        
        sort.bubbleSort(arr, n);
    }
}
