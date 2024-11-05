//Write code that throws a custom exception if the given number has more than one digit. 
//Catch the exception and print an appropriate message.

import java.util.*;
public class MyException extends Exception {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int number=sc.nextInt();
    String s=Integer.toString(number);
    try{
      if(s.length()>1){
        MyException me=new MyException();
        throw me;
      }
      else{
        System.out.println("The number is : "+number);
      }
    }
    catch(MyException me){
      System.out.println("Exception occured number has more than one digit");
    }
    finally{
      sc.close();
    }
    
  }
  
}
