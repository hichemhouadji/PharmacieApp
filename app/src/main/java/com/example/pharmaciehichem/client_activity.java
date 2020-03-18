package com.example.pharmaciehichem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class client_activity extends AppCompatActivity {
Button mrecherche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_activity);
        mrecherche=(Button)findViewById(R.id.searche_idd) ;

    }

    public void searche_buton(View view) {
        Intent recherche_intent=new Intent(client_activity.this,MainActivity.class);
        startActivity(recherche_intent);
    }
}
