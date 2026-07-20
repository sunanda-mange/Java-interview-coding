public class Fibonaciseries {
    public static void main(String args[]){

        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
     for (int i=2; i<15; i++){
         c=a+b;
         a=b;
         b=c;
         System.out.println(c);
      
         }
      
    }
}