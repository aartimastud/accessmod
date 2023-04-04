package CollectionP;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book bobj) {
        bookList.add(bobj);
        System.out.println("Book added successfully.");
    }

    public boolean isEmpty() {
        return bookList.isEmpty();
    }

    public ArrayList<Book> viewAllBooks() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        }
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(b);
            }
        }
        if (booksByAuthor.isEmpty()) {
            System.out.println("The list is empty.");
        }
        return booksByAuthor;
    }

    public int countnoofbook(String bname) {
        int count = 0;
        for (Book b : bookList) {
            if (b.getBookName().equalsIgnoreCase(bname)) {
                count++;
            }
        }
        return count;
    }
}
