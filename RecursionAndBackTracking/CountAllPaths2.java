package RecursionAndBackTracking;

public class CountAllPaths2 {
    static int findPaths(int mat[][],boolean[][] visited,int i ,int j,int m,int n){
       if(i>=m&&j>=n){
           return 1;
       }
       if(i<0||j<0||i>m||j>n||mat[i][j]==-1||visited[i][j]==true){
           return 0;
       }
       visited[i][j]=true;
     int res=findPaths(mat, visited, i-1, j, m, n)+findPaths(mat, visited, i+1, j, m, n)+findPaths(mat, visited, i, j-1, m, n)+findPaths(mat, visited, i, j+1, m, n);
   visited[i][j]=false;
   return res;
   
    }
    public static void main(String args[]){
        int m=4;
        int n=5;
      int mat[][]={{0,0,-1,0,0},{-1,0,0,-1,-1},{0,-1,0,-1,-1},{-1,-1,0,0,0}};
      boolean[][] visited=new boolean[m][n];
System.out.println(findPaths(mat,visited,0,0,m-1,n-1));
    }
}
