package com.example.pharmaciehichem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button mmalade_buton;
Button mpharmacien_buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mmalade_buton=(Button) findViewById(R.id.malade_id);
        mpharmacien_buton=(Button)findViewById(R.id.pharmacien_id);

    }

    public void malade_buton(View view) {

            Intent malad_intent=new Intent(MainActivity.this,client_activity.class);
            startActivity(malad_intent);

    }

    public void pharmacie_buton(View view) {
        Intent pharmacien_intent=new Intent(MainActivity.this,login_activity.class);
        startActivity(pharmacien_intent);
    }
}
