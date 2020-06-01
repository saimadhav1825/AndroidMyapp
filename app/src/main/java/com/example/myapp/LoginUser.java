package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUser extends AppCompatActivity {
    EditText username,password;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        username=(EditText)findViewById(R.id.textView1);
        password=(EditText)findViewById(R.id.textView2);
        b=(Button)findViewById(R.id.button);

               b.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       String user=username.getText().toString();
                       String pass=password.getText().toString();
                       Toast.makeText(LoginUser.this,"user"+user+"password"+pass,Toast.LENGTH_SHORT).show();
                   }
               });


    }
}
