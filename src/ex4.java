import java.util.Scanner;

public class ex4 {
    public static double fToc(double Fahrenheit){
        double Celsius = (5.0/9)*(Fahrenheit-32);
        return Celsius;
    }
    public static double cTof(double Celsius){
        double Fahrenheit = Celsius/(5.0/9)+32;
        return Fahrenheit;
    }
    public static void main(String[] args) {
        double Celsius;
        double Fahrenheit;
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0.Exit");
            System.out.println("Enter n:");
            n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    Fahrenheit = sc.nextDouble();
                    System.out.println("Celsius: "+fToc(Fahrenheit) );
                    break;
                case 2:
                    System.out.println("Enter Celsius:");
                    Celsius = sc.nextDouble();
                    System.out.println("Fahrenheit: " + cTof(Celsius));
                    break;
                case 0:
                    System.out.println("Exit");
            }
        }while (n!=0);
    }
}
