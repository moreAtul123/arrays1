import java.util.*;
public class arraybasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int i;
        Scanner sc = new Scanner (System.in);
        System.out.println("entr array item");
        for (i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }System.out.println("enter ur activity");
         for (i=0;i<arr.length;i++){
            System.out.println("iufdhj");
            for (int j : arr){
                System.out.println(j);
            }
        }

    }
}
