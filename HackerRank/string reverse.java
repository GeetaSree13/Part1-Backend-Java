import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String a="";
        for(int i=A.length()-1;i>=0;i--){
            a=a+A.charAt(i);
        }
        //System.out.print(a);
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(a)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}



