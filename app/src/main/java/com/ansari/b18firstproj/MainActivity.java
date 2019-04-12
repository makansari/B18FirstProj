package com.ansari.b18firstproj;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button click;
    EditText usernameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("mytag","main activity CREATED");


        usernameEditText = findViewById(R.id.editTextUsername);
        click = findViewById(R.id.buttonClick);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String username = usernameEditText.getText().toString();
                Toast.makeText(MainActivity.this, "the username is : " + username, Toast.LENGTH_LONG).show();

                /*Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                myIntent.putExtra("key",username);
                startActivity(myIntent);*/

                /*Intent i = new Intent("onil");
                startActivity(i);*/

                /*Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9858882211"));
                startActivity(intent);*/

                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http:google.com"));
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("mytag","main activity RE-START");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("mytag","main activity STARTED");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("mytag","main activity RESUMED");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mytag","main activity PAUSED");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mytag","main activity STOPPED");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mytag","main activity DESTROYED");

    }
}
