package Array_problem;

public class smallest_Array {
    public static void main(String[] args) {
        
        int arr[] = new int[6];
        arr[0]=10;
        arr[1]=2;
        arr[2]=4;
        arr[3]=44;
        arr[4]=22;
        arr[5]=31;

        int min = arr[0];

        for(int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];         
               }
        }
     System.err.println(min);
        }

    

}
