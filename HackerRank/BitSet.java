import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        HashMap<Integer, BitSet> bitSetHM = new HashMap<Integer, BitSet>() {{
            put(1, b1);
            put(2, b2);
        }};
        
        for (int i = 0; i < m; i++) {
            String cmd = in.next();
            int p = in.nextInt();
            int q = in.nextInt();
            
            switch(cmd) {
                case "AND":
                    bitSetHM.get(p).and(bitSetHM.get(q));
                    break;
                case "OR":
                    bitSetHM.get(p).or(bitSetHM.get(q));
                    break;
                case "XOR":
                    bitSetHM.get(p).xor(bitSetHM.get(q));
                    break;
                case "FLIP":
                    bitSetHM.get(p).flip(q);
                    break;
                case "SET":
                    bitSetHM.get(p).set(q);
                    break;
            }
            System.out.println(bitSetHM.get(1).cardinality()+" "+ bitSetHM.get(2).cardinality());
            if(in.hasNextLine()) {
                in.nextLine();
            }
        }
            
        in.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
