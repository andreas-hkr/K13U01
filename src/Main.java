public class Main {
    public static void main(String[] args) {
        // - Skapa en klass Book som kan lagra titel, författare, sidantal och pris
        // - Skapa två objekt:
        //     Java - Steg för steg, Jan Skansholm, 483 sidor, 400kr
        //     Starting out with Python, Tony Gaddis, 896 sidor, 800kr

        Book book1 = new Book();
        book1.title = "Java - Steg för steg";
        book1.author = "Jan Skansholm";
        book1.pages = 483;
        book1.price = 400;

        Book book2 = new Book();
        book2.title = "Starting out with Python";
        book2.author = "Tony Gaddis";
        book2.pages = 896;
        book2.price = 800;

        System.out.format("%s, %s, %d sidor, %.2f kr%n", book1.title, book1.author, book1.pages, book1.price);
        System.out.format("%s, %s, %d sidor, %.2f kr%n", book2.title, book2.author, book2.pages, book2.price);
    }
}

class Book {
    String title;
    String author;
    int pages;
    double price;
}