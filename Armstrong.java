public class Armstrong {
    public static void main(String args[]){
        int n=371;
        int temp=n;
        int number =0;
        while(temp!=0){
            int a=n%10;
            number =number+a*a*a;
            temp =temp/10;

        }
        if ( number ==n){
            System.out.println("armstrong number");
        }else{
            System.out.println("not");
        }
    }
    
}
