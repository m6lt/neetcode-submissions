class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //number, frequency
        Map<Integer, Integer> map = new HashMap<>();
        //for each index, we could potentially need to store a list of values 
        //multiples values may have the same frequency.
        //an array, where each element is a list of integers.
        List<Integer>[] freq = new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            //need to initialise each element, as they are currently set to null
            freq[i] = new ArrayList<>();
        }
        
        //populated the map with numbers and counts.
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                int count = map.get(num);
                count += 1;
                map.put(num, count);
            }
        }
        //for each count, store the numbers associated with that count in that slot
        map.forEach((n, count) -> {
            freq[count].add(n);
        });
        int j = 0;
        int[] result = new int[k];
        for (int i=freq.length - 1; i > 0; i--) {
            
            for (int n : freq[i]) {
                result[j] = n;
                j++;
                if (j==k) {
                return result;
                }
            }
            
        }
        return result;
    }

    
}
