class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        // for(int i=0; i<words.length; i++){
        //     for(int j=0; j<words.length; j++){
        //         if(i!=j){
        //             if (checkPalin(words[i], words[j])==true){
        //                 List<Integer> ans = new ArrayList<>();
        //                 ans.add(i);
        //                 ans.add(j);
        //                 list.add(ans);
        //             }
        //         }
        //     }
        // }
        // return list;
        
        // Optimized
        
        HashMap<String, Integer> map  =new HashMap<>();
        for(int i=0; i<words.length;i++){
            map.put(words[i], i);
        }
        
        if(map.containsKey("")){
            int blankidx = map.get("");
            
            for(int i=0; i<words.length; i++){
                if(i!=blankidx && checkPalin(words[i])){
                    list.add(Arrays.asList(blankidx, i));
                    list.add(Arrays.asList(i, blankidx));
                }
            }
        }
        
        for(int i=0;i<words.length; i++){
            String reversed = new StringBuilder(words[i]).reverse().toString();
            Integer reverseidx = map.get(reversed);
            if(reverseidx!=null && reverseidx!=i){
                list.add(Arrays.asList(i, reverseidx));
            }
        }
        
        for(int i=0; i<words.length; i++){
            String cur =words[i];
            for(int cut =1; cut<cur.length(); cut++){
                String left = cur.substring(0,cut);
                String right = cur.substring(cut);
                if(checkPalin(left)){
                    String reverseRight = new StringBuilder(right).reverse().toString();
                    if(map.containsKey(reverseRight)){
                        list.add(Arrays.asList(map.get(reverseRight), i));
                    }
                }
                
                if(checkPalin(right)){
                    String reverseLeft = new StringBuilder(left).reverse().toString();
                    if(map.containsKey(reverseLeft)){
                        list.add(Arrays.asList(i, map.get(reverseLeft)));
                    }
                }
                
                
            }
        }
        return list;
    }
    
    boolean checkPalin(String str){
        
        
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
}