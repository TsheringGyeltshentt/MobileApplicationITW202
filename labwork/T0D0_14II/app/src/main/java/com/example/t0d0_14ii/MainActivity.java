package com.example.t0d0_14ii;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button malert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        malert=findViewById(R.id.alertbutton);

        malert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder Alert= new AlertDialog.Builder(MainActivity.this);
                Alert.setTitle("Do you want to exit");
                Alert.setMessage("Click Ok to exit");
                Alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressed Ok",Toast.LENGTH_SHORT).show();
                    }
                });
                Alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressed Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                Alert.show();
            }
        });
    }
}