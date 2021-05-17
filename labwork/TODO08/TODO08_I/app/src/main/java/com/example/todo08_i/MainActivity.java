package com.example.todo08_i;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText website,location,sharetext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        website=findViewById(R.id.website);
        location=findViewById(R.id.location);
        sharetext=findViewById(R.id.sharetext);
    }

    public void wesite(View view) {
        String txt=website.getText().toString();
        Uri url=Uri.parse(txt);

        Intent intent=new Intent(Intent.ACTION_VIEW,url);

        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
        else{
            Log.d("Implicit intent","error");
        }
    }

    public void location(View view) {
        String txt2=location.getText().toString();
        Uri url=Uri.parse("geo:0,0?q="+txt2);

        Intent intent=new Intent(Intent.ACTION_VIEW,url);

        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
        else{
            Log.d("Implicit intent","error");
        }
    }

    public void sharetext(View view) {
        String txt3=sharetext.getText().toString();
        String mimeType="text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("share this text with: ")
                .setText(txt3)
                .startChooser();

    }
}