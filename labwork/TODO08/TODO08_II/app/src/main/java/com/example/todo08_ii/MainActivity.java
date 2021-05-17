package com.example.todo08_ii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;

import java.awt.font.TextAttribute;
public class MainActivity extends AppCompatActivity {
    private EditText messageR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageR=findViewById(R.id.recievedmessage);

        Intent intent = getIntent();
        Uri message = intent.getData();

        if(message!=null){
            String msg=message.toString();
            messageR.setText(msg);
        }
    }
}