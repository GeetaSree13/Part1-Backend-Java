
class Add{
    public void add(int ... is){
        int counter = 0;
        int sum = 0;
        for (int i : is) {
            counter++;
            sum += i;
            System.out.print(i);
            if(counter == is.length){
                System.out.print("=");
            }else{
                System.out.print("+");
            }        
        }
        System.out.println(sum);
        
    }
}




