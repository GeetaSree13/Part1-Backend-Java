

//Write your code here
Set<String> set=new LinkedHashSet<>();
    String x;

     for(int i=0;i<pair_left.length;i++){
         x="";
         x=pair_left[i]+" "+pair_right[i];
         set.add(x);
         System.out.println(set.size());
     }

