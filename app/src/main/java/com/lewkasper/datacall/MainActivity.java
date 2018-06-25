package com.lewkasper.datacall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText4;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnclick(View view) {
        //Toast.makeText(getApplicationContext(), "Hey, it's me!", Toast.LENGTH_SHORT).show();
    }
}
