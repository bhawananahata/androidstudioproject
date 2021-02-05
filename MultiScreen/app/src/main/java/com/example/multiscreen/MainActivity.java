package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.codewithharry.multiscreen.ORDER";
    public void orderPlaced(View view){
  // this is the action which will be taken after clicking order place button
        // have to make an intent to connect it with another page
        Intent intent = new Intent(this , orderActivity.class);
        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        EditText edit3 = findViewById(R.id.edit3);
        String message = "order for" + edit1.getText().toString() + " , " + edit2.getText().toString()
                       + " & " + edit1.getText().toString() + "has been placed" + " ." ;
        intent.putExtra(MSG , message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}