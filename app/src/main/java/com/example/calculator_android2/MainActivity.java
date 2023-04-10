package com.example.calculator_android2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd,btnSub,btnMul,btnDiv,btnRem;
    TextView textResult;
    String num1, num2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1= (EditText) findViewById(R.id.Edit1);
        edit2= (EditText) findViewById(R.id.Edit2);

        btnAdd= (Button) findViewById(R.id.button1);
        btnSub= (Button) findViewById(R.id.button2);
        btnMul= (Button) findViewById(R.id.button3);
        btnDiv= (Button) findViewById(R.id.button4);
        btnRem= (Button) findViewById(R.id.button5);
        textResult= findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else if(num1.trim().equals("0")||num2.trim().equals("0")){
                    Toast.makeText(getApplicationContext(), "0이 아닌 다른 숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    result= Double.parseDouble(num1)/Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " +result.toString());
                }
            }
        });
        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("")|| num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else if(num1.trim().equals("0")||num2.trim().equals("0")){
                    Toast.makeText(getApplicationContext(), "0이 아닌 다른 숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }else{
                    result= Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " +result.toString());
                }
            }
        });
    }
}
