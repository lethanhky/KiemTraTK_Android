package com.example.student.ltk_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button btn_tinhtong;
    TextView textv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText)findViewById(R.id.num2);
        btn_tinhtong = (Button)findViewById(R.id.button1);
        textv = (TextView) findViewById(R.id.textViewtt);
        btn_tinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nu1 = Integer.parseInt(n1.getText().toString());
                int nu2 = Integer.parseInt(n2.getText().toString());
                int tong = nu1 + nu2;
                textv.setText("tong = "+ tong);
            }
        });


    }
}
