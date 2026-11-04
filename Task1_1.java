import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Результат: " + age + " " + getAgeString(age));
        scanner.close();
    }

    public static String getAgeString(int age) {
        int lastDigit = age % 10;
        int lastTwoDigits = age % 100;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) return "лет";
        if (lastDigit == 1) return "год";
        if (lastDigit >= 2 && lastDigit <= 4) return "года";
        return "лет";
    }
}
