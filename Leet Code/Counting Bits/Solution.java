class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
 
        int p = 1; //p tracks the index for number x
        int pow = 1;
        for(int i=1; i<=n; i++){
            if(i==pow){
                result[i] = 1;
                pow <<= 1;
                p = 1;
            }else{
                result[i] = result[p]+1;
                p++;
            }
    
        }
 
    return result;
    }
}