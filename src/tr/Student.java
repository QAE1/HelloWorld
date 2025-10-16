package tr;

public class Student {
    private String name;
    private int age;

    // КОНСТРУКТОР
    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
        System.out.println("Создан студент: " + studentName);
    }

    // МЕТОД
    public String introduce(String nam) {
        return nam+"Test";
    }

    // Другой МЕТОД
    public void haveBirthday() {
        age++;
        System.out.println(name + " отмечает день рождения! Теперь ему " + age + " лет.");
    }
}
