package org.example;
import java.util.*;

public class backjoon2562 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }

        int max_i=0;
        for(int i=0;i<9;i++){
            if(arr[max_i]<arr[i]){
                max_i=i;
            }
        }
        System.out.println(arr[max_i]);
        System.out.println(max_i+1);

    }
}
