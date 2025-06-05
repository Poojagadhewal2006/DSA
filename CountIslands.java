public class CountIslands {
    private static final int[] rowDirections = {-1,1,0,0};
    private static final int[] colDirections = {0,0,-1,1};
    public static void dfs(int[][] grid,int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j >= grid[0].length || grid[i][j] == 0)
        {
            return;
        }
        grid[i][j] =0;
        for(int direction =0;direction < 4;direction++)
        {
            int newRow = i + rowDirections[direction];
            int newCol = j + colDirections[direction];
            dfs(grid,newRow,newCol);
        }
    }
    public static int countIslands(int [][] grid)
    {
        int count = 0;
        for(int i=0;i<grid.length;i++)
        {
          for(int j=0;j< grid[0].length;j++)
          {
            if(grid[i][j] == 1)
            {
                dfs(grid,i,j);
                count++;
            }
          }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] grid = {
            {1,1,0,0,0},
            {1,1,0,0,1},
            {0,0,1,0,0},
            {0,0,0,1,1}
        };
        System.out.println("Number of islands : " + countIslands(grid));
    }
}
