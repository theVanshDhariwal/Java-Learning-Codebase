package Java.Chapter_Wise.Chapter_10;

import java.util.Scanner;

class Library {
    String[] books;
    int noOfBooks;
    boolean isPresent = false;

    Library() {
        this.books = new String[100];
        noOfBooks = 0;
    }

    public void showAvailableBooks() {
        System.out.println("Available books are:->");
        for (String book : books) {
            if (book == null) {
                continue;
            }
            System.out.println(":-> " + book);
        }
    }

    public void addBook(String book) {
        books[noOfBooks] = book;
        noOfBooks++;
    }

    public void issueBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(book)) {
                System.out.println("\n" + book + " has been issued.");
                books[i] = null;
                return;
            }
        }
        System.out.println(book + " is not available!");
    }

    public void returnBook(String book) {
        books[noOfBooks] = book;
        System.out.println(books[noOfBooks] + " has been added.");
        noOfBooks++;
    }

    public void thankYouMeth() {
        System.out.println("\nThanks for visiting.");
    }

    // public void check(String book) {
    // for (String str : books) {
    // if (str != book) {
    // isPresent = false;
    // }
    // }
    // }

    public void check(String book) {
        isPresent = false; // Reset before checking
        for (String str : books) {
            if (str != null && str.equalsIgnoreCase(book)) {
                isPresent = true;
                break;
            }
        }
    }
}

public class Exercise_04_38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook("C++");
        lib.addBook("Maths");
        lib.addBook("Physics");
        lib.addBook("Chemistry");
        lib.addBook("Java/Concept_Wise/CoreJava");

        System.out.println(lib.isPresent);

        System.out.println("<---<   THIS IS AN ONLINE LIBRARY   >--->\n");

        lib.showAvailableBooks();
        System.out.println();
        System.out.print("Enter a book name to issue it: ");
        String book = scan.nextLine();

        lib.check(book);

        System.out.println(lib.isPresent);
        lib.issueBook(book);
        System.out.println();

        lib.showAvailableBooks();

        if (lib.isPresent) {
            lib.thankYouMeth();
        } else {
            System.out.println("Do you want to return it(y/Y for yes and n/N for no): ");
            String option = scan.next();
            if (option.equalsIgnoreCase("y")) {
                lib.returnBook(book);
                lib.showAvailableBooks();
                lib.thankYouMeth();
            } else {
                lib.thankYouMeth();
            }
        }
        scan.close();
    }
}
