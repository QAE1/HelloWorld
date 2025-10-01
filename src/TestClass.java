import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
    System.out.println("Результат вычислений "+calc(5));
    System.out.println("Результат вычислений "+calc(5));
    }

    public static int calc(int a) {
        int result = 5+a;
        return result;
    }
    /*List<String> User = new ArrayList<>();

    public void processUsers(List<User> users) {
        for (User user : users) {
            if (user == null || user.getName() == null) {
                continue; // пропускаем невалидных пользователей
            }
            // обрабатываем только валидных пользователей
            System.out.println("Обработка: " + user.getName());
        }
    }*/
}
