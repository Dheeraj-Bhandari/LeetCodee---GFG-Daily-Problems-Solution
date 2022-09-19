class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String path :paths){
            String[] dir = path.split(" ");
            String rootPath  = dir[0];
            for(int i=1; i<dir.length; i++){
                String content = dir[i].substring(dir[i].indexOf("("), dir[i].indexOf(")"));
                
                if(!map.containsKey(content)){
                    map.put(content,new ArrayList<>());
                }
                
                map.get(content).add(rootPath+"/"+dir[i].substring(0,dir[i].indexOf("("))); 
            }
          
        }
        
          List<List<String>> list = new ArrayList<>();
            for(Map.Entry<String, List<String>> entry: map.entrySet()){
                if(entry.getValue().size()>1){
                    list.add(entry.getValue());
                }
            }
            return list;
    }
}