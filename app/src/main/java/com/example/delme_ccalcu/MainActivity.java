package com.example.delme_ccalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView result;
    Button addbtn,mulbtn,btndiv,btnsub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        addbtn = findViewById(R.id.addbtn);
        mulbtn = findViewById(R.id.mulbtn);
        btndiv = findViewById(R.id.btndiv);
        btnsub = findViewById(R.id.btnsub);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();
                int in1 = Integer.parseInt(n1);
                int in2 = Integer.parseInt(n2);
                int res = in1 + in2;
                String resStr = String.valueOf(res);
                result.setText(resStr);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();
                int in1 = Integer.parseInt(n1);
                int in2 = Integer.parseInt(n2);
                int res = in1 - in2;
                String resStr = String.valueOf(res);
                result.setText(resStr);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();
                int in1 = Integer.parseInt(n1);
                int in2 = Integer.parseInt(n2);
                int res = in1 / in2;
                String resStr = String.valueOf(res);
                result.setText(resStr);
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();
                int in1 = Integer.parseInt(n1);
                int in2 = Integer.parseInt(n2);
                int res = in1 * in2;
                String resStr = String.valueOf(res);
                result.setText(resStr);
            }
        });

    }
}