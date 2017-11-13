package Chapter1;

public class Books {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("Java程序设计","34.5"),
                new Book("数据结构","44.8"),
                new Book("C++程序设计","35.0")};
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("图书总册书为："+Book.getBookNums());
    }
}

class Book{
    private static int bookStaticID = 0;
    private static int bookNums = 0;

    public static int getBookNums() {
        return bookNums;
    }

    String bookName;
    String bookPrice;
    int bookId;

    public Book(String bookName, String bookPrice) {
        bookStaticID++;
        bookNums++;
        this.bookId = bookStaticID;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "书名："+bookName+"，书号："+bookId+"，书价："+bookPrice;
    }
}
