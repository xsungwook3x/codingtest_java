package org.example;
import java.util.*;

public class backjoon1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        int[] arr = new int[26];
        for(char c: s.toCharArray()){
            arr[c-'A']++;

        }
        int max=0;
        char answer='?';
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                answer=(char)(i+'A');

            }else if (max==arr[i]){
                answer='?';
            }
        }
        System.out.println(answer);

    }
}
