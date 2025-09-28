import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Scanner;

//   – Напишите программу, которая запрашивает у пользователя целое число N и вычисляет сумму всех чисел от 1 до N.
public class Quiz {

    public static void main(String[] args) throws Exception {
        //int [] numbers = new int[] {1,2,3,4,5};
        //System.out.println(Arrays.toString(numbers));

        // Создаем объект Scanner для считывания данных с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        // Проверяем, является ли введенное значение целым числом
        int number=0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt(); // Считываем целое число
            System.out.println("Вы ввели число: " + number);
        } else {
            System.out.println("Ошибка: введено не целое число.");
        }
        int result=0;
        for (int i=1; i<=number; i++){
            result+=i;
        }
        System.out.println(result);

        // Закрываем сканер
        scanner.close();
    }




}
