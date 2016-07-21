package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        partialBookTitle = partialBookTitle.toLowerCase();
        printStream.println("******** Books Containing '"+partialBookTitle+"' ***********");
        for(String book: books){
            if(book.toLowerCase().contains(partialBookTitle)){
                printStream.println(book);
            }
        }
        printStream.println();
    }
}
