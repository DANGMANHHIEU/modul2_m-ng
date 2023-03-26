import java.util.Arrays;
import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[5];
        arr[2] = new int[5];

        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập phần tử cho mảng:");
        for ( int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        // tính tổng của 1 cột

        for(int i =0 ; i<arr[0].length; i++){
            int total =0;
            for(int j=0; j<arr.length;j++){
                total+= arr[j][i];
            }
            System.out.println("tổng của cột "+ i +": "+total);
        }
    }
}