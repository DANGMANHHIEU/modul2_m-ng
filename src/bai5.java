import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Nhập size:");
            size = sc.nextInt();
            if(size >10){
                System.out.println("chiều dài nhỏ hơn 10!!!");
            }
        }while (size >10);
        arr = new int[size];
        for (int i =0; i<arr.length;i++){
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất là: "+ min);

    }
}
