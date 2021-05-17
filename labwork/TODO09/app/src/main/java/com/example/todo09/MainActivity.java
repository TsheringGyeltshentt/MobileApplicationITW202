package com.example.todo09;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText firstvalue,secondvalue;
    private Button add, subtract, multiply, divide;
    private TextView result;
    private Calculator mcalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstvalue=findViewById(R.id.firstoperand);
        secondvalue=findViewById(R.id.secondoperand);
        result=findViewById(R.id.resultoperation);
        mcalculator=new Calculator();
    }
    public void add(View view) {
        String valueone=firstvalue.getText().toString();
        String valuetwo=secondvalue.getText().toString();
        double value=mcalculator.ADD(Double.valueOf(valueone),Double.valueOf(valuetwo));
        result.setText(String.valueOf(value));
    }
    public void subtract(View view) {
        String valueone=firstvalue.getText().toString();
        String valuetwo=secondvalue.getText().toString();
        double value=mcalculator.SUBTRACT(Double.valueOf(valueone),Double.valueOf(valuetwo));
        result.setText(String.valueOf(value));
    }
    public void multiply(View view) {
        String valueone=firstvalue.getText().toString();
        String valuetwo=secondvalue.getText().toString();
        double value=mcalculator.MULTIPLY(Double.valueOf(valueone),Double.valueOf(valuetwo));
        result.setText(String.valueOf(value));
    }
    public void divide(View view) {
        String valueone=firstvalue.getText().toString();
        String valuetwo=secondvalue.getText().toString();
        double value=mcalculator.DIVIDE(Double.valueOf(valueone),Double.valueOf(valuetwo));
        result.setText(String.valueOf(value));
    }
}
