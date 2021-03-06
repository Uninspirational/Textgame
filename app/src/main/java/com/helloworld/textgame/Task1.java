package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        final Button button1 = (Button) findViewById(R.id.Task1button1);
        final Button button2 = (Button) findViewById(R.id.Task1button2);
        final Button button3 = (Button) findViewById(R.id.Task1button3);
        button1.setText("Go left");
        button2.setText("Go straight");
        button3.setText("Go right");
        final TextView text1 = (TextView) findViewById(R.id.Task1text1);
        text1.setText(Strings.line5 + Strings.line6);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText(Strings.failedTask1);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1.this, Adv5.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1.this, Adv5.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1.this, Adv5.class));
                    }});
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(Task1.this, Task1P2.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText(Strings.failedTask1);
                button1.setText("");
                button2.setText("");
                button3.setText("Continue");
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1.this, Adv5.class));
                    }});
                button2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1.this, Adv5.class));
                    }});
                button3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(Task1.this, Adv5.class));
                    }});
            }
        });

    }
}
