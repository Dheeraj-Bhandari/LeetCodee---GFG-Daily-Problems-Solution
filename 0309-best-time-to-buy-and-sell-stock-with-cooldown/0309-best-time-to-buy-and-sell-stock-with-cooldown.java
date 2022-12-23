class Solution {
    public int maxProfit(int[] prices) {
        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;
        
        for(int i=0; i<prices.length; i++){
            int nbsp =0;
            int nssp =0;
            int ncsp =0;
            
            if(obsp > ocsp-prices[i]){
                nbsp = obsp;
            }
            else nbsp = ocsp-prices[i];
            
            if(ossp > obsp+prices[i]){
                nssp = ossp;
            }
            else{
                nssp = obsp+prices[i];
            }
            if(ocsp > ossp){
                ncsp = ocsp;
            }
            else{
                ncsp = ossp;
            }
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        return ossp;
    }
}