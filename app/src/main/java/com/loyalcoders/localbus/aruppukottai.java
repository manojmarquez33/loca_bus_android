package com.loyalcoders.localbus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class aruppukottai extends AppCompatActivity {

    ListView lvaruppukottai;
    List<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aruppukottai);

        getSupportActionBar().setTitle("Aruppukottai");

        lvaruppukottai = findViewById(R.id.lvaruppukottai);

        list = new ArrayList<String>();

        list.add("1.     B31B         08.00 AM          08.05 AM");
        list.add("2.     B33A         09.45 AM          05.20 AM");
        list.add("3.     B35A         09.05 AM          09.15 AM");
        list.add("4.     B35A         10.55 AM          11.25 AM");
        list.add("5.     BO2B         01.15 PM          01.25 PM");
        list.add("6.     B35A         02.00 PM          02.10 PM");
        list.add("7.     B35A         06.40 PM          06.50 PM");
        list.add("8.     B36A         07.50 AM          08.10 AM");
        list.add("9.     B36B         10.05 AM          10.20 AM");
        list.add("10.    B36B         12.00 PM          12.15 PM");
        list.add("11.    B36B         01.50 PM          02.10 PM");
        list.add("12.    B36B         05.30 PM          05.40 PM");
        list.add("13.    B36B         03.50 PM          04.00 PM");
        list.add("14.    B36B         07.35 PM          07.55 PM");
        list.add("15.    B36B         09.40 PM          09.52 PM");
        list.add("16.    B36C         04.40 AM          05.00 AM");
        list.add("17.    B36C         07.15 AM          07.20 AM");
        list.add("18.    B36C         09.00 AM          09.05 AM");
        list.add("19.    B36C         10.35 AM          10.55 AM");
        list.add("20.    B36C         12.30 PM          12.50 PM");
        list.add("21.    B36C         02.20 PM          02.40 PM");
        list.add("22.    B36C         04.15 PM          04.20 PM");
        list.add("23.    B36C         05.50 PM          06.05 PM");
        list.add("24.    B36C         07.45 PM          08.00 PM");
        list.add("25.    B41A         08.35 PM          08.40 PM");
        list.add("26.    B81A         02.00 PM          02.30 PM");
        list.add("27.    B81A         08.30 PM          09.00 PM");
        list.add("28.    C01C         06.10 PM          06.15 PM");
        list.add("29.    A32A         04.20 PM          04.30 PM");
        list.add("30.    A35A         06.40 PM          06.45 PM");
        list.add("31.    B71A         09.45 AM          10.00 AM");
        list.add("32.    B71A         11.45 AM          12.10 PM");
        list.add("33.    B71A         02.30 PM          02.55 PM");
        list.add("34.    B71A         06.35 PM          06.40 PM");
        list.add("35.    B74A         05.35 AM          05.50 AM");
        list.add("36.    B74A         09.15 AM          09.50 AM");
        list.add("37.    B74A         11.15 AM          11.50 AM");
        list.add("38.    B74A         01.30 PM          01.50 PM");
        list.add("39.    B74A         03.35 PM          03.40 PM");
        list.add("40.    B74A         05.15 PM          05.30 PM");
        list.add("41.    B74A         07.00 PM          07.20 PM");
        list.add("42.    B74A         09.00 AM          09,35 PM");
        list.add("43.    A81A         11.10 AM          11.15 AM");
        list.add("44.    A88A         06.20 AM          06.30 AM");
        list.add("45.    A88A         08.15 AM          08.20 AM");
        list.add("46.    A88A         10.30 AM          10.35 AM");
        list.add("47.    A88A         12.10 PM          12.35 PM");
        list.add("48.    A88A         02.00 PM          02.20 PM");
        list.add("49.    A88A         04.00 PM          04.10 PM");
        list.add("50.    A88A         05.40 PM          05.45 PM");
        list.add("51.    A88A         07.10 PM          07.40 PM");
        list.add("52.    A88A         09.05 PM          09.40 PM");
        list.add("53.    A95A         08.40 AM          08.50 AM");
        list.add("54.    A95A         12.15 PM          12.27 PM");
        list.add("55.    A95A         04.10 PM          04.30 PM");
        list.add("56.    A95A         08.50 PM          09.00 PM");
        list.add("57.    A98A         01.10 PM          01.15 PM");
        list.add("58.    A98A         03.15 PM          03.35 PM");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_item, list);

        lvaruppukottai.setAdapter(arrayAdapter);

    }
}