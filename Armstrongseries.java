public class Armstrongseries {
    public static void main(String args[]){

     for (int n=1 ; n <=1000 ;n++){
        int number=0;
        int temp =n;

        while(temp!=0){
            int a= temp%10;
            number = number +a*a*a;
            temp=temp/10;

        }
        if (number == n){
            System.out.println(n+"armstrong");
        }
    }
    }
}
