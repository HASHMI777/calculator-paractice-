package com.example.calculatorparactice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;
    EditText editTextNumber,editTextNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.TextView);
        button=findViewById(R.id.button);
        editTextNumber=findViewById(R.id.editTextNumber);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=Integer.parseInt(editTextNumber.getText().toString())+Integer.parseInt(editTextNumber.getText().toString());
                text.setText("the sum is" + sum );
            }
        });

    }
}