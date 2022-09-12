class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int maxScore = 0;
        int i =0;
        int j = tokens.length-1;
        
        while(i<=j){
           
             if(tokens[i]<=power){
                power-=tokens[i];
                score++;
                i++;
                maxScore = Math.max(maxScore, score);
            }
             else if(score>0 ){
                score--;
                power+=tokens[j];
                j--;
            }
            else break;
           
        }
        return maxScore;
    }
}