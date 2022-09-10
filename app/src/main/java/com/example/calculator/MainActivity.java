package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText dis;
    float res1,res2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dis=findViewById(R.id.input);
        dis.setShowSoftInputOnFocus(false);
        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.dis).equals(dis.getText().toString())){
                    dis.setText(" ");
                }
            }
        });
    }
    private void updateText(String stradd){
        String oldstr=dis.getText().toString();
        int cursorpos=dis.getSelectionStart();
        String leftstr=oldstr.substring(0,cursorpos);
        String rightstr=oldstr.substring(cursorpos);
        if(getString(R.string.dis).equals(dis.getText().toString())){
            dis.setText(stradd);
            dis.setSelection(cursorpos + 1);

        }else {
            dis.setText(String.format("%s%s%s", leftstr, stradd, rightstr));
            dis.setSelection(cursorpos + 1);
        }
    }


    public void clear(View view) {
        dis.setText("");
    }

    public void zero(View view) {
        updateText("0");
    }

    public void equal(View view) {
        res2=Float.parseFloat(dis.getText()+"");
        if(add==true){
            dis.setText(res1+res2+"");
            add=false;
        }
        if(sub==true){
            dis.setText(res1-res2+"");
            sub=false;
        }
        if(mul==true){
            dis.setText(res1*res2+"");
            mul=false;
        }
        if(div==true){
            dis.setText(res1/res2+"");
            div=false;
        }


    }

    public void div(View view) {
        res1=Float.parseFloat(dis.getText()+"");
        div=true;
        dis.setText(null);

    }

    public void mul(View view) {
        res1=Float.parseFloat(dis.getText()+"");
        mul=true;
        dis.setText(null);

    }

    public void nine(View view) {
        updateText("9");
    }

    public void eight(View view) {
        updateText("8");
    }

    public void seven(View view) {
        updateText("7");
    }

    public void minus(View view) {
        res1=Float.parseFloat(dis.getText()+"");
        sub=true;
        dis.setText(null);
    }

    public void six(View view) {
        updateText("6");
    }

    public void five(View view) {
        updateText("5");
    }

    public void four(View view) {
        updateText("4");
    }

    public void one(View view) {
        updateText("1");
    }

    public void two(View view) {
        updateText("2");
    }

    public void three(View view) {
        updateText("3");
    }

    public void plus(View view) {
        res1=Float.parseFloat(dis.getText()+"");
        add=true;
        dis.setText(null);
    }
}