class Solution {
    //arrays.fill works only for 1D arrays
    private boolean isSafe(int row,int col,char[][] cboard,int n)
    {
        int i;
        int j;
        
       //horizontakl check
        for(i=0;i<n;i++)
        {
            if(cboard[row][i]=='Q')
            return false;
        }
        //vertical check
        for(j=0;j<n;j++)
        {
          if(cboard[j][col]=='Q')
          return false;
        }
        //left diagonal
        for(i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
          if (cboard[i][j] == 'Q')
           return false;
        }
        //right diagonal
        for(i=row-1,j=col+1;i>=0&&j<n;i--,j++)
        {
          if (cboard[i][j] == 'Q')
           return false;
        }
     return true;
    }
    private void backtracking(int row,int n,char[][] cboard,List<List<String>> res )
    {
      //store the crt combinations in the res.

      if (row == n)
      {

            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++)
            {
                solution.add(new String(cboard[i]));
            }
            res.add(solution);
            return;
        }


      //placing the queens on board
      for(int col=0;col<n;col++)
      {
        if(isSafe(row,col,cboard,n))
        {
            cboard[row][col]='Q';
            backtracking(row+1,n,cboard,res);
            cboard[row][col]='.';
        }
      }
    }
    public List<List<String>> solveNQueens(int n) 
    {
        List<List<String>> res=new ArrayList<>();
        char[][] cboard=new char[n][n];
        for(char[] c:cboard)
        {
        Arrays.fill(c,'.');
        }
        backtracking(0,n,cboard,res);
        return res;
    }
}