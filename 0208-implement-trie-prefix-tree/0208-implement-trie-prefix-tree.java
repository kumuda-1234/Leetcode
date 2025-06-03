class Trie {
    // Define the Node class, the building block of the Trie. \U0001f9f1
    private class Node {
        Node[] children = new Node[26]; // Array to store children nodes (a-z). \U0001f476
        boolean isEndOfWord = false; // Flag to mark if this node is the end of a word. \U0001f6a9

        // Getter method for isEndOfWord
        public boolean isEndOfWord() {
            return isEndOfWord;
        }

        // Setter method for isEndOfWord
        public void setEndOfWord(boolean endOfWord) {
            this.isEndOfWord = endOfWord;
        }
    }

    private final Node root; // The root node of the Trie. \U0001f333

    // Constructor to initialize the Trie. \U0001f3d7️
    public Trie() {
        root = new Node(); // Create a new root node.
    }

    // Method to insert a word into the Trie. ✍️
    public void insert(String word) {
        Node current = root; // Start from the root node. \U0001f4cd
        for (int i = 0; i < word.length(); i++) { // Iterate through each character of the word. \U0001f6b6
            char ch = word.charAt(i); // Get the character at the current index.
            int index = ch - 'a'; // Calculate the index (0-25) for the character (a-z). \U0001f9ee

            // If there's no node for this character, create one. \U0001f195
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index]; // Move to the next node. ➡️
        }
        current.setEndOfWord(true); // Mark the last node as the end of the word. ✅
    }

    // Method to search for a word in the Trie. \U0001f50d
    public boolean search(String word) {
        Node current = root; // Start from the root node. \U0001f4cd
        for (int i = 0; i < word.length(); i++) { // Iterate through each character of the word. \U0001f6b6
            char ch = word.charAt(i); // Get the character at the current index.
            int index = ch - 'a'; // Calculate the index (0-25) for the character (a-z). \U0001f9ee

            // If there's no node for this character, the word doesn't exist. ❌
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index]; // Move to the next node. ➡️
        }
        return current != null && current.isEndOfWord(); // Check if the last node is the end of a word. \U0001f575️
    }

    // Method to check if any word starts with a given prefix in the Trie. ⭐️
    public boolean startsWith(String prefix) {
        Node current = root; // Start from the root node. \U0001f4cd
        for (int i = 0; i < prefix.length(); i++) { // Iterate through each character of the prefix. \U0001f6b6
            char ch = prefix.charAt(i); // Get the character at the current index.
            int index = ch - 'a'; // Calculate the index (0-25) for the character (a-z). \U0001f9ee

            // If there's no node for this character, no word starts with this prefix. ❌
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index]; // Move to the next node. ➡️
        }
        return current != null; // If we reach the end of the prefix, it exists. \U0001f389
    }
}