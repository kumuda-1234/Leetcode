class Solution {
    //memorization 
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m + 1][n + 1];
        for(int row []:dp ){
            Arrays.fill(row,-1);
        }

        return path(m , n ,s1, s2,dp);
        
    }
    public int path(int i , int j,String s1,String s2,int dp[][]){

        if(i == 0) return j;
        if(j == 0) return i;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i-1) == s2.charAt(j-1))
        return dp[i][j] =  path(i-1, j-1 , s1, s2,dp);
         

         // Characters don't match: choose min of insert, delete, or replace
        int insert = path(i, j - 1, s1, s2, dp);
        int delete = path(i - 1, j, s1, s2, dp);
        int replace = path(i - 1, j - 1, s1, s2, dp);

        return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
    }
}