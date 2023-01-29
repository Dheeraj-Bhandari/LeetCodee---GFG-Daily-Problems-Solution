class LRUCache {
    
    class Node{
        int key, value;
        Node prev ;
        Node next;
        
    }
    
    private void addNode(Node node){
        
        Node temp = head.next;
       
        node.next = temp;
        node.prev = head;
        temp.prev = node;
        head.next = node;
    }
    
    private void removeNode(Node node){
        Node temp = node.prev;
        temp.next = node.next;
        node.next.prev = temp;
        
        node.next = node.prev = null;
    }
    
    private void moveToFront(Node node){
        removeNode(node);
        addNode(node);
    }
    
    HashMap<Integer, Node> map;
    int cap;
    Node head, tail;
    
    public LRUCache(int capacity) {
        
        map = new HashMap<>();
        cap = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node temp = map.get(key);
            moveToFront(temp);            
            return temp.value;

        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node==null){
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            
            if(map.size()==cap){
                Node lru = tail.prev;
                map.remove(lru.key);
                removeNode(lru);
               
            }
            
               map.put(key, newNode);
               addNode(newNode);
            
        }
        else{
            node.value = value;
            moveToFront(node);
           
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */