import java.util.ArrayList;
import java.util.List;

public class Student {
    public static int id;
    public static String name;
    public List<Double> grades;

    public Student(int id, String name) {
        this.id = id;        // правильно!
        this.name = name;    // правильно!
        this.grades = new ArrayList<>(); // инициализируй список!
    }

    public void addGrade(double grade){
    grades.add(grade);
    }

    public double getAverageGrade(){
        double averageDouble = grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(averageDouble);
        return averageDouble;
    }

    public int getId() {
        return id;
    }
}
