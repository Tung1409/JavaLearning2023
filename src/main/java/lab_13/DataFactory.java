package main.java.lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataFactory {

    public static List<Book> getBookDataFromFile(String filePath) {
        System.out.println("[INFO] reading file from ".concat(filePath));
        List<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ISBN u wanna find");
        int inputISBN = scanner.nextInt();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)

        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(",");
                int bookISBN = Integer.parseInt(bookData[0]);
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);
                Book book = new Book(bookISBN, bookTitle, bookAuthor, bookYear);
                bookList.add(book);
//                for (Book book1 : bookList) {
//                    if (book1 = userInputBook)
//                }
                dataLine = bufferedReader.readLine();
            }
            if (bookList.isEmpty()){
                System.out.println("There is no book in the file");
            } else {
                for (Book book : bookList) {
                    if (inputISBN == book.getISBN()){
                        System.out.println(book);
                    } else {
                        System.out.printf("Can't find book with ISBN is: %d\n", inputISBN);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void addBookListToFile(List<Book> bookList, String filePath) {
        System.out.println("[INFO] Writing file from ".concat(filePath));
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        ) {

            for (Book book : bookList) {
                String dataNewLine = book.getISBN() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getYear();
                bufferedWriter.write(dataNewLine);
                System.out.println("Book saved successfully");
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


