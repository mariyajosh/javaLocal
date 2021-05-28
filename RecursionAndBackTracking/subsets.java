package RecursionAndBackTracking;
import java.util.*;
public class subsets {
    static void print_subsets(String s,String curr,int i)
    {
if(i==s.length())
{
    System.out.println(curr);
    return;
}
else{
    print_subsets(s,curr,i+1);
    print_subsets(s,curr+s.charAt(i),i+1);
}
    }
    public static void main(String a[])
    {
Scanner sc=new Scanner(System.in);
String str=sc.next();
        print_subsets(str,"",0);
        sc.close();
    }
}
