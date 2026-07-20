public class Palindrome {
    public static void main(String args[]){
        int temp =102201;
        int n=temp;
        int reverse=0;

        while(n!=0){
            int a=n%10;
            reverse = reverse*10+a;
            n=n/10;
        }
        if (reverse == temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("not ");
        }
        
    }
}
