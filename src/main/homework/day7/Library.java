package main.homework.day7;

import main.homework.day7.classes.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Война и мир", "Толстой"));
        books.add(new Book("Преступление и наказание", "Достоевский"));
        books.add(new Book("Мастер и Маргарита", "Булгаков"));

        for (Book book : books) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();

        Map<String, String> booksMap = new HashMap<>();
        for (Book book : books) {
            booksMap.put(book.getName(), book.getAuthor());
        }

        for (String bookName : booksMap.keySet()) {
            System.out.println(bookName);
        }

        for (String bookAuthor : booksMap.values()) {
            System.out.println(bookAuthor);
        }

        for (Map.Entry<String, String> entry : booksMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
