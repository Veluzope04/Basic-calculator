package com.example.basiccalculator;

import static com.example.basiccalculator.R.id.btnadd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button btnadd, btnmul,btnsub,btndivide;

 EditText edtnum1,edtnum2;
 TextView textView;
 int num1,num2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndivide = findViewById(R.id.btndivide);
        edtnum1 = findViewById(R.id.edtnum1);
        edtnum2 = findViewById(R.id.edtnum2);
        textView = findViewById(R.id.result);

       btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndivide.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText){

        if (editText.getText().toString().equals("")){
            Toast.makeText(this, "Enter num1", Toast.LENGTH_SHORT).show();
             return 0;
        }else
            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view) {
    num1 = getIntFromEditText(edtnum1);
    num2 = getIntFromEditText(edtnum2);
        if (view.getId() == R.id.btnadd) {
            textView.setText("result = " + (num1 + num2));

        } else if ( (view.getId() == R.id.btnsub)) {
            textView.setText("result = " + (num1 - num2));

        } else if ( (view.getId() == R.id.btnmul) ){
            textView.setText("result = " + (num1 * num2));
        }
        else if ( (view.getId() == R.id.btndivide) ){
            textView.setText("result = " + (num1 /num2));
        }


    }
}