package com.example.pharmaciehichem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login_activity extends AppCompatActivity {
    Button mconnecte;
    TextView registre_textview;
    EditText musername;
    EditText mpassword;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mconnecte=(Button)findViewById(R.id.connecte_id);
        registre_textview=(TextView) findViewById(R.id.registre_id);
        mpassword=(EditText) findViewById(R.id.passwordd_id);
        musername=(EditText) findViewById(R.id.username_id);
        mFirebaseAuth=FirebaseAuth.getInstance();
        mAuthStateListner=new FirebaseAuth.AuthStateListener() {


            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser=mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser!=null){
                    Toast.makeText(login_activity.this,"vous avez connecté",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(login_activity.this,client_activity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(login_activity.this,"svp connectez",Toast.LENGTH_SHORT).show();
                }
            }
        };
        mconnecte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=musername.getText().toString();
                String pwwd=mpassword.getText().toString();



                if (email.isEmpty()){
                    musername.setError("svp!entre votre email");
                    musername.requestFocus();
                }
                else if (pwwd.isEmpty()){
                    mpassword.setError("svp!entre votre mot de passe");
                    mpassword.requestFocus();}


                else if (email.isEmpty()&&pwwd.isEmpty()){
                    Toast.makeText(login_activity.this,"les champs sont vide",Toast.LENGTH_SHORT).show();
                    Toast.makeText(login_activity.this, "Il Faut Remplire Remplire Les Champs",Toast.LENGTH_SHORT).show();
                }

                else if (!(email.isEmpty()&&pwwd.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(email,pwwd).addOnCompleteListener(login_activity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(login_activity.this,"erreur,svp réssaier",Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Intent intchoixoption=new Intent(login_activity.this,client_activity.class);
                                startActivity(intchoixoption);
                            }
                        }
                    });




                }
                else {
                    Toast.makeText(login_activity.this,"erreur",Toast.LENGTH_SHORT).show();

                }
            }
        });
        registre_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intregistre=new Intent(login_activity.this,registration_activity.class);
                startActivity(intregistre);        }


        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListner);
    }
}















