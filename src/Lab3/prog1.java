////Write a program to find out the array index or position wheresum of numbers preceeding the index is equals to sum of numbers succeeding the index.

package Lab3;

public class prog1 {
 public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,2,9,10};
        int sum=0;
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }

        int num=0;
        for(int i=0;i<10;i++){
            num+=arr[i];
            if(num==(sum-arr[i+1])/2){
            System.out.print("\nIndex is: "+(i+1));
            break;
            }
        }

        //10 9 10     29-9/2 
        
    }
}
