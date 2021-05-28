package RecursionAndBackTracking;

public class rat {
    static boolean helper(int[][]path,boolean[][] visited,int r,int c,int i,int j,String s){
       // String p=s;
        if(i<0||j<0||i>=r||j>=c||visited[i][j]==true||path[i][j]==0){
           
            return false;
        }
       
        if(i==r-1 && j==c-1&& path[i][j]==1){
            System.out.println(s);
            return true;
        }
        visited[i][j]=true;
        
        boolean res=helper(path,visited,r,c,i-1,j,s+"U")||helper(path,visited,r,c,i+1,j,s+"D")||helper(path,visited,r,c,i,j-1,s+"L")||helper(path,visited,r,c,i,j+1,s+"R");
        visited[i][j]=false;
        
        return res;










    }
    static boolean findPath(int[][]path){
        int r=path.length;
        int c=path[0].length;
        boolean[][] visited=new boolean[r][c];
        String s="";
        return helper(path,visited,r,c,0,0,s);
    }
    public static void main(String args[]){
        int[][] path={{1,1,1,1},{0,1,0,1},{0,1,0,1},{0,1,1,1}};
        System.out.println(findPath(path));
    }
    
}
/* 1 0 0 0
   0 1 0 0
   0 1 0 0
   0 1 1 1*/