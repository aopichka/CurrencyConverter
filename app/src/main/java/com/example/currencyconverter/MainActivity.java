package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        double num = Double.parseDouble(myTextField.getText().toString());

        double pounds = num * 0.77;

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(pounds);
    }

    public void goToActivity2(double p) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", p);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
