import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String[] arr ={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
    boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        for (int i =0;i<arr.length;i++){
            if(arr[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + i);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("No " + name + " in the list");
        }
    }
}
