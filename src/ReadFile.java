import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        /*String fileName = "text.txt";
        if (Files.exists(Paths.get("text.txt"))) {
            try {
                List<String> lines = Files.readAllLines(Paths.get(fileName));
                System.out.println("Содержимое файла:");
                lines.forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("Ошибка чтения: " + e.getMessage());
            }
        } else {
            System.out.println("Файл не найден");
        }*/

        String fileName = "test.txt";

        try {
            // Чтение URL из файла
            String url = Files.readString(Paths.get(fileName)).trim();

            // Проверка и открытие в браузере
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new java.net.URI(url));
                    System.out.println("Открываю: " + url);
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}
