import java.util.Scanner;

public class NumberParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input;

        while (true) {
            System.out.print("Введите целое число: ");
            input = scanner.nextLine();

            try {
                Integer.parseInt(input);
                System.out.println("Вы ввели корректно число!");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите корректное число.");
            }
        }
    }
}
