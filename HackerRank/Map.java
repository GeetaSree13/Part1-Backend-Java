import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Read number of entries
        in.nextLine(); // Consume the remaining newline

        // Create a HashMap to store names and phone numbers
        Map<String, Integer> map = new HashMap<>();

        // Read n entries
        for (int i = 0; i < n; i++) {
            String name = in.nextLine(); // Read name
            int phone = in.nextInt();     // Read phone number
            in.nextLine(); // Consume the newline

            // Store name and phone number in the map
            map.put(name, phone);
        }

        // Process queries
        while (in.hasNext()) {
            String query = in.nextLine(); // Read query name
            String response = map.containsKey(query) ? query + "=" + map.get(query) : "Not found";
            System.out.println(response); // Print response
        }

        in.close(); // Close the scanner
    }
}
