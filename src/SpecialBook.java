public class SpecialBook extends Book {
    String genre;
    public SpecialBook(String title, String author, int year, String isbn, String genre) {
        super(title, author, year, isbn);
        this.genre=genre;
    }

    @Override
    public void displayInfo() {
        String status = getAvailable() ? "Доступна" : "Выдана";
        System.out.println(getTitle() + ", " + getAuthor() + ", " + getyear() +
                ", ISBN: " + getIsbn() + ", Жанр: " + genre + " (" + status + ")");
    }

}
