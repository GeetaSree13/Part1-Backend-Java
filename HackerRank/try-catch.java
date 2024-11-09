import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        try{
            int x = in.nextInt();
            int y = in.nextInt();
            if(x>=0 && y>=0)
            System.out.println(x/y);
        }catch(InputMismatchException ee){
            System.out.println("java.util.InputMismatchException");
        }
            catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
