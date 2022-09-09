class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
	
		
        Arrays.sort(properties, (a,b) -> a[0] == b[0] ? b[1]-a[1] : a[0]-b[0]);
	
        int ans =0;
	
		
        int maxVal = properties[properties.length-1][1];
        
        for(int i = properties.length-2 ; i>=0; i--){
        
			if(properties[i][1] < maxVal)
                ans++;
            else maxVal = properties[i][1];
        }
        return ans;
    }
}