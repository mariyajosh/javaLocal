package RecursionAndBackTracking;

public class CountAllPaths {
public static int countPaths(int[][]mat,int dr,int dc){
    for(int i=0;i<=dr;i++){
        mat[i][0]=1;
    }
    for(int i=0;i<=dc;i++){
        mat[0][i]=1;
    }
    for(int i=1;i<=dr;i++){
        for(int j=1;j<=dc;j++){
            mat[i][j]=mat[i-1][j]+mat[i][j-1];
        }
    }
    return mat[dr][dc];
}
    public static void main(String a[]){
        int[][] mat=new int[5][4];
        int dr=4;
        int dc=3;
        System.out.println(countPaths(mat,dr,dc));
    }
}
