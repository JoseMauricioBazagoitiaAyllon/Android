package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UnicodeSet;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityCalculadora extends AppCompatActivity {
    EditText edt;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsum,bres,bmul,bdiv,bequal,bPoint,bc;//bP
    ImageButton bbs;
    //String strToAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculadora);
        edt =findViewById(R.id.txt_show);
        b1 =findViewById(R.id.button_1);
        b2 =findViewById(R.id.button_2);
        b3 =findViewById(R.id.button_3);
        b4 =findViewById(R.id.button_4);
        b5 =findViewById(R.id.button_5);
        b6 =findViewById(R.id.button_6);
        b7 =findViewById(R.id.button_7);
        b8 =findViewById(R.id.button_8);
        b9 =findViewById(R.id.button_9);
        b0 =findViewById(R.id.button_0);
        bsum =findViewById(R.id.button_suma);
        bres =findViewById(R.id.button_resta);
        bmul =findViewById(R.id.button_Mult);
        bdiv =findViewById(R.id.button_div);
        bequal =findViewById(R.id.button_equal);
        bbs = findViewById(R.id.buttonBackSpace);
        //bP = findViewById(R.id.buttoParentecir);
        bPoint = findViewById(R.id.buttonPoint);
        bc = findViewById(R.id.buttonC);
        edt.setShowSoftInputOnFocus(false);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt.setText("");
            }
        });
        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.butonET).equals(edt.getText().toString())){
                    edt.setText("");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("0");
            }
        });
        bbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cursor = edt.getSelectionStart();
                int textlen = edt.getText().length();
                if(cursor != 0 && textlen != 0 ){
                    SpannableStringBuilder selection = (SpannableStringBuilder) edt.getText();
                    selection.replace(cursor -1, cursor, "");
                    edt.setText(selection);
                    edt.setSelection(cursor -1);

                }
            }
        });

        bPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText(".");
            }
        });
        bsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("+");
            }
        });
        bres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("*");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upDateText("/");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Excersice = edt.getText().toString();
                EvaluateOpe evaluate = new EvaluateOpe(Excersice);
                edt.setText(String.valueOf(evaluate.Evaluate()));
                int cursor = edt.getSelectionStart();
                int lengt = edt.getText().length();
                edt.setSelection(cursor +lengt);
            }
        });


        }
    private void upDateText(String strToAdd){
        String oldStr =edt.getText().toString();
        int cursorPos = edt.getSelectionStart();
        String leftString = oldStr.substring(0,cursorPos);
        String rightString = oldStr.substring(cursorPos);
        if(getString(R.string.butonET).equals(edt.getText().toString())){
            edt.setText(strToAdd);
            edt.setSelection(+1);
        }else{
            edt.setText(String.format("%s%s%s",leftString,strToAdd,rightString));
            edt.setSelection(cursorPos +1);

        }
    }
}