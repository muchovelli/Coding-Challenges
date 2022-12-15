import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}