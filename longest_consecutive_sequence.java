// Question from leetcode and coding ninjas:-
we have to return length of longest chain of element:-

import java.util.HashSet;
import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> h = new HashSet<>();
        int res = 0;
        int cur = 0;
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
        if(!h.contains(nums[i]-1)){
            cur =1;
        
            while(h.contains(nums[i]+cur)){
                cur++;
            }
           res = Math.max(res,cur); 
        }
        }
        return res;
    }
}
