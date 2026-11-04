import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pyramid height: ");
        int height = scanner.nextInt();
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) System.out.print(" "); 
            for (int j = 0; j <= i; j++) System.out.print("#");             
            System.out.print("  ");                                         
            for (int j = 0; j <= i; j++) System.out.print("#");             
            System.out.println();
        }
        scanner.close();
    }
}
