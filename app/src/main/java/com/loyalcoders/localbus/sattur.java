package com.loyalcoders.localbus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class sattur extends AppCompatActivity {

    ListView lvsattur;
    List<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sattur);

        getSupportActionBar().setTitle("Sattur");

        lvsattur = findViewById(R.id.lvsattur);

        list = new ArrayList<String>();

        list.add("1.    B24A         5.20 AM          5.30 AM");
        list.add("2.    B91A         6.00 AM          6.20 AM");
        list.add("3.    C75A         6.05 AM          6.25 AM");
        list.add("4.    A95A         6.50 AM          6.55 AM");
        list.add("5.    C73A         7.10 AM          7.15 AM");
        list.add("6.    B24A         7.20 AM          7.40 AM");
        list.add("7.    C01A         7.40 AM          7.50 AM");
        list.add("8.    B91A         8.10 AM          8.30 AM");
        list.add("9.    C82A         9.00 AM          9.10 AM");
        list.add("10.   C73A         9.10 AM          9.15 AM");
        list.add("11.   B24A         9.30 AM          9.40 AM");
        list.add("12.   C01A         9.40 AM          9.50 AM");
        list.add("13.   A95A         10.15 AM         10.20 AM");
        list.add("14.   B91A         10.40 AM          10.50 AM");
        list.add("15.   C01B         10.55 AM          11.05 AM");
        list.add("16.   C73A         11.10 AM          11.15 AM");
        list.add("17.   B24A         11.35 AM          11.50 AM");
        list.add("18.   C01A         11.40 AM          12.25 AM");
        list.add("19.   C31A         11.50 AM          12.00 PM");
        list.add("20.   C24A         12.50 PM          12.55 PM");
        list.add("21.   C01B         12.55 PM          1.05 PM");
        list.add("22.   B91A         1.05 PM           1.45 PM");
        list.add("23.  C73A           1.10 PM          1.15 PM");
        list.add("24.   C52A          1.20 PM         1.25 PM");
        list.add("25.   C82A          1.30 PM          1.35 PM");
        list.add("26.   B24A          1.45 PM          2.00 PM");
        list.add("27.   A95A          2.10 PM          2.20 PM");
        list.add("28.   C72A          2.25 PM          2.30 PM");
        list.add("29.   C01A          2.40 PM          3.00 PM");
        list.add("30.   C01B          3.00 PM          3.10 PM");
        list.add("31.   C73A          3.10 PM          3.20 PM");
        list.add("32.   C31A          3.25 PM          3.30 PM");
        list.add("33.   B91A          3.40 PM          3.50 PM");
        list.add("34.   B24A          3.55 PM          4.05 PM");
        list.add("35.   C01A          4.45 PM          5.00 PM");
        list.add("36.   C73A          5.10 PM          5.15 PM");
        list.add("37.   C01B          5.25 PM          5.30 PM");
        list.add("38.   C82A          5.30 PM          5.40 PM");
        list.add("39.   B91A          5.50 PM          6.00 PM");
        list.add("40.   B24A          5.55 PM          6.15 PM");
        list.add("41.   C71A          6.15 PM          6.20 PM");
        list.add("42.   A95A          6.22 PM          6.25 PM");
        list.add("43.   C74A          6.55 PM          7.10 PM");
        list.add("44.   C01A          7.05 PM          7.20 PM");
        list.add("45.   C73A          7.15 PM          7.30 PM");
        list.add("46.   C01B          7.30 PM          7.45 PM");
        list.add("47.   B91A          7.50 PM          7.55 PM");
        list.add("48.   C31A          8.00 PM          8.10 PM");
        list.add("49.   C83A          8.45 PM          9.00 PM");
        list.add("50.   C73A          9.25 PM          9.30 PM");
        list.add("51.   C21A         10.15 PM        10.20 PM");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_item, list);

        lvsattur.setAdapter(arrayAdapter);

    }
}