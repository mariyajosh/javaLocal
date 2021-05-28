package RecursionAndBackTracking;
import java.util.*;
public class palindrom {
    static boolean ispalindrom(String s,int low ,int high)
    {
        if(s.charAt(low)!=s.charAt(high))
        {
            return false;
        }
        if(low==high || low>high)
        {
            return true;
        }
        else{
            
return ispalindrom(s, low+1, high-1);
            }
            
        }
        public static void main(String a[])
        {
Scanner scan=new Scanner(System.in);
String str=scan.next();

           System.out.println(ispalindrom(str, 0,str.length()-1));
            scan.close();
        }
    }

