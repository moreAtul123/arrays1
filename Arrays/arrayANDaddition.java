import java.util.*;
public class arrayANDaddition {
    public static void main(String[] args) {
        int[]arr =new int [5];
        int i,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the arrray items");
        for (i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for (i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if (i%2==0){  
            System.out.println("add "+sum);
       }}
    }
}
