package RecursionAndBackTracking;

public class phoneKeypad {

    public static void combHelper(String s,int index, String res){
        String[] alpha={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(index==s.length()){
            System.out.println(res);
            return;
        }
        int a=s.charAt(index)-'0';
        String a1=alpha[a];
        for(int i=0;i<a1.length();i++){
            res+=a1.charAt(i);
            combHelper(s, index+1, res);
            res=res.substring(0, res.length()-1);
        }
        

    }
    public static void combinations(String s){
        if(s.length()==0){
            System.out.println("GIVEN NUMBER COMBINATION SHOULD NOT BE EMPTY");
        }
        else{
            combHelper(s,0,"");
        }
    }
    public static void main(String a[]){
        String s="23";
        combinations(s);
    }
}
