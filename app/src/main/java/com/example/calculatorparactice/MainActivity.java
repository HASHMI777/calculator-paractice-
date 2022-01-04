package com.example.calculatorparactice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText editTextNumber,editTextNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        editTextNumber=findViewById(R.id.editTextNumber);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        int sum=Integer.parseInt(editTextNumber.getText().toString())+Integer.parseInt(editTextNumber.getText().toString());
        text.setText("the sum is" +sum );
    }
}