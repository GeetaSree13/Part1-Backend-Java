

        //Write your code here
        Arrays.sort(s, 0, n, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        BigDecimal anum = new BigDecimal(a);
        BigDecimal bnum = new BigDecimal(b);
        return bnum.compareTo(anum);
    }
});
