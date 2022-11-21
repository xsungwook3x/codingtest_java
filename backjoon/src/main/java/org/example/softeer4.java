package org.example;
import java.util.*;

public class softeer4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p=sc.next();
        int n=sc.nextInt();
        Map<String,String> password = new HashMap<>();
        for(int i=0; i<n;i++){
            String a=sc.next();
            String b=sc.next();
            password.put(a,b);
        }
        String req=sc.next();
        if( req.equals("!")){
            System.out.println("0000 SECURITY");
            return;
        }
        if(req.endsWith("!")){
            String[] tmp =req.split("[*]");
            if(password.containsKey(tmp[0])){
                System.out.println("0"+tmp[0]+" CALL");
                return;
            }
        }
        if(req.endsWith("*")){
            if (countChar(req, '*')==1){
                if(req.substring(0,req.length()-1).equals(p)){
                    System.out.println(p.substring(req.length()-5)+" OPEN");
                    return;
                }
            }
            else{
                String[] tmp=req.split("[*]");
                if(password.containsKey(tmp[0])){
                    if(password.get(tmp[0]).equals(tmp[1])){
                        if(tmp[1].length()<4){
                            System.out.println("0"+tmp[1]+" OPEN");
                            return;
                        }
                        else{
                            System.out.println(tmp[1].substring(tmp[1].length()-5)+" OPEN");
                            return;
                        }
                    }
                }
            }
        }

        if(!req.endsWith("!")&&!req.endsWith("*")&&!req.endsWith("#")){

            if(req.length()<4){
                String answer="";
                for(int i=0;i<4-req.length();i++){
                    answer+="0";
                }
                System.out.println(answer+req);
            }
            else{
                System.out.println(req.substring(req.length()-5));
            }
        }
    }

    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
