package com.example.ajadiabiola.a3tees;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
int move= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        b1 = (Button)findViewById(R.id.b1);
        b2 =(Button)findViewById(R.id.b2);
        b3 =(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5 =(Button)findViewById(R.id.b5);
        b6 =(Button)findViewById(R.id.b6);
        b7 =(Button)findViewById(R.id.b7);
        b8 =(Button)findViewById(R.id.b8);
        b9 =(Button)findViewById(R.id.b9);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1();
        button2();
    button3();
    button4();
    button5();
    button6();
    button7();
    button8();
    button9();
    checkVictory();}


/** method to display box1**/
    public void button1() {

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b1.setText("X");
                    b1.setEnabled(false);
            }else {
                    b1.setText("O");
                    b1.setEnabled(false); }
                checkVictory();
        }});}



    /** method to display box2**/
    public void button2() {

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b2.setText("X");
                    b2.setEnabled(false);
                }else {
                    b2.setText("O");
                    b2.setEnabled(false);
            }checkVictory();
               }});}
/** method to display box1**/
    public void button3() {

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b3.setText("X");
                    b3.setEnabled(false);
                }else {
                    b3.setText("O");
                    b3.setEnabled(false);
            }checkVictory();
        }});}
    /** method to display box4**/
    public void button4() {

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b4.setText("X");
                    b4.setEnabled(false);
                }else {
                    b4.setText("O");
                    b4.setEnabled(false); }checkVictory();
        }
    });}

    /** method to display box1**/
    public void button5() {

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b5.setText("X");
                    b5.setEnabled(false);
                }else {
                    b5.setText("O");
                    b5.setEnabled(false);}checkVictory();
        }});}

  /** method to display box1**/
    public void button6() {

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b6.setText("X");
                    b6.setEnabled(false);
                }else {
                    b6.setText("O");
                    b6.setEnabled(false);}checkVictory();
        }

});}
    /** method to display box7**/
    public void button7() {

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b7.setText("X");
                    b7.setEnabled(false);
                }else {
                    b7.setText("O");
                    b7.setEnabled(false); }checkVictory();
        }
});}
    /** method to display box8**/
    public void button8() {

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b8.setText("X");
                    b8.setEnabled(false);
                }else {
                    b8.setText("O");
                    b8.setEnabled(false); }checkVictory();
        }
});}
    /**method to display box9**/
    public void button9() {

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               move++;
                if(move==1|| move==3||move==5||move==7||move==9)
                {  b9.setText("X");
                    b9.setEnabled(false);
                }else {
                    b9.setText("O");
           b9.setEnabled(false); }checkVictory();
        }
});}
 public void checkVictory(){
     if (b1.getText()=="X" && b2.getText()=="X" && b3.getText()== "X" ){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();
 }
else if (b4.getText()=="X"&& b5.getText()=="X" && b6.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();
     }

     else if (b7.getText()=="X"&& b8.getText()=="X" && b9.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();
     }
     else if (b1.getText()=="X"&& b5.getText()=="X" && b9.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();
     }
     else if (b3.getText()=="X"&& b5.getText()=="X" && b7.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();
     }
     else if (b1.getText()=="X"&& b4.getText()=="X" && b7.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();

     }
     else if (b2.getText()=="X"&& b5.getText()=="X" && b8.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();}
     else if (b3.getText()=="X"&& b6.getText()=="X" && b9.getText()== "X"){
         Toast.makeText(MainActivity.this,"playerXwins",Toast.LENGTH_LONG).show();
     }
     /** to check "O" victory**/
     else if (b1.getText()=="O"&& b2.getText()=="O" && b3.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins",Toast.LENGTH_LONG).show();
     }
     else if (b4.getText()=="O"&& b5.getText()=="O" && b6.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins",Toast.LENGTH_LONG).show();
     }

     else if (b7.getText()=="O"&& b8.getText()=="O" && b9.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins",Toast.LENGTH_LONG).show();
     }
     else if (b1.getText()=="O"&& b5.getText()=="O" && b9.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins",Toast.LENGTH_LONG).show();
     }
     else if (b3.getText()=="O"&& b5.getText()=="O" && b7.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins",Toast.LENGTH_LONG).show();
     }
     else if (b1.getText()=="O"&& b4.getText()=="O" && b7.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins",Toast.LENGTH_LONG).show();
     }
     else if (b2.getText()=="O"&& b5.getText()=="O" && b8.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins", Toast.LENGTH_LONG).show();
     }
     else if (b3.getText()=="O"&& b6.getText()=="O" && b9.getText()== "O"){
         Toast.makeText(MainActivity.this,"playerOwins", Toast.LENGTH_LONG).show();
     }






 }}