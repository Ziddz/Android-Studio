package com.example.tempcon;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button cov;
    EditText cel,far;
    Double c,f;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cel = findViewById(R.id.cel);
        far = findViewById(R.id.far);
        cov = findViewById(R.id.con);

        cov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cel.getText().toString().isEmpty() && far.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter the value you want to convert", Toast.LENGTH_SHORT).show();
                }
                else if (cel.getText().toString().isEmpty()){
                    f = Double.parseDouble(String.valueOf(far.getText()));
                    Double fa = ((f-32)*(5.0/9.0));
                    String r = String.valueOf(fa);
                    cel.setText(r);
                }
                else if (far.getText().toString().isEmpty()) {
                    c = Double.parseDouble(String.valueOf(cel.getText()));
                    Double ce = (c-1.8);
                    String s = String.valueOf(ce);
                    far.setText(s);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter only one value to convert", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}