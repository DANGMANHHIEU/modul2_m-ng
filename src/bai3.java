import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử mảng arr1:");
        for(int i =0; i< arr1.length;i++){
            System.out.println("phần tử thứ "+ (i+1));
            arr1[i] = sc.nextInt();
        }
        System.out.println("mảng 1: "+ Arrays.toString(arr1));
        //mảng 2
        System.out.println("Nhập phần tử mảng arr2: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.println("phần tử thứ: "+ (i+1));
            arr2[i]=sc.nextInt();
        }
        System.out.println("mảng 2: "+Arrays.toString(arr2));
        // mảng 3
        int[] array = new int[arr1.length + arr2.length];
        for(int i =0; i< arr1.length;i++){
            array[i]=arr1[i];
        }
        for(int i = 0; i<arr2.length;i++){
            array[arr1.length+i]=arr2[i];
        }
        System.out.println("array: "+ Arrays.toString(array));
    }
}
