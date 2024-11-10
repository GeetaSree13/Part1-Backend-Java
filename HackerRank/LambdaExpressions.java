import java.io.*;
import java.util.*;
import java.math.BigInteger;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 
 public PerformOperation isOdd(){
     PerformOperation operation=new PerformOperation(){
     
         @Override
         public boolean check(int a) {
             // TODO Auto-generated method stub
             return a % 2 !=0;
         }
     };
     return operation;
 }
 
 public PerformOperation isPrime(){
     
         PerformOperation operation=new PerformOperation(){
     
         @Override
         public boolean check(int a) {
           boolean isPrime=  (new   BigInteger(""+a)).isProbablePrime(1);
             return isPrime;
         }
     };
     return operation;
 }
 public PerformOperation isPalindrome(){
     
        PerformOperation operation=new PerformOperation(){
     
         @Override
         public boolean check(int a) {
             StringBuilder builder=new StringBuilder(""+a).reverse();
             return builder.toString().equals(""+a);
         }
     };
     return operation;
 }
}
   // Write your code here

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
