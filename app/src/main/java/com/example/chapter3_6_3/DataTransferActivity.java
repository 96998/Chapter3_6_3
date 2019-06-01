package com.example.chapter3_6_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author Alexander Jiajiason
 * @date 2019-06-01 10:45
 */
public class DataTransferActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.main);
        Button btn = (Button) this.findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText bookNameTV = (EditText) findViewById(R.id.editText1);
                EditText bookIdTV = (EditText) findViewById(R.id.editText2);
                Intent intent = new Intent(DataTransferActivity.this, ShowActivity.class);
                Bundle mExtra = new Bundle();
                String bookName = bookNameTV.getText().toString();
                String bookId = bookIdTV.getText().toString();
                Book book = new Book(bookName, bookId);
                mExtra.putSerializable("book", book);
                intent.putExtras(mExtra);
                DataTransferActivity.this.startActivity(intent);
            }
        });
    }
}
