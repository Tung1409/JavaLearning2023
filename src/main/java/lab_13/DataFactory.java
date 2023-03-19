package main.java.lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static List<Book> getOldBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                int year = Integer.parseInt(bookData[3]);
                Book oldBook = new Book(ISBN, title, author, year);
                bookList.add(oldBook);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public static void saveBookToFile(List<Book> bookList, String filePath) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : bookList) {
                String dataWriteLine = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear();
                bufferedWriter.write(dataWriteLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
