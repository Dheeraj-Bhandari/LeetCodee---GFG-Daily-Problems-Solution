class MyCircularQueue {
    int F;
    int R;
    boolean noElPresent;
    int [] cqueue = null;
    
    public MyCircularQueue(int k) {
        this.cqueue= new int[k];
        this.noElPresent = true;
        this.F = 0;
        this.R= 0;
        
    }
    
    public boolean enQueue(int value) {
        if(this.isFull()) return false;
        else{
            this.noElPresent = false;
            cqueue[R] = value;
            R = (R+1)%cqueue.length;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(this.isEmpty()){
            return false;
        }
        else{
            F = (F+1)%cqueue.length;
            if(F==R){
               this.noElPresent = true; 
            }
            return true;
        }
    }
    
    public int Front() {
        if(this.isEmpty()) return -1;
        else{
                return cqueue[F];
        }
    }
    
    public int Rear() {
        if(this.isEmpty()) return -1;
        else{
            if(R==0){
                return cqueue[cqueue.length-1];
            }
            else{
                return cqueue[R-1];
            }
        }
    }
    
    public boolean isEmpty() {
        return this.noElPresent;
    }
    
    public boolean isFull() {
        return F==R && this.isEmpty()==false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */