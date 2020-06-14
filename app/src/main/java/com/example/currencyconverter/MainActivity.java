package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumberDecimal);
        button = findViewById(R.id.button);
    }

    public void convert(View view)
    {
        double currency = Double.parseDouble(editText.getText().toString());
        double inr = currency * 75.51;
        textView2.setText("The Value of "+Double.toString(currency)+ " USD in INR is "+Double.toString(inr));
        Toast.makeText(getApplicationContext(),"Converted.....",Toast.LENGTH_SHORT).show();
    }
}