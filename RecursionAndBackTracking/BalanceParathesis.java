package RecursionAndBackTracking;

public class BalanceParathesis {
    public static void balanceHelper(int n,int open,int close,String s){
if(n==open && n==close){
    System.out.println(s);
return;
}
if(open<0||close<0||open>n||close>n||close>open){
    return ;
}
balanceHelper(n, open+1, close, s+"(");
balanceHelper(n, open, close+1, s+")");
    }
    public static void balance(int n){
if(n==0){
    System.out.println("N should be gtreater than 0");
}
else{
    balanceHelper(n,0,0,"");
}
    }
    public static void main(String args[]){
        int n=2;
        balance(n);
    }
}
