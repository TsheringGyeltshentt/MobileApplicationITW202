package com.example.tod011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mtextview;
    private String[] colorchange={"red", "pink", "purple", "deep_purple",
            "indigo", "blue", "light_blue", "cyan", "teal", "green",
            "light_green", "lime", "yellow", "amber", "orange", "deep_orange",
            "brown", "grey", "blue_grey", "black"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextview=findViewById(R.id.wishtext);
    }

    public void changecolour(View view) {

        Random random = new Random();
        String colorName = colorchange[random.nextInt(20)];

        int colorResourceName = getResources().getIdentifier(colorName, "color",
                getApplicationContext().getPackageName());


        int colorRes = ContextCompat.getColor(this, colorResourceName);


        mtextview.setTextColor(colorRes);
    }
}