class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
    
        List<Pair> list = new ArrayList<>();
        for(int i=0; i<ages.length; i++){
            list.add(new Pair(ages[i], scores[i]));
        }
        Collections.sort(list , (a,b)->{
            return a.age==b.age ? a.score-b.score : a.age - b.age;
        });
        
        int[] dp = new int[ages.length];
        dp[0] = list.get(0).score;
        int max = dp[0];
        for(int i=1; i<ages.length; i++){
            dp[i] = list.get(i).score;
            
            for(int j=0; j<i; j++){
                
                if(list.get(j).score <= list.get(i).score){
                    dp[i] = Math.max(dp[i], dp[j]+list.get(i).score);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
        
    }
    
    class Pair{
        int age;
        int score;
        
        public Pair(int age, int score){
            this.age = age;
            this.score = score;
        }
    }
}