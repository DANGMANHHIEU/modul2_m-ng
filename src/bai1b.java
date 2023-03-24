import java.util.Arrays;
import java.util.Scanner;

public class bai1b {
    public static int[] check(int[] arr,int n){
        int[] array= new int[arr.length];
        for(int i =0,j =0; i<arr.length;i++){
            if(arr[i] != n){
                array[j]= arr[i];
                j++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,6,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr = check(array,n);
        System.out.println("arr: "+ Arrays.toString(arr));
    }
}
