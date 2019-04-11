package com.example.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ListView ls_menu = findViewById(R.id.ListView);
        ArrayList<Menu> menuArrayList = new ArrayList<>();
        Menu menuobject = new Menu();
        menuobject.setName("dish name ");
        menuobject.setDesc("dish description");
        menuobject.setPrice(10);
        menuobject.setImage(R.drawable.ic_dinner);

        Menu menuobject1 = new Menu();
        menuobject1.setName("dish name ");
        menuobject1.setDesc("dish description");
        menuobject1.setPrice(50);
        menuobject1.setImage(R.drawable.ic_dinner);

        Menu menuobject2 = new Menu();
        menuobject2.setName("dish name ");
        menuobject2.setDesc("dish description");
        menuobject2.setPrice(80);
        menuobject2.setImage(R.drawable.ic_dinner);

        Menu menuobject3 = new Menu();
        menuobject3.setName("dish name ");
        menuobject3.setDesc("dish description");
        menuobject3.setPrice(100);
        menuobject3.setImage(R.drawable.ic_dinner);

        Menu menuobject4 = new Menu();
        menuobject4.setName("dish name ");
        menuobject4.setDesc("dish description");
        menuobject4.setPrice(150);
        menuobject4.setImage(R.drawable.ic_dinner);

        menuArrayList.add(menuobject);
        menuArrayList.add(menuobject1);
        menuArrayList.add(menuobject2);
        menuArrayList.add(menuobject3);
        menuArrayList.add(menuobject4);


        MenuAdapter menuAdapter = new MenuAdapter(this,R.layout.menu_row,menuArrayList);
        ls_menu.setAdapter(menuAdapter);


    }

}
