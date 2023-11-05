import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            int dif = target - v;
            if (m.containsKey(dif)) {
                int key = m.get(dif);
                return new int[] { i, key };
            }
            m.put(v, i);
        }
        return null;
    }
}