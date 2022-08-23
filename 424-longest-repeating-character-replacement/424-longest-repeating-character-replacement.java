class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int maxFrequency = Integer.MIN_VALUE;
        int ans = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // compute the frequency of each character and remember the maximum frequency
            char charRight = s.charAt(right);
            map.put(charRight, map.getOrDefault(charRight, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(charRight));

            // adjust the size of the window
            if ((right - left + 1) - maxFrequency > k) {
                char charLeft = s.charAt(left);
                map.put(charLeft, map.get(charLeft) - 1);
                left++;
            }
            
            ans = Math.max(ans, right - left + 1);
        }
        
        return ans;
    }
}