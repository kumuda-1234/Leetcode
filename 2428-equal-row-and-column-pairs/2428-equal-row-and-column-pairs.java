class Solution {
    public int equalPairs(int[][] grid) {
        int l=grid.length;
        HashMap<String,Integer> m = new HashMap<>();
        for(int i=0;i<l;i++){
            StringBuffer sb= new StringBuffer();
            for(int j=0;j<l;j++){
                sb.append(grid[i][j]);
                sb.append(",");
            }
            m.put(sb.toString(),m.getOrDefault(sb.toString(),0)+1);
        }
        int c=0;
        for(int i=0;i<l;i++){
            StringBuffer sb= new StringBuffer();
            for(int j=0;j<l;j++){
                sb.append(grid[j][i]);
                sb.append(",");
            }
            c+=m.getOrDefault(sb.toString(),0);
        }
        return c;
    }
}