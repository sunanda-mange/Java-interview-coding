import java.util.*;
public class positive {
    public static void main(String args[]){
        System.out.println("Enter number");
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        
        if(n>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
   
}