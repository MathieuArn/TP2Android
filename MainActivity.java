package com.example.mathi.tp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lecontext = this;
        final EditText textchampsaisie = (EditText) findViewById(R.id.editText);
        Button btaction  = (Button) findViewById(R.id.button);
        btaction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext, Fenetre2.class);
                Bundle objetbunble = new Bundle();

                objetbunble.putString("passInfo", textchampsaisie.getText().toString());
                defineIntent.putExtras(objetbunble);
                lecontext.startActivityForResult(defineIntent,1);

            }});
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == 1) {
                final EditText textchampsaisie = (EditText) findViewById(R.id.editText);
                textchampsaisie.setText(data.getStringExtra("passInfo"));
            }
        }
    }
}

