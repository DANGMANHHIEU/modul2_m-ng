import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size");
            size = sc.nextInt();
            if(size >20){
                System.out.println("size max 20");
            }
        }while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("phần tử thứ " + (i+1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("arr");
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int index= 0;
        for(int j =0;j<arr.length;j++){
            if(arr[j]>max){
                max = arr[j];
                index= j+1;
            }
        }
        System.out.println("phần tử max: "+ max +"\n"+ "STT: "+index);
    }
}
