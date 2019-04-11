package com.example.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details_dishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_dish);

        TextView name = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        name.setText(bundle.getString("name"));

    }
}
