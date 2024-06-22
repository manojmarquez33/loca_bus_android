package com.loyalcoders.localbus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class kallupatti extends AppCompatActivity {

    ListView lvkallupatti;
    List<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kallupatti);

        getSupportActionBar().setTitle("Kallupatti");

        lvkallupatti = findViewById(R.id.lvkallupatti);

        list = new ArrayList<String>();

        list.add("1.     B02A         06.30 AM          06.40 AM");
        list.add("2.     B45A         05.10 AM          05.30 AM");
        list.add("3.     B35A         03.45 PM          04.00 PM");
        list.add("4.     B35A         06.05 PM          06.15 PM");
        list.add("5.     BO2B         06.40 AM          07.00 AM");
        list.add("6.     B35A         09.20 AM          09.30 AM");
        list.add("7.     B35A         11.25 AM          11.30 AM");
        list.add("8.     B36A         01.25 PM          01.30 PM");
        list.add("9.     B36B         03.25 PM          03.30 PM");
        list.add("10.    B36B         05.25 PM          05.30 PM");
        list.add("11.    B36B         07.45 PM          07.50 PM");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_item, list);

        lvkallupatti.setAdapter(arrayAdapter);

    }
}