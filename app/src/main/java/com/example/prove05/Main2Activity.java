package com.example.prove05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        if (extras == null){
            return;
        }
        String scripRef = extras.getString(Intent.EXTRA_TEXT);
        if (scripRef != null) {
            Log.v("tag2", "Recieved from Intent: ".concat(scripRef));
            final TextView scripture = (TextView) findViewById(R.id.sacred_text);
            scripture.setText(scripRef);
        }
    }
}
