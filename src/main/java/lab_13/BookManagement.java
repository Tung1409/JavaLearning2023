package main.java.lab_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Book> bookList = new ArrayList<>();
        while (isContinuing){
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your option");
            int userOption = scanner.nextInt();
            switch (userOption){
                case 1:
                    addNewBook(bookList);
                    String bookDataFile = System.getProperty("user.dir").concat("\\src\\lab_13\\BookCollections.txt");
                    DataFactory.addBookListToFile(bookList, bookDataFile);
                    break;
                    // dang bi loi khong xuong hang khi add book, khong the add 2 book, nhap book 2 thi khong con book 1
                case 2:
                    String relativeFilePath = "\\src\\lab_13\\BookCollections.txt";
                    String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);
                    DataFactory.getBookDataFromFile(absoluteFilePath);
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Goodbye");
            }
        }
    }


    private static void addNewBook(List<Book> bookList) {
        Scanner inputISBN = new Scanner(System.in);
        System.out.println("Please input ISBN");
        int ISBN = inputISBN.nextInt();
        Scanner inputTitle = new Scanner(System.in);
        System.out.println("Please input Title");
        String Title = inputTitle.next();
        Scanner inputAuthor = new Scanner(System.in);
        System.out.println("Please input Author");
        String Author = inputAuthor.next();
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Please input Year");
        int Year = inputYear.nextInt();
        Book newBook = new Book(ISBN, Title, Author, Year);
        bookList.add(newBook);
    }


    private static void printMenu() {
        System.out.println("======= Book Management Program (CRUD)============");
        System.out.println("1. Add new book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");
    }
}
