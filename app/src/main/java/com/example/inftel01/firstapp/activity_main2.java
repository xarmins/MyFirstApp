package com.example.inftel01.firstapp;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.inftel01.firstapp.MainActivity.EXTRA_MESSAGE;

public class activity_main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        if(extras == null){
            return;
        }
        String value1 = extras.getString(EXTRA_MESSAGE);
        if(value1 != null){
            EditText text1 = (EditText) findViewById(R.id.editText2);
            text1.setText(value1);
        }
    }
    public void onClick(View view){
        finish();
    }
    public void finish(){
        Intent data = new Intent();
        data.putExtra("returnKey1","hola");
        setResult(RESULT_OK, data);
        super.finish();
    }

}
