package RecursionAndBackTracking;
public class Nqueen {
public static boolean isSafe(boolean[][] board,int r,int c,int n){
    for(int i=c;i>=0;i--){
        if(board[r][i]==true){
            return false;
        }

    }
    for( int j=r,k=c;j>=0&&k>=0;j--,k--){
        if(board[j][k]==true){
            return false;
        }
    }
    for( int j=r,k=c;j<n&&k>=0;j++,k--){
        if(board[j][k]==true){
            return false;
        }
    }
    return true;
}
    public static boolean nqueenHelp(boolean[][] board,int c,int n){
        if(c>=n){
            return true;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,i,c,n)){
                board[i][c]=true;
                if(nqueenHelp(board, c+1, n)){
                    return true;
                }
              board[i][c]=false;
           }
        }
        return false;
    } 
public static boolean nqueen( boolean[][] board,int n){
    int c=0;
     if(n<=3){
    System.out.println("Not possible");
    }
    else{ 
        boolean res=nqueenHelp(board,c,n); 
    return res;
    }
    return true;
}
    public static void main(String args[]){
      //  Scanner sc=new Scanner(System.in);
        int n=3;
        boolean[][] board=new boolean[n][n];
        if(!nqueen(board,n)){
System.out.println("false");
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==true){
                        System.out.println("queen"+(j+1)+" "+(i+1)+" "+(j+1));
                    }
                   
                }
            }
        }
        
    }
}
