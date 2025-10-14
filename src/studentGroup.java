import java.util.ArrayList;
import java.util.List;

public class studentGroup {
   List<Student> Students =  new ArrayList<>();

    public void addStudent(Student st){
        Students.add(st);
    }

    public Student getStudentById(int id) {
        for (Student stud : Students) {
            // Обращаемся к полю через геттер
            if (stud.getId() == id) {
                return stud;
            }
        }
        return null; // если не найден
    }
}
