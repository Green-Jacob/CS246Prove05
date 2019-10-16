package com.example.prove05;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static android.content.Intent.EXTRA_TEXT;

public class MainActivity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i = new Intent(this, Main2Activity.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText book = (EditText)findViewById(R.id.book);
                EditText chapter = (EditText)findViewById(R.id.chapter);
                EditText verse = (EditText)findViewById(R.id.verse);
                String scripture = "";
                scripture = scripture.concat(book.getText().toString());
                scripture = scripture.concat(" ");
                scripture = scripture.concat(chapter.getText().toString());
                scripture = scripture.concat(":");
                scripture = scripture.concat(verse.getText().toString());
                Log.v("tag", "About to create intent with ".concat(scripture));
                i.putExtra(EXTRA_TEXT, scripture);
                startActivity(i);
            }
        };
        Button button = findViewById(R.id.submit);
        button.setOnClickListener(myListener);
    }
}
