import javax.sound.sampled.Line;
import java.util.*;
import java.util.*;
public class Logitech {

    public static void main(String[] args) {
        /*List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("white");
        colors.add("yellow");

        System.out.println(colors);
        colors.remove(2);
        colors.set(0,"Желтый");
        System.out.println(colors.size());



        List <Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(16);
        numbers.add(23);
        numbers.add(42);

        System.out.println(numbers.contains(16));
        System.out.println(numbers.indexOf(23));

        boolean num=numbers.contains(10);
        if (num==true){
            System.out.println("Найдено");
        }
        else {
            System.out.println("Не найдено");
        }

        List <Integer> numint = new ArrayList<>();
        for (int i=1; i<=10;i++){
            numint.add(i);
        }
        System.out.println(numint);*/

        /*List<String> fructs = new ArrayList<>();
        fructs.add("Яблоко");
        fructs.add("Банан");
        fructs.add("Апельсин");
        fructs.add("Киви");
        fructs.add("Гранат");
        fructs.add("Абрикос");

        String searchItem = "А";
        List<String> results = new ArrayList<>();

        Iterator<String> iterator = fructs.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.startsWith(searchItem)) {
                results.add(item);  // Добавляем в результаты
                iterator.remove();  // Безопасно удаляем из исходного списка
            }
        }

        System.out.println("Найденные: " + results);        // [Апельсин, Абрикос]
        System.out.println("Оставшиеся: " + fructs);*/



        /*List <Integer> numbers = new ArrayList<>();
        numbers.add(105);
        numbers.add(42);
        numbers.add(13);
        numbers.add(88);
        numbers.add(5);*/

        //int [] arr=new int[10];

       /* Set<Integer> fructs = new LinkedHashSet<>();
        fructs.add(100000);
        fructs.add(150);
        fructs.add(500);

        System.out.println(fructs);*/

        /*Set<String> fructs = new TreeSet<>();

        fructs.add("Persik");
        fructs.add("Yabloko");
        fructs.add("Banana");

        System.out.println(fructs);*/




        /*Map<Integer, String> books = new HashMap<>();
        books.put(85585,"Война и Мир");
        books.put(45896,"Онегин");
        books.put(24569,"Руслан и Людмила");

        System.out.println(books);
        String namebook = books.get(85585);
        System.out.println(namebook);
        boolean hasBook=books.containsKey(85585) && books.containsValue("Война и Мир");
        books.remove(45896, "Онегин");

        String popularBook = books.get(Collections.max(books.keySet()));


        for (Map.Entry<Integer, String> entry : books.entrySet()) {
            Integer isbn = entry.getKey();     // получаем ключ
            String title = entry.getValue();   // получаем значение
            System.out.println("ISBN: " + isbn + ", Книга: " + title);
        }*/

        /*StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        String result = sb.toString();
        System.out.println(result);*/


        calculate calculate = new calculate();
        /*try {
            calculate.calc(1,0,'%');
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        calculate.isEven(9);

        int [] arr= {1,2,3,4,5,100,7,8,9,10};


        calculate.findMax(arr);

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(2);
        listOfNumbers.add(1);

        calculate.removeDuplicates(listOfNumbers);*/

        /*Map<String,Integer> words = new HashMap<String, Integer>();
        calculate.countWords("Hello world hello");

        List<Integer> listofnumbers1 = new ArrayList<Integer>();
        List<Integer> listofnumbers2 = new ArrayList<Integer>();
        listofnumbers1.add(1);
        listofnumbers1.add(2);
        listofnumbers1.add(3);
        listofnumbers1.add(4);

        listofnumbers2.add(3);
        listofnumbers2.add(4);
        listofnumbers2.add(5);
        listofnumbers2.add(6);
        calculate.findCommonElements(listofnumbers1, listofnumbers2);*/

        //Валидация пароля
        /*calculate.validatePassword("          1");*/

       /* Student student = new Student (1,"Иван");
        student.addGrade(4.0);
        student.addGrade(4.8);

        Student student2 = new Student (2,"Сеня");
        student.addGrade(4.5);
        student.addGrade(4.3);

        student.getAverageGrade();

        studentGroup st = new studentGroup();
        st.addStudent(student);
        st.addStudent(student2);
        st.getStudentById(1);*/


        Book book = new Book("Мастер и Маргарита","Михаил Булгаков",1966,"123-456");
        book.displayInfo();
        Reader reader = new Reader("Ткачёв Артур", 15);

        reader.borrowBook(book);
        reader.returnBook(book);
        reader.displayBorrowedBooks();

        SpecialBook specialBook = new SpecialBook("Мастер и Маргарита","Михаил Булгаков",1966,"123-456", "Пиздатый жанр");
        specialBook.displayInfo();
    }





}
