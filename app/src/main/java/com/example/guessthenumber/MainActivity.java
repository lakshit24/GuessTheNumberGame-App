package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score=0 ;
    int result;
    static int getrandom(int max,int min){
        return (int)((Math.random()*(max-min))+min);
    }
    public void toasting(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    public void game(View view){
        int ans;
        TextView textView=findViewById(R.id.textView3);
        EditText variable=findViewById(R.id.editTextNumber);
        ans=Integer.parseInt(variable.getText().toString());
        if(ans<result){
            toasting("Think of Higher Number");
            score++;
        }
        else if(ans>result){
            toasting("Think of Smaller Number");
            score++;
        }
        else {
            toasting("Congrats ! You Got It");
            textView.setText("You Guessed it in "+score+" steps");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int min=1;
        int max=100;
        result=getrandom(min,max);
    }
}