class Solution {
    public double average(int[] salary) {
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double   sum =0;
        for(int i:salary){
            max = Math.max(i, max);
            min = Math.min(i, min);
            sum+=i;
        }
        sum=sum-(max+min);
        return sum/(salary.length-2);
    }
}