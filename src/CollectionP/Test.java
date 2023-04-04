package CollectionP;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        for(int i=0; i<20; i++){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();sc.nextLine();
            if(ch==1){
                Book b = new Book();
                System.out.println("Enter the isbn no:");
                b.setIsbnno(sc.nextInt());sc.nextLine();
                System.out.println("Enter the book name:");
                b.setBookName(sc.nextLine());
                System.out.println("Enter the author name:");
                b.setAuthor(sc.nextLine());
                lib.addBook(b);
            }
            if(ch==2){
                ArrayList<Book> bookList = lib.viewAllBooks();
                if(bookList.isEmpty()){
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator i1 = bookList.iterator();
                while (i1.hasNext()){
                    Book b = (Book)i1.next();
                    System.out.println("Isno No: " +b.getIsbnno());
                    System.out.println("Book Name: "+b.getBookName());
                    System.out.println("Author Name: "+b.getAuthor());
                }
            }
            if (ch==3){
                System.out.println("Enter the author name:");

                String name = sc.nextLine();
                ArrayList<Book> bookList = lib.viewBooksByAuthor(name);
                if (bookList.isEmpty()){
                    System.out.println("none of the book published by the author: "+name);
                    continue;
                }
                Iterator i1= bookList.iterator();
                while (i1.hasNext()){
                    Book b= (Book)i1.next();
                    System.out.println("Isno No: "+b.getIsbnno());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if (ch==4){
                System.out.println("Enter the book name");
                String name = sc.nextLine();
                System.out.println("Count is "+lib.countnoofbook(name));
            }
            if (ch==5){
                System.exit(0);
                System.out.println("Exit");
            }
        }
    }
}