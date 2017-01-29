package com.example.jonathan.samplegame;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //시작점
        Random myRand = new Random();

        ((TextView) findViewById(R.id.textView1)).setText(
                String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10))
        ); //9개 랜덤넘버
    }

    public void onButtonStartClick(View args)
    {
        //((TextView) findViewById(R.id.textView1)).setVisibility(View.INVISIBLE);
        //풀어서 쓰면
        TextView numberGiven = (TextView) findViewById(R.id.textView1);
        numberGiven.setVisibility(View.VISIBLE); // 숫자 감추기

        Button startButton = (Button) findViewById(R.id.buttonStart);
        startButton.setVisibility(View.INVISIBLE); // 시작버튼 감추기

        ((ImageView)(findViewById(R.id.imageView))).setVisibility(View.INVISIBLE); // 이미지 감추기
        //Delay

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                Toast.makeText(MainActivity.this, "START!", Toast.LENGTH_SHORT).show();// 버튼누르면 START!뜸
                TextView numberGiven = (TextView) findViewById(R.id.textView1);
                numberGiven.setVisibility(View.INVISIBLE);

                Button button1 = (Button) findViewById(R.id.button2);
                button1.setVisibility(View.VISIBLE);
                Button button2 = (Button) findViewById(R.id.button3);
                button2.setVisibility(View.VISIBLE);
                Button button3 = (Button) findViewById(R.id.button4);
                button3.setVisibility(View.VISIBLE);
                Button button4 = (Button) findViewById(R.id.button5);
                button4.setVisibility(View.VISIBLE);
                Button button5 = (Button) findViewById(R.id.button6);
                button5.setVisibility(View.VISIBLE);
                Button button6 = (Button) findViewById(R.id.button7);
                button6.setVisibility(View.VISIBLE);
                Button button7 = (Button) findViewById(R.id.button8);
                button7.setVisibility(View.VISIBLE);
                Button button8 = (Button) findViewById(R.id.button9);
                button8.setVisibility(View.VISIBLE);
                Button button9 = (Button) findViewById(R.id.button10);
                button9.setVisibility(View.VISIBLE);
                Button button0 = (Button) findViewById(R.id.button11);
                button0.setVisibility(View.VISIBLE);
                Button checkButton = (Button) findViewById(R.id.checkButton);
                checkButton.setVisibility(View.VISIBLE);
                Button eraseButton = (Button) findViewById(R.id.eraseButton);
                eraseButton.setVisibility(View.VISIBLE);

                TextView numberTaken = (TextView) findViewById(R.id.editText1);
                numberTaken.setVisibility(View.VISIBLE); // 숫자쓰는거 보이기

            }
        }, 2000);

        //버튼들 띄우기

    }

    public void onNoButtonClick(View args)
    {
        //(Button)args).getText();
        ((EditText) findViewById(R.id.editText1)).setText(((EditText) findViewById(R.id.editText1)).getText().toString() + ((Button) args).getText());
        //1단계:
        //      어떤 버튼이 눌려 졌는지 getText로 판별해서 버튼에 쓰여져 있는 숫자를
        //2단계:
        //      인풋 텍스트(editText1)에 기존에 있던 문자를 얻어와서
        //      현재 눌려진 버튼의 숫자를 더한후 인풋텍스트에 덮어씀
    }

    public void onCheckButtonClick(View args)
    {
        String sTmp1 = ((EditText) findViewById(R.id.editText1)).getText().toString();
        String sTmp2 = ((TextView) findViewById(R.id.textView1)).getText().toString();

        if (sTmp1.equals(sTmp2)) {
            ((TextView) findViewById(R.id.textView1)).setText("성공!");
            Toast.makeText(MainActivity.this, "GOOD!", Toast.LENGTH_SHORT).show();
        }
        else {
            ((TextView) findViewById(R.id.textView1)).setText("실패..");
            Toast.makeText(MainActivity.this, "BAD..", Toast.LENGTH_SHORT).show();
        }
        ((TextView) findViewById(R.id.textView1)).setVisibility(View.VISIBLE);

        Button button1 = (Button) findViewById(R.id.button2);
        button1.setVisibility(View.INVISIBLE);
        Button button2 = (Button) findViewById(R.id.button3);
        button2.setVisibility(View.INVISIBLE);
        Button button3 = (Button) findViewById(R.id.button4);
        button3.setVisibility(View.INVISIBLE);
        Button button4 = (Button) findViewById(R.id.button5);
        button4.setVisibility(View.INVISIBLE);
        Button button5 = (Button) findViewById(R.id.button6);
        button5.setVisibility(View.INVISIBLE);
        Button button6 = (Button) findViewById(R.id.button7);
        button6.setVisibility(View.INVISIBLE);
        Button button7 = (Button) findViewById(R.id.button8);
        button7.setVisibility(View.INVISIBLE);
        Button button8 = (Button) findViewById(R.id.button9);
        button8.setVisibility(View.INVISIBLE);
        Button button9 = (Button) findViewById(R.id.button10);
        button9.setVisibility(View.INVISIBLE);
        Button button0 = (Button) findViewById(R.id.button11);
        button0.setVisibility(View.INVISIBLE);
        Button checkButton = (Button) findViewById(R.id.checkButton);
        checkButton.setVisibility(View.INVISIBLE);
        Button eraseButton = (Button) findViewById(R.id.eraseButton);
        eraseButton.setVisibility(View.INVISIBLE);

        ((ImageView)(findViewById(R.id.imageView))).setVisibility(View.VISIBLE);

        TextView numberTaken = (TextView) findViewById(R.id.editText1);
        numberTaken.setVisibility(View.INVISIBLE); // 숫자쓰는거 보이기

        //재시작버튼
        Button restartButton = (Button) findViewById(R.id.restartButton);
        restartButton.setVisibility(View.VISIBLE); // 재시작버튼 띄우기
    }

    public void onEraseButtonClick(View args)
    {
        String sTmp1 = ((EditText) findViewById(R.id.editText1)).getText().toString();
        sTmp1 = removeLastChar(sTmp1);
        ((EditText) findViewById(R.id.editText1)).setText(sTmp1);
    }

    public String removeLastChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(0, s.length()-1);
    }

    public void onRestartButtonClick(View args)
    {
        Random myRand = new Random();

        ((TextView) findViewById(R.id.textView1)).setText(
                String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10)) +
                        String.valueOf(myRand.nextInt(10))
        );
        ((TextView) findViewById(R.id.textView1)).setVisibility(View.INVISIBLE);

        ((Button) findViewById(R.id.buttonStart)).setVisibility(View.VISIBLE);
        ((ImageView) findViewById(R.id.imageView)).setVisibility(View.INVISIBLE);

        //인풋텍스트박스 Clear
        ((EditText) findViewById(R.id.editText1)).setText("");

        Button restartButton = (Button) findViewById(R.id.restartButton);
        restartButton.setVisibility(View.INVISIBLE); // 재시작 지우기
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
