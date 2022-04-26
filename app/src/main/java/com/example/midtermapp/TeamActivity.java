package com.example.midtermapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TeamActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int images[] = {R.drawable.ahmad, R.drawable.aidin, R.drawable.aisulu, R.drawable.avai, R.drawable.azamat, R.drawable.danil, R.drawable.david, R.drawable.veniamin, R.drawable.zein};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.university);
        s2 = getResources().getStringArray(R.array.firstname);
        s3 = getResources().getStringArray(R.array.lastname);

        Adapter adapter = new Adapter(this, s1,s2,s3, images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}