import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String fullname;
    private Integer readerId;
    private List<Book> borrowedBooks;

    public Reader(String fullname, Integer READERiD){
        this.fullname=fullname;
        this.readerId=readerId;
        this.borrowedBooks=new ArrayList<>();
    }

    String getFullname(){
        return fullname;
    }
    Integer getReaderId(){
        return readerId;
    }

    public void borrowBook(Book book){
        if (book.getAvailable()) { // используем геттер
            this.borrowedBooks.add(book);
            book.setAvailable(false); // используем сеттер
            System.out.println("Книга '" + book.getTitle() + "' успешно выдана "+fullname);
        } else {
            System.out.println("Книга '" + book.getTitle() + "' недоступна для выдачи");
        }
    }

    public void returnBook(Book book){
            if (borrowedBooks.contains(book)) {
                borrowedBooks.remove(book);
                book.setAvailable(true);
                System.out.println("Книга '" + book.getTitle() + "' возвращена");
            } else {
                System.out.println("У читателя " + fullname + " нет книги '" + book.getTitle() + "'");
            }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("У читателя " + fullname + " нет взятых книг");
            return;
        }

        System.out.println("Список книг у читателя " + fullname + ":");
        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.print((i + 1) + ". ");
            borrowedBooks.get(i).displayInfo(); // используем существующий метод
        }
    }



}
