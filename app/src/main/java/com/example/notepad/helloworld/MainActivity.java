package com.example.notepad.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button greetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetButton = (Button) findViewById(R.id.greetButton);
        greetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView textMessage;
        textMessage = (TextView) findViewById(R.id.textMessage);

        switch (view.getId()) {
            case R.id.greetButton:
                textMessage.setText("Hello EPAM!");
                break;
            default:
                break;
        }
    }
}
