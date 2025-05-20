class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[] vis = new int[n];
        vis[0] = 1;
        for(int i=0;i<n;i++){
            if(vis[i] == 1){
                dfs(rooms,i,vis);
            }else{

                return false;
            }
        }
        
        return true;

    }

    public void dfs(List<List<Integer>> rooms,int src,int[] vis)
    {
        vis[src] = 1;
        for(int ele : rooms.get(src))
        {
            if(vis[ele] == 0){
                  dfs(rooms,ele,vis);
            }
        }
    }
}