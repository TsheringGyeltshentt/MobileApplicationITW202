package com.example.todo_07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView mTextView;
   private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=(TextView) findViewById(R.id.textView);
        if(savedInstanceState !=null){
            count=savedInstanceState.getInt("mcount");
            mTextView.setText(String.valueOf(count));
        }
    }

    public void count(View view) {
        count++;
        mTextView.setText(String.valueOf(count));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("mcount", count);
    }
}