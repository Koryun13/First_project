
//MainActivity
package com.herokuapp.romanweb1.first_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String b,d;
    double a , c=0,s,plusi =0, minusi =0, dividei=0,multipi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);



                 Button plus = findViewById(R.id.plus);
                 Button minus = findViewById(R.id.minus);
                 Button multiplication = findViewById(R.id.multiplication);
                 Button divide = findViewById(R.id.divide);
                 Button equally = findViewById(R.id.equally);
                 Button btn0 = findViewById(R.id.btn0);
                 Button btn1 = findViewById(R.id.btn1);
                 Button btn2 = findViewById(R.id.btn2);
                 Button btn3 = findViewById(R.id.btn3);
                 Button btn4 = findViewById(R.id.btn4);
                 Button btn5 = findViewById(R.id.btn5);
                 Button btn6 = findViewById(R.id.btn6);
                 Button btn7 = findViewById(R.id.btn7);
                 Button btn8 = findViewById(R.id.btn8);
                 Button btn9 = findViewById(R.id.btn9);
                 Button btnC = findViewById(R.id.btnC);

                plus.setOnClickListener(this);
                minus.setOnClickListener(this);
                multiplication.setOnClickListener(this);
                divide.setOnClickListener(this);
                equally.setOnClickListener(this);

                btn0.setOnClickListener(this);
                btn1.setOnClickListener(this);
                btn2.setOnClickListener(this);
                btn3.setOnClickListener(this);
                btn4.setOnClickListener(this);
                btn5.setOnClickListener(this);
                btn6.setOnClickListener(this);
                btn7.setOnClickListener(this);
                btn8.setOnClickListener(this);
                btn9.setOnClickListener(this);
                btnC.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        TextView  text = findViewById(R.id.text);

       switch (v.getId()) {

           case R.id.btn0:

               text.append("0");
               b = text.getText().toString();
               a = Integer.parseInt(b);
               break;

           case R.id.btn1:
               text.append("1");
               b = text.getText().toString();
               a = Integer.parseInt(b);
               break;

           case R.id.btn2:
               text.append("2");
               b = text.getText().toString();
               a = Integer.parseInt(b);
               break;
           case R.id.btn3:
               text.append("3");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.btn4:
               text.append("4");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.btn5:
               text.append("5");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.btn6:
               text.append("6");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.btn7:
               text.append("7");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.btn8:
               text.append("8");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.btn9:
               text.append("9");
               b = text.getText().toString();
               a = Integer.parseInt(b);

               break;
           case R.id.plus:
               c = Integer.parseInt(b);
               if (text.getText() != "")
               {
                   text.setText("");
               }
               plusi++;
               break;
           case R.id.minus:
               c =  Integer.parseInt(b);
               if (text.getText() != "")
               {
                   text.setText("");
               }
               minusi++;
               break;
           case R.id.multiplication:
               c =  Integer.parseInt(b);
               if (text.getText() != "")
               {
                   text.setText("");
               }
               multipi++;

               break;

           case R.id.divide:
               c =  Integer.parseInt(b);
               if (text.getText() != "")
               {
                   text.setText("");
               }
               dividei++;

                break;
 
           case R.id.equally:
               if(plusi !=0 ){
                   s  =c+a ;
                   d = String.valueOf(s);
                   text.setText(d);

               }
               if(minusi !=0 ){
                   s = c-a;
                   d = String.valueOf(s);
                   text.setText(d);
               }
               if(multipi !=0 ){
                   s = c*a;
                   d = String.valueOf(s);
                   text.setText(d);
               }
               if(dividei !=0 ){
                   s = c/a;
                   d = String.valueOf(s);
                   text.setText(d);

               }
               minusi = 0;
               plusi = 0;
               multipi = 0;
               dividei = 0;


               break;

             case R.id.btnC:
               text.setText("");

               break;


            default:
                break;
        }
    }


}
