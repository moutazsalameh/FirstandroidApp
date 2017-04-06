package com.example.mounj.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //*called when the user click on the send button* //

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);//intet contructor takes two parameters(this,DisplayMessageActivity.class)
        EditText edittext = (EditText)findViewById(R.id.editText);
        String message =edittext.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);//this method putExtra() adds the EditText's value to the intent
        startActivity(intent);//method starts an instance of the displayMessageActivity specified by the intent


    }
}
