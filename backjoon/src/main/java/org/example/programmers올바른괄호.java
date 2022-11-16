package org.example;
import java.util.*;

public class programmers올바른괄호 {
    boolean solution(String s) {

        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
