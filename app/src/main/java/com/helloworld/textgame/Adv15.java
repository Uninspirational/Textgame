package com.helloworld.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adv15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv15);

        final TextView text1 = (TextView) findViewById(R.id.Adv15text1);
        text1.setText(Strings.line19());

        final Button button1 = (Button) findViewById(R.id.Adv15button1);
        button1.setText("Continue");

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text1.setText(Strings.line20());
                button1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Code here executes on main thread after user presses button
                        startActivity(new Intent(Adv15.this, Fight9.class));
                    }
                });
            }
        });
    }
}
