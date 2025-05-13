class Solution {
    public String decodeString(String s) {
        final var sb = new StringBuilder();
        var i = 0;
        while (i < s.length()) {
            final char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
                i++;
                continue;
            }
            
            var j = i;
            while (j < s.length() && Character.isDigit(s.charAt(j))) {
                j++; 
            }
            final var reps = Integer.parseInt(s.substring(i, j));

            j++;
            var k = j;
            var open = 1;
            while (open > 0) {
                if (s.charAt(k) == '[') {
                    open++;
                } else if (s.charAt(k) == ']') {
                    open--;
                }
                k++;
            }

            final var decoded = decodeString(s.substring(j, k - 1));
            for (int rep = 0; rep < reps; rep++) {
                sb.append(decoded);
            }
            i = k;
        }

        return sb.toString();
    }
}