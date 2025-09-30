import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        int n = nums.length;
        int curCount = 0;
        int currentNumber = Integer.MIN_VALUE;
        HashSet<Integer> hash = new HashSet<>();
        if(n == 0) return 0;
        for(int i : nums){
            hash.add(i);
        }

        for(int i : hash){
            if(!hash.contains(i-1)){
                //restart count
                curCount = 1;
                currentNumber = i;
                while(hash.contains(currentNumber + 1)){
                    curCount++;
                    currentNumber++;
                }
            maxLen = Math.max(maxLen, curCount);
            }


        }

        return maxLen;
    }
}