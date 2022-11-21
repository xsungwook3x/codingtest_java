package org.example;

import java.awt.Point;
import java.io.*;
import java.util.*;

public class softeer3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] dice={1,2,3,4,5,6};

        int n =sc.nextInt();
        int jump=sc.nextInt();
        Map<Integer, Integer> jumps = new HashMap<Integer, Integer>();
        for(int i=0;i<jump;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            jumps.put(a,b);
        }

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0));
        while(q.size()!=0){
            Point v=q.poll();
            if(v.x>=n-1){
                System.out.println(v.y);
                break;
            }


            for(int i=0;i<6;i++){
                if(jumps.containsKey(v.x+dice[i])){
                    q.add(new Point((Integer) jumps.get(v.x+dice[i]),v.y+1));
                }
                q.add(new Point((v.x+dice[i]),v.y+1));
            }
        }
    }
}
