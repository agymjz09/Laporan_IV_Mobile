package com.f55121076_agym_mahaputra.androidwebapi;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private static final String TAG =
            MainActivity.class.getSimpleName();

private ListView listUsers;
private ProgressBar progressBar;
private UserAdapter adapter;
private ArrayList<User> user;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("List of Github Users");
        }

        progressBar = findViewById(R.id.progressBar);
        listUsers = findViewById(R.id.lv_list);

        adapter = new UserAdapter(this);
        }

}
