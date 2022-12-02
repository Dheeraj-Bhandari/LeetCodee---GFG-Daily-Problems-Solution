class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch:word1.toCharArray())map1.put(ch, map1.getOrDefault(ch, 0)+1);
        
        for(char ch:word2.toCharArray())map2.put(ch, map2.getOrDefault(ch, 0)+1);
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(Integer i:map1.values()) list1.add(i);
        for(Integer i:map2.values()) list2.add(i);

        if(!map1.keySet().equals(map2.keySet()))return false;

        Collections.sort(list1);
        Collections.sort(list2);


        return list1.equals(list2);


        
    }
}