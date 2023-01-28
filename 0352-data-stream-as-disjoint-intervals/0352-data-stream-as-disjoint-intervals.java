class SummaryRanges {
        Set<Integer> set;
    public SummaryRanges() {
        set = new TreeSet<>();
        
    }
    
    public void addNum(int value) {
        set.add(value);
    }
    
    public int[][] getIntervals() {
        List<int[]> list = new ArrayList<>();
        
        
        for(int n : set){
            
            if(list.size()> 0 && list.get(list.size()-1)[1]+1==n){
                    list.get(list.size()-1)[1] = n;
            }
            else{
                list.add(new int[]{n,n});
            }
        }
        
        return list.toArray(new int[0][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */