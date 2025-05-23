class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        return Arrays.stream(spells)
            .map(spell -> {
                int left = 0, right = potions.length;

                // Binary search to find the first potion that satisfies the condition
                while (left < right) {
                    int mid = (left + right) / 2;
                    if ((long) spell * potions[mid] >= success) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }

                // All potions from index 'left' to end are successful
                return potions.length - left;
            })
            .toArray();
    }
}