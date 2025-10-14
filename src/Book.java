public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, int year, String isbn){

        this.title=title;
        this.author=author;
        this.year=year;
        this.isbn=isbn;
        this.isAvailable=true;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Integer getyear(){
        return year;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public boolean getAvailable() {
        return isAvailable;
    }

    public void displayInfo() {
        String status = isAvailable ? "Доступна" : "Выдана";
        System.out.println(title + ", " + author + ", " + year + ", ISBN: " + isbn + " (" + status + ")");
    }

}
