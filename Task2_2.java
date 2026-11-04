import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();
        
        double x = num / 2; 
        double epsilon = 0.000001;
        
        while (Math.abs(x * x - num) > epsilon) {
            x = 0.5 * (x + num / x); 
        }
        
        System.out.printf("Корень из %.0f равен %.4f\n", num, x);
        scanner.close();
    }
}
