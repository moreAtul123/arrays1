import java.util.*;

public class arrayWithIdenticalMatrix {
    public static void main(String[] args) {
       int [] [] arr= new int [3] [3];
        int i,j;
        Scanner sc = new Scanner (System.in);
        boolean isIdentity = true;
        System.out.print("enter number in arr" );
       for (i=0;i<3;i++){for (j=0;j<3;j++){
        arr[i][j]=sc.nextInt();
       } System.out.println(" ");}
       for (i=1;i<3;i++){
            for (j=1;j<3;j++){
                if ((i==j && arr[i][j]==1) || (i!=j && arr[i][j]==0)){
                    System.out.println("true");
                }else {
                    isIdentity=false;
                    System.out.println("false"+ arr[i][j]);
                }
            }
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

    }
}
