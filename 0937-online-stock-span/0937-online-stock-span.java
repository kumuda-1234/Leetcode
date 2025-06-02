// Helper class for inserting into stack
class Pair {
    int value;
    int ind;

    public Pair(int valuePrice, int index){
        this.value = valuePrice;
        this.ind = index;
    }
}

// Main class
class StockSpanner {
    Stack<Pair> stk = new Stack<>(); // Monotonic stack to store next greater elements of a particular index when inserted
    int index = -1;

    public StockSpanner() {
        // Re-initialize everything for the new object
        index = -1;
        stk.clear();
    }

    public int next(int price) {
        // Check for the stack to provide the right answer
        
        index += 1; // Move to next index
        while (!stk.isEmpty() && stk.peek().value <= price) {
            stk.pop();
        }
        int ans = index - (stk.isEmpty() ? -1 : stk.peek().ind); // Compute answer with Next Greater element

        Pair pairToInsert = new Pair(price, index);
        stk.push(pairToInsert); // For upcoming elements
        return ans;
    }
}

/**
TC: O(2N) -> O(N)
SC: O(N)
*/

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */