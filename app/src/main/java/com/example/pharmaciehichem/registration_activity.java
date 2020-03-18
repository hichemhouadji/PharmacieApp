package com.example.pharmaciehichem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class registration_activity extends AppCompatActivity {
Button mregistrebuton;
TextView mjai_compte;
Button mposition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_activity);
        mregistrebuton=(Button)findViewById(R.id.registre_idd);
        mjai_compte=(TextView) findViewById(R.id. jai_compt_id);
        mposition=(Button)findViewById(R.id.position_idd);

    }

    public void registrebuton(View view) {
        Intent registre_intent=new Intent(registration_activity.this,login_activity.class);
        startActivity(registre_intent);
    }

    public void jai_un_compte(View view) {
        Intent jaicompte_intent=new Intent(registration_activity.this,login_activity.class);
        startActivity(jaicompte_intent);

    }

    public void maps_position(View view) {
        Intent position_intent=new Intent(registration_activity.this,position_pharmacie_activity.class);
        startActivity(position_intent);

    }
}



package com.houadji.mypharmacie;

        import android.content.Intent;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.OnSuccessListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

        import java.util.HashMap;

public class registration_activity extends AppCompatActivity {
Button mregistrebuton;
TextView mjai_compte;
Button mposition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_activity);
        mregistrebuton=(Button)findViewById(R.id.registre_idd);
        mjai_compte=(TextView) findViewById(R.id. jai_compt_id);
        mposition=(Button)findViewById(R.id.position_idd);

    }

    public void registrebuton(View view) {
        Intent registre_intent=new Intent(registration_activity.this,login_activity.class);
        startActivity(registre_intent);
    }

    public void jai_un_compte(View view) {
        Intent jaicompte_intent=new Intent(registration_activity.this,login_activity.class);
        startActivity(jaicompte_intent);

    }

    public void maps_position(View view) {
        Intent position_intent=new Intent(registration_activity.this,position_pharmacie_activity.class);
        startActivity(position_intent);

    }
}
