class Solution {
    public boolean validUtf8(int[] data) {
            int rbyte =0;       
        for(int val: data){
            if(rbyte==0){
                if((val>>7)==0b0){
                    rbyte = 0;
                }
                else if((val>>5)==0b110){
                    rbyte=1;
                }
                else if((val>>4)==0b1110){
                    rbyte=2;
                }
                else if((val>>3)==0b11110){
                    rbyte = 3;
                }
                else return false;
            }
            else{
                if((val>>6)==0b10){
                    rbyte--;
                }
                else return false;
            }
        }
                  return rbyte==0;
    }
}