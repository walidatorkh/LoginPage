package com.example.jbt.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUserName;
    private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUserName = (EditText)findViewById(R.id.editTextUserName);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
    }

    public void login(View view) {
        String userName = editTextUserName.getText().toString();
        String password = editTextPassword.getText().toString();
        if (userName.equals("abcd")&& password.equals("1234")) {

            Toast.makeText(this, "Welcome User " + userName, Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Error " + userName, Toast.LENGTH_LONG).show();
        }

    }
}
