package Task3;

public class Book {
    public static void main(String[] args) {

        Author author1 = new Author();
        Title title1 = new Title();
        Content index1 = new Content();

        author1.setAuthor("Tolstoy");
        title1.setTitle("War and Peace");
        index1.setContent("Content");

    author1.show();
    title1.show();
    index1.show();
    }
}
