package com.example.chapter3_6_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Alexander Jiajiason
 * @date 2019-06-01 10:49
 */
public class ShowActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        Intent intent = this.getIntent();
        Book book = (Book) intent.getSerializableExtra("book");
        String bookName = book.getBookName();
        String bookId = book.getBookID();
        TextView textView = new TextView(this);
        textView.setText("bookName：" + bookName + "\nbookId：" + bookId);
        setContentView(textView);
    }
}
