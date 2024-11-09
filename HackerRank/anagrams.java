

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] A=a.toCharArray();
        char[] B=b.toCharArray();
        sort(A);
        sort(B);
        for(int i=0;i<A.length;i++){
            if(A[i]!=B[i]){
                return false;
            }   
        }
        return true;
    }
    static void sort(char[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Swap array[j] and array[j + 1]
                char temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
