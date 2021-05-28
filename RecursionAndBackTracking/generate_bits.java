package RecursionAndBackTracking;
import java.util.Scanner;
public class generate_bits {
public static void findBits(int n,String s){
    if(s.length()==n){
        System.out.println(s);
        return;
    }
    
        findBits(n,s+0);
        findBits(n,s+1);


}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of bits");
        int a=sc.nextInt();
        sc.close();
        findBits(a ,"");

    }
}
