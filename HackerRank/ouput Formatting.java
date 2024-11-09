import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String str=x+"";
                if(str.length()==2){
                    str="0"+str;                    
                }
                else if(str.length()==1){
                    str="00"+str;                }
                s1=String.format("%-15s",s1);
                System.out.println(s1+str);
            }
            System.out.println("================================");

    }
}
