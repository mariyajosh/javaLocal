package RecursionAndBackTracking;

public class decodeString {
    public static void decodeHelper(String s,int index,String res){
        char[] letters={' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
if(index>=s.length()){
    System.out.println(res);
    return;
}
int a=s.charAt(index)-'0';
if(a==0){
    return;
}
decodeHelper(s, index+1, res+letters[a]);

if((index+1)>=s.length()){
return;
}
int b=s.charAt(index+1)-'0';
int id2=a*10+b;
if(id2<=26){
    decodeHelper(s, index+2, res+letters[id2]);
}



    }
    public static void decode(String s){
        if(s.length()==0){
            System.out.print("Not posible");
        }
        else{
            decodeHelper(s,0,"");
        }
    }
    public static void main(String a[]){
        String s="12";
        decode(s);
    }
    
}
