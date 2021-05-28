package RecursionAndBackTracking;
public class sudoko {
    public static boolean isSafe(int[][] grid,int r,int c,int num){
        for(int i=0;i<grid.length;i++){
            if(grid[r][i]==num || grid[i][c]==num){
                return false;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[r-(r%3)+i][c-(c%3)+j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    
       
    
    public static boolean solveSudoko(int[][]grid){
        int r=-1;int c=-1;
        boolean flag=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==0){
                    flag=true;
                    r=i;
                    c=j;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if (!flag)
        {
            return true;
        }
        for(int i=1;i<=9;i++){
            if(isSafe(grid,r,c,i)){
                grid[r][c]=i;
               if(solveSudoko(grid)){
                   return true;
               }
               else{
                grid[r][c]=0;
               }
            }
        
        }
return false;
    }
   public static void main(String args[]){
    int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
    {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
    {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
    {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
    {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
    {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
    {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
    {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
    {0, 0, 5, 2, 0, 6, 3, 0, 0 } };
    int n=grid.length;
    if(solveSudoko(grid)==false){
        System.out.println("No solution exists");
    }
    else{
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
   } 
}
