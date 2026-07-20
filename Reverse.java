public enum Reverse {

    public static void main(String args[]){
     int n =123;
     int reverse=0;
     while(n!=0){
        int a=n%10;
        reverse = reverse *10 + a;
        n=n/10;
     }
    }
}
    

