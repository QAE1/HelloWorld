import java.util.*;

public class calculate {

    //Функция для мини калькулятора
    public int calc(int num1, int num2, char  op ){
    int result = 0;
            switch (op){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '/':
                    if (num2==0){
                       throw new IllegalArgumentException("Деление на ноль невозможно");
                    }
                    else {
                        result=num1/num2;
                        break;
                    }
                case '*':
                    result=num1*num2;
                    break;
                default:
                    throw new IllegalArgumentException("Введен не верный арифметический оператор");
            }
        System.out.println("Результат вычислений = " + result);

        return result;
    }

    //Поиск четного числа
    public boolean isEven(int num){
        boolean result_even=false;
        if(num%2==0){
            result_even=true;
        }
        else{
            result_even=false;
        }
        System.out.println(result_even);
        return result_even;
    }

    //Поиск максимального значения в массиве
    public int findMax(int [] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int max=array[0];
        for (int i=0; i<array.length; i++){
        int value =array[i];
        if (value>max){
            max=value;
        }
        }
        System.out.println(max);
        return max;
    }

    //Нахождение уникальных элементов, + формирование итогового листа
    public List<Integer> removeDuplicates(List <Integer> numbers){

        TreeSet<Integer> treeSet = new TreeSet<>(numbers);
        List<Integer> results = new ArrayList<>(treeSet);
        System.out.println(results);
        return results;
    }
    //Подсчет слов
    public Map<String, Integer> countWords(String text){

        Map<String, Integer> results=new HashMap<String, Integer>();
        String texts = text.toLowerCase();
        String[] words = texts.split(" ");
        for (String word:words){
            Integer count = results.get(word);
            if (count == null) {
                // Слово встречается ВПЕРВЫЕ - добавляем со счетчиком 1
                results.put(word, 1);
            } else {
                // Слово УЖЕ БЫЛО - увеличиваем счетчик на 1
                results.put(word, count + 1);
            }
        }
        System.out.println(results);
        return results;
    }

    public List<Integer> findCommonElements(List<Integer> num1, List<Integer> num2){
        List<Integer> results = new ArrayList <Integer>();
        for (int number1:num1){
            for (int number2:num2){
                if (number1 == number2){
                    results.add(number1);
                }
            }
        }
        System.out.println(results);
        return results;
    }

    public void validatePassword(String password){
        if(password==null||password.length()<8){
            throw new IllegalArgumentException("Пароль должен быть не пустым, и не менее 8-ми символов");
        }
        boolean hasDigit = password.chars().anyMatch(Character::isDigit);
        if (!hasDigit) {
            throw new IllegalArgumentException("Пароль должен содержать хотя бы одну цифру");
        }
    }


}