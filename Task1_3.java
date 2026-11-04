import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сегодня воскресенье? (да/нет): ");
        boolean isSunday = scanner.next().equalsIgnoreCase("да");

        System.out.print("Какая погода? (ясно/облачно/дождь/снег/град): ");
        String weather = scanner.next();

        System.out.print("Температура? (жарко/тепло/холодно): ");
        String temp = scanner.next();

        System.out.print("Ветер? (есть/нет): ");
        String wind = scanner.next();

        System.out.print("Влажность? (высокая/низкая): ");
        String humidity = scanner.next();

        if (isSunday && 
            (weather.equalsIgnoreCase("ясно") || weather.equalsIgnoreCase("облачно")) && 
            (temp.equalsIgnoreCase("тепло") || temp.equalsIgnoreCase("жарко")) && 
            wind.equalsIgnoreCase("нет") && 
            humidity.equalsIgnoreCase("низкая")) {
            System.out.println("Результат: Да!");
        } else {
            System.out.println("Результат: Нет.");
        }
        
        scanner.close();
    }
}
