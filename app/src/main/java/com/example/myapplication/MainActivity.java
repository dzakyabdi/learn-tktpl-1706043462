package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_number;

    Button b_go;

    TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_number = (EditText) findViewById(R.id.et_number);
        b_go = (Button) findViewById(R.id.b_go);
        tv_show = (TextView) findViewById(R.id.tv_show);

        b_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(et_number.getText().toString());
                number = number % 2;
                if(number == 0) {
                    tv_show.setText("EVEN");
                } else {
                    tv_show.setText("ODD");
                }
            }
        });
    }

    public boolean cekEven(int number) {
        return number % 2 == 0;
    }
}