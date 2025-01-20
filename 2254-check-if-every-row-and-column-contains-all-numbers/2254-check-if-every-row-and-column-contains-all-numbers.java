class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int[] rowCount = new int[n + 1];
            int[] colCount = new int[n + 1];

            for (int j = 0; j < n; j++) {
                int rowVal = matrix[i][j];
                int colVal = matrix[j][i];

                if (rowVal < 1 || rowVal > n || rowCount[rowVal] > 0) return false;
                if (colVal < 1 || colVal > n || colCount[colVal] > 0) return false;

                rowCount[rowVal]++;
                colCount[colVal]++;
            }
        }

        return true;
    }
}