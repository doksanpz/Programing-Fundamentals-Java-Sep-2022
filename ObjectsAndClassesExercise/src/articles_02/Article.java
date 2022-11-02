package articles_02;

public class Article {
    //полета -> характеристики
    private String title;
    private String content;
    private String author;

    //конструктор -> създава ноши обекти

    public Article (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //методи -> пошедение
    public void edit (String newContent) {
        this.content = newContent;
    }
    public  void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }
    public  void rename (String newTitle) {
        this.title = newTitle;
    }
    //пренаписваме метода toString
    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
