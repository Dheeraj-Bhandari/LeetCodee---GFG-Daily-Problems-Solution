class Solution {
    public class Eng{
        public int speed;
        public int eff;
        public Eng(int speed, int eff){
            this.speed= speed ;
            this.eff= eff;
        }
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        List<Eng> eng = new ArrayList<>();
        for(int i=0; i<n; i++){
            eng.add(new Eng(speed[i], efficiency[i]));
        }
        
        
        eng.sort((a,b)-> b.eff-a.eff);
        
        PriorityQueue<Eng> curTeam = new  PriorityQueue<>((a,b)->a.speed-b.speed);
        
        long teamspeed= 0;
        long maxperf = 0;
        
        for(Eng newHire : eng){
            if(curTeam.size()==k){
                Eng slowGuy = curTeam.poll();
                teamspeed-= slowGuy.speed;
                
            }
            teamspeed+=newHire.speed;
            curTeam.add(newHire);
            long per = teamspeed*(long)newHire.eff;
            maxperf = Math.max(maxperf, per);
        }
        return (int) (maxperf%1000000007);
    }
}