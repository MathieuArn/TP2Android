package com.example.mathi.tp2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fenetre2 extends AppCompatActivity {
    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre2);

        lecontext = this;
        //final EditText textchampsaisie = (EditText) findViewById(R.id.editText2);
        Button btaction  = (Button) findViewById(R.id.button2);

        btaction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext, MainActivity.class);
                Bundle objetbunble = new Bundle();
                objetbunble.putString("passInfo", "Hello World");
                defineIntent.putExtras(objetbunble);
                int coderetourok = 1;
                setResult(coderetourok,defineIntent);
                finish();
            }});
    }
}
