package com.example.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
EditText name,username,createpassword,confirmpassword,Email,phone;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name=(EditText)findViewById(R.id.textView3);
        username=(EditText)findViewById(R.id.textView4);
        createpassword=(EditText)findViewById(R.id.textView5);
        confirmpassword=(EditText)findViewById(R.id.textView6);
        Email=(EditText)findViewById(R.id.editText3);
        phone=(EditText)findViewById(R.id.editText4);


        String uname=name.getText().toString();
        String user=username.getText().toString();
        String cpass=createpassword.getText().toString();
        String cmpass=confirmpassword.getText().toString();
        String mail=Email.getText().toString();
        String uphone=phone.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 AlertDialog.Builder builder=new AlertDialog.Builder(Registration.this);
                 builder.setMessage("confirm registration");
                 builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {

                     }
                 });
                 builder.setNegativeButton("cancel",null);
                builder.setCancelable(false);
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });
    }
}
