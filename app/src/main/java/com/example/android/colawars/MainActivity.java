package com.example.android.colawars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int colaVotes = 0;
    public int pepsiVotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(String result){
        TextView voteResult = (TextView) findViewById(R.id.result);
        voteResult.setText(result);
    }

    public void voteCola(View view) {
        colaVotes = colaVotes + 1;
        display( "Pepsi: " + pepsiVotes + "  Cola: " + colaVotes);
    }

    public void votePepsi(View view) {
        pepsiVotes = pepsiVotes + 1;
        display( "Pepsi: " + pepsiVotes + "  Cola: " + colaVotes);
    }
}
