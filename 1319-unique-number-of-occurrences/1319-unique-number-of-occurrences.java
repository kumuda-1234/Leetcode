class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int freq = map.get(num);
                freq++;
                map.put(num, freq);
            }
        }

        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (set.contains(me.getValue())) {
                return false;
            } else {
                set.add(me.getValue());
            }
        }

        return true;
    }
}