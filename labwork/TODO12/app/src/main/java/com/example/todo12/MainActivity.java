package com.example.todo12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab=findViewById(R.id.callcall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:17980119"));
                startActivity(intent);

            }
        });
    }

    public void DisplayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

    }

    public void donutclick(View view) {

        DisplayToast("You have ordered donut");
    }

    public void cupcakeclick(View view) {
        DisplayToast("You have ordered cupcake");
    }

    public void gingerbreadclick(View view) {
        DisplayToast("You have ordered gingerbread");
    }
}