public class strongnumber {

    public static void main(String args[]){
        int n=145;

        int sum=0;
        int number=145;
        while(n!=0){
           int a= n%10;
           sum=sum+factor(a);
           n=n/10;
        }
        if(number==sum){
            System.out.println("strone number");
        }
    }
    static int factor(int n){

        int fact=1;
        while(n!=0){
            fact=fact*n;
            n=n-1;
        }
        return fact;
    }
    
}
