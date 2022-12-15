import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args){
        int[] nums = {4,1,-1,2,-1,2,3};
        nums = topKFrequent(nums, 2);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) { 
            if(map.get(nums[i]) == null){
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        
        List<Integer> keys = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        int[] result = new int[k];
        int i = 0;
        
        for(Integer key : keys) { 
            if(i < k){
                result[i] = key;
                i++;
            }else{
                break;
            }
        }

        return result;
    }
}