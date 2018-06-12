package com.example.sam.moneyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void button(View view)
    {
        EditText text1=(EditText) findViewById(R.id.editText);
        Double d=Double.parseDouble(text1.getText().toString());
        d=d*67.47;
        d=Math.round(d*100D)/100D;
        Toast.makeText(this, "Rupees: " + d , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
