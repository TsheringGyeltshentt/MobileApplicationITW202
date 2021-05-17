package com.example.todo_05_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public final static String LOG_TAG=MainActivity.class.getSimpleName();
    public static final String EXTRA_REPLY = "com.example.to_05_06.reply";
    private TextView textview;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview = findViewById(R.id.textView2);
        edittext = findViewById(R.id.MessageReply);

        Intent obj = getIntent();
        String msg = obj.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textview.setText(msg);
    }
    public void reply(View view) {
        String message = edittext.getText().toString();

        Intent Rintent = new Intent();
        Rintent.putExtra(EXTRA_REPLY, message);
        setResult(RESULT_OK, Rintent);
        finish();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onpause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}