package RecursionAndBackTracking;

public class stringPermutations {
    public static String Swap(String s,int i,int l){
        char[] c=s.toCharArray();
         char temp=c[i];
         c[i]=c[l];
         c[l]=temp;
         return String.valueOf(c);
    }
    public static void generateHelper(String s,int start,int end){
     if(start>=end){
         System.out.println(s);
         return;
     }
     for(int i=start;i<=end;i++){
         s=Swap(s,i,start);
         generateHelper(s, start+1, end);
         //s=Swap(s,i,start);
     }
}
    
    public static void generate(String s){
        generateHelper(s,0,2);
    }
    public static void main(String a[]){
        String s="ABC";
        generate(s);
    }
}
