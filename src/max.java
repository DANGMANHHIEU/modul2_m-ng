import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0]= new int[3];
        arr[1]=new int[3];
        arr[2]=new int[3];
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập phần tử cho mảng:");
        for(int i =0; i<arr.length;i++){
            for(int j =0; j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int max = arr[0][0];
        int a=0 ,b =0;
        for(int i =0 ; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                    a =i;
                    b=j;
                }
            }
        }
        System.out.println("phần tử lớn nhất là: "+ max +"\n"+"ở vị trí: "+ a+b);
    }
}
