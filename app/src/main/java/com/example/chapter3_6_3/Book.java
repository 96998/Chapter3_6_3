package com.example.chapter3_6_3;

import java.io.Serializable;

/**
 * @author Alexander Jiajiason
 * @date 2019-06-01 10:42
 */
public class Book implements Serializable {
    private String bookName;
    private String bookID;
    public Book(String bookName,String bookID)
    {
        this.bookID=bookID;
        this.bookName=bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookID() {
        return bookID;
    }
}
