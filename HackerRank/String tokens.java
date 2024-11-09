import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] array = s.split("[ !,?._'@]+");
        System.out.println(array.length);
        for(String i:array){
            System.out.println(i);
        }
        scan.close();
    }
}

