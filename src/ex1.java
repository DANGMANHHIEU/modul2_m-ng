import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array");
        for(int i=0; i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("array");
        System.out.println(Arrays.toString(array));

// đảo ngược phần tử mảng
        int temp ;
        for(int i =0;i<array.length/2;i++){
            temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println("array");
        System.out.println(Arrays.toString(array));
    }
}
