public class harshed {
 
    public static void main(String args[]){
        int a=115;
        int number=a;
        int sum=0;

        while(number!=0){
            int n =number%10;
            sum= sum+n;
             number=number/10;
        }
        if(a%sum==0){
            System.out.println("harshef numebr"+a);
        }
    }


}
