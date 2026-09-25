class Solution 
{
    private int dfs(int[][] grid, int sr, int sc)
    {
        int n = grid.length;
        int m = grid[0].length;
        if(sr < 0 || sc < 0 || sr >= n || sc >= m || grid[sr][sc] == 0)
        {
            return 1;
        }
        if(grid[sr][sc] == -1)
        {
            return 0;
        }
        grid[sr][sc] = -1;
        int perimeter = 0;
        perimeter += dfs(grid, sr, sc - 1); // left
        perimeter += dfs(grid, sr, sc + 1); // right
        perimeter += dfs(grid, sr - 1, sc); // up
        perimeter += dfs(grid, sr + 1, sc); // down
        return perimeter;
    }
    public int islandPerimeter(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        for(int r = 0; r < n; r++)
        {
            for(int c = 0; c < m; c++)
            {
                if(grid[r][c] == 1)
                {
                    return dfs(grid, r, c);
                }
            }
        }
        return 0;
    }
}