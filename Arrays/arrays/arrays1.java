package Arrays.arrays;
import java.util.Scanner;
public class arrays1{
   
    public static void main (String []arg){
        
        int i;
        Scanner sc = new Scanner (System.in);
        int[]arr=new int [5];
        System.out.println("enter value");
        
        for (i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }int x= sc.nextInt();
            for (i=0;i<arr.length;i++){
              if(i<=arr.length){
                x=(arr[i] + i);
              System.out.println(x);
            }
        
            }
    }
}