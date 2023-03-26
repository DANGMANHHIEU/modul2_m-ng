import java.util.Scanner;

public class exstudent {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter student:");
            size = sc.nextInt();
            if(size>30){
                System.out.println("Nhập lại số sinh viên!!!");
            }
        }while (size>30);
        double[] student = new double[size];
        System.out.println("Nhập điểm sinh viên:");
        for (int i=0; i<student.length;i++){
            System.out.println("điểm sinh viên thứ "+(i+1)+":");
            student[i] = sc.nextDouble();
        }
        int count =0;
        for(int i =0; i<student.length;i++){
            if(student[i]>5 && student[i]<=10){
                count++;
            }
        }
        System.out.println("Số sinh viên qua môn là: "+ count);
    }
}
