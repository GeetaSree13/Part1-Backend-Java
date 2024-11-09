

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal=Calendar.getInstance();
        cal.set(year, month - 1, day);
        int d= cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(d);
        if (d==1)return "SUNDAY";
        else if(d==2)return "MONDAY";
        else if(d==3)return "TUESDAY";
        else if(d==4)return "WEDNESDAY";
        else if(d==5)return "THURSDAY";
        else if(d==6)return "FRIDAY";
        else if(d==7)return "SATURDAY";
        else return null;
    

    }
    //return d;

}

