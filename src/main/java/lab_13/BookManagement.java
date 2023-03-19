package main.java.lab_13;

import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        String relativeFilePath = "\\src\\main\\java\\lab_13\\BookList.txt";
        String filePath = System.getProperty("user.dir").concat(relativeFilePath);
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("======= Book Management Program (CRUD)============");
            System.out.println("1. Add new book");
            System.out.println("2. Find a book(ISBN)");
            System.out.println("3. Update a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Print the book list");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select your option");
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    List<Book> newBookList = DataFactory.getOldBookList(filePath);
                    newBookList.add(newBookData());
                    DataFactory.saveBookToFile(newBookList, filePath);
                    break;
                case 2:
                    List<Book> existingBookList = DataFactory.getOldBookList(filePath);
                    findBook(existingBookList);
                    break;
                case 3:
                    List<Book> updatingBookList = DataFactory.getOldBookList(filePath);
                    updateBook(updatingBookList);
                    DataFactory.saveBookToFile(updatingBookList, filePath);
                    break;
                case 4:
                    List<Book> deletingBookList = DataFactory.getOldBookList(filePath);
                    deleteBook(deletingBookList);
                    DataFactory.saveBookToFile(deletingBookList, filePath);
                    break;
                case 5:
                    List<Book> printBookList = DataFactory.getOldBookList(filePath);
                    System.out.println(printBookList);
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Goodbye");
            }
        }
    }


    private static Book newBookData() {
        Scanner inputISBN = new Scanner(System.in);
        System.out.println("Please input ISBN");
        String ISBN = inputISBN.next();
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
        System.out.println("Add new book :" + newBook);
        return newBook;
    }

    private static void findBook(List<Book> existingBookList) {
        Scanner inputISBN = new Scanner(System.in);
        System.out.println("Please input ISBN of the book u want to find");
        String ISBN = inputISBN.next();
        if (existingBookList.isEmpty()) {
            System.out.println("The book list is empty, please add new book to the list");
            return;
        }
        if (ISBN == null) throw new RuntimeException("ISBN can't be null");
        for (Book book : existingBookList) {
            if (ISBN.equals(book.getISBN())) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("The book with ISBN = " + ISBN + " is not in the book list");
    }

    private static void updateBook(List<Book> updateBookList) {
        Scanner inputISBN = new Scanner(System.in);
        System.out.println("Please input ISBN of the book u want to update");
        String ISBN = inputISBN.next();
        if (updateBookList.isEmpty()) {
            System.out.println("The book list is empty, please add new book to the list");
        }
        if (ISBN == null) throw new RuntimeException("ISBN can't be null");
        for (Book book : updateBookList) {
            if (ISBN.equals(book.getISBN())) {
                Scanner newTitle = new Scanner(System.in);
                System.out.println("Please input new title");
                book.setTitle(newTitle.next());
                Scanner newAuthor = new Scanner(System.in);
                System.out.println("Please input new Author");
                book.setAuthor(newAuthor.next());
                Scanner newYear = new Scanner(System.in);
                System.out.println("Please input new Year");
                book.setYear(newYear.nextInt());
                System.out.println("The book is updated with new content :" + book);
                return;
            }
        }
        System.out.println("The book with ISBN = " + ISBN + " is not in the book list");
    }

    private static void deleteBook(List<Book> deleteBookList) {
        Scanner inputISBN = new Scanner(System.in);
        System.out.println("Please input ISBN of the book u want to delete");
        String ISBN = inputISBN.next();
        if (deleteBookList.isEmpty()) {
            System.out.println("The book list is empty, please add new book to the list");
        }
        if (ISBN == null) throw new RuntimeException("ISBN can't be null");
        for (Book book : deleteBookList) {
            if (ISBN.equals(book.getISBN())) {
                System.out.println("Delete the book :" + book);
                deleteBookList.remove(book);
                return;
            }
        }
        System.out.println("The book with ISBN = " + ISBN + " is not in the book list");
    }
}
