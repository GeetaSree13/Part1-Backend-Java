import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int c=A.compareTo(B);
        if(c>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");   
        }
        String a=Character.toUpperCase(A.charAt(0))+A.substring(1).toLowerCase();
        String b=Character.toUpperCase(B.charAt(0))+B.substring(1).toLowerCase();
        System.out.print(a+" "+b);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



