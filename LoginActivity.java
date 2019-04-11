package com.example.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylogin);

        final EditText Name = (EditText) findViewById(R.id.etName);
        final EditText Password = (EditText) findViewById(R.id.etPassword);
        final TextView Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Info.setText("Attempts: 0");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("admin")) && (userPassword.equals("admin"))) {
            Intent intent = new Intent(LoginActivity.this, ListActivity.class);
            startActivity(intent);
        } else {
            counter++;
            Toast.makeText(getApplicationContext(), "Login is Faild please try again :" + counter, Toast.LENGTH_SHORT).show();
            Info.setText("Attempts" + String.valueOf(counter));
            if (counter == 3) {
                Login.setEnabled(false);
            }
        }
    }
}
