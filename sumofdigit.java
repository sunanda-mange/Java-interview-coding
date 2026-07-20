public class sumofdigit {
    public static void main(String args[]){
        int a=115;

        int sum=0;

        while(a!=0){
            int n =a%10;
            sum= sum+n;
             a=a/10;
        }
    }
}
