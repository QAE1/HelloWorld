public class User {
    private String name;
    private int age;

    /**
     * Создает пользователя с валидацией:
     * - name не должен быть null или пустым
     * - age должен быть в диапазоне 0-150
     * При нарушении условий бросать IllegalArgumentException
     */
    public User(String name, int age) {
        if(name=="" || name==null){
            throw new IllegalArgumentException ();
        }
        else if(age>150||age<0){
            throw new IllegalArgumentException ();
        }
        else{
            this.name = name;
            this.age = age;
        }

    }

    // Геттеры
    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {
        // Протестируйте валидацию:
        //User user1 = new User("Alice", 25);  // OK
        //User user2 = new User("", 25);       // IllegalArgumentException
        //User user3 = new User(null, 25);     // IllegalArgumentException
        User user4 = new User("Bob", -5);    // IllegalArgumentException
        User user5 = new User("Bob", 200);   // IllegalArgumentException
    }
}