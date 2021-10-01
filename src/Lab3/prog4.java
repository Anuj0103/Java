//Create a java program to implement stack and queue concept

package Lab3;

import java.util.Scanner;
import java.util.ArrayList;

public class prog4 {
 public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int val;
        System.out.println("Enter your choice: (1-Stack, 2-Queue)");
        val=sc.nextInt();
        if(val==1){
        System.out.println("Push 3 values for Stack");
        for(int i=0;i<3;i++){
            val=sc.nextInt();
            arrayList.add(val);
        }

        System.out.println("Popping element from stack");
        int valuePop=arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        System.out.println(valuePop+" popped from stack");
    }
        else{
            System.out.println("Enter 3 values for Queue");
        for(int i=0;i<3;i++){
            val=sc.nextInt();
            arrayList.add(val);
        }

        System.out.println("Removing element from queue");
        int valuePop=arrayList.get(0);
        arrayList.remove(0);
        System.out.println(valuePop+" removed from queue");
        }

        sc.close();   

    }
}
