package app;

import io.DataReader;
import model.Book;

class Library {
    public static void main(String[] args) {
        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        System.out.println("Wprowadź nową książkę");
        books[0] = dataReader.readAndCreateBook();
        dataReader.close();

        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}
