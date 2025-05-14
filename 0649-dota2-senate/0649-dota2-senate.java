class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>(); // Queue for Radiant senators
        Queue<Integer> dire = new LinkedList<>();    // Queue for Dire senators

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i); // Add Radiant senator's index to the queue
            } else {
                dire.offer(i);    // Add Dire senator's index to the queue
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll(); // Get the next Radiant senator
            int dIndex = dire.poll();    // Get the next Dire senator

            if (rIndex < dIndex) {
                // Radiant senator bans Dire senator, and returns next round
                radiant.offer(rIndex + n);
            } else {
                // Dire senator bans Radiant senator, and returns next round
                dire.offer(dIndex + n);
            }
        }

        // The winning party is the one with remaining senators
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}