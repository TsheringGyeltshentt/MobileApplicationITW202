package com.example.todo_05_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String LOG_TAG=MainActivity.class.getSimpleName();
    public final static String EXTRA_MESSAGE = "com.example.todo_05_06.MESSAGE";
    private static final int TEXT_REQUEST = 1;
    private EditText editText;
    private TextView Tv1;
    private TextView Tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText1);
        Tv1 = findViewById(R.id.Received_Reply);
        Tv2 = findViewById(R.id.Replied_Message);
    }
    public void SEND(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivityForResult(intent,TEXT_REQUEST);

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent obj) {
        super.onActivityResult(requestCode, resultCode, obj);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String message = obj.getStringExtra(MainActivity2.EXTRA_REPLY);
                Tv1.setVisibility(View.VISIBLE);
                Tv2.setText(message);
                Tv2.setVisibility(View.VISIBLE);
            }
        }
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