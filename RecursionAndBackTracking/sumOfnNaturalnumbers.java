package RecursionAndBackTracking;
class sumOfnNaturalnumbers{
    public static void main(String a[])
    {
     System.out.println(sum(5,0));   
       
    }
    static int sum(int n,int total)
    {
           if(n==0)
           {
               return total;
           }
           else{
               
               return sum(n-1,total+=n);
           }
       } 
    }