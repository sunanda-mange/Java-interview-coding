public class Leap {
    public static void main(String args[]){
        int n = 2014;

        if(n%4==0){
            System.out.println("leap");
        }else if (n%400 ==0 && n%100 != 0){
            System.out.println("leap");
        }else{
            System.out.println("not leap year");
        }
    }
}
