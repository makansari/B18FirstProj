package com.ansari.b18firstproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

     /*   resultTextView = findViewById(R.id.textViewResult);

      String result =  getIntent().getExtras().getString("key");

      resultTextView.setText(result);*/
    }
}
