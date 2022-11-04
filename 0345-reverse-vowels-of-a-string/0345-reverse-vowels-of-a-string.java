    class Solution {
        public String reverseVowels(String s) {
          
            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            set.add('A');
            set.add('E');
            set.add('I');
            set.add('O');
            set.add('U');

            char[] ch = s.toCharArray();
            int i=0;
            int j = ch.length-1;
            while(i<j){
            
                while(!set.contains(ch[i]) && i<j)i++;
                while(!set.contains(ch[j]) && i<j)j--;
                
                if(i<j){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                i++;
                j--;
            }
            return String.valueOf(ch);
            
        }
    }