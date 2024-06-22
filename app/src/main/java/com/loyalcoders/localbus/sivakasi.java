package com.loyalcoders.localbus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class sivakasi extends AppCompatActivity {


    ListView lvsiva;
    List<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sivakasi);

        getSupportActionBar().setTitle("Sivakasi");

        lvsiva = findViewById(R.id.lvsiva);

        list = new ArrayList<String>();

        list.add("1.   B02B          5.10 AM	       5.20 AM");
        list.add("2.   B88A          6.05 AM           6.25 AM");
        list.add("3.   E88A          6.40 AM           6.45 AM");
        list.add("4.   E02B          7.00 AM           7.10 AM");
        list.add("5.   E02C          7.05 AM           7.20 AM");
        list.add("6.   E02A          7.40 AM	       7.45 AM");
        list.add("7.   B02B          8.05 AM	       8.10 AM");
        list.add("8.   B42A          8.25 AM           8.30 AM");
        list.add("9.   B02A          8.35 AM	       8.45 AM");
        list.add("10.  B71A          9.00 AM	       9.05 AM");
        list.add("11.  E02B          9.15 AM	       9.20 AM");
        list.add("12.  F83B          9.15 AM	       9.25 AM");
        list.add("13.  B78A          9.20 AM	       9.30 AM");
        list.add("14.  E02A          9.50 AM	       9.50 AM");
        list.add("15.  E63A          9.55 AM          10.10 AM");
        list.add("16.  B02B          10.08 AM	      10.20 AM");
        list.add("17.  B88A          10.15 AM	      10.25 AM");
        list.add("18.  E82A          10.20 AM	      10.40 AM");
        list.add("19.  B42A          10.25 AM	      10.30 AM");
        list.add("20.  E88A          10.40 AM	      10.45 AM");
        list.add("21.  B02A          10.45 AM	      10.50 AM");
        list.add("22.  E21A          11.00 AM	      11.10 AM");
        list.add("23.  B71A          11.15 AM	      11.25 AM");
        list.add("24.  E02B          11.25 AM	      11.30 AM");
        list.add("25.  E02C          11.35 AM	      11.50 AM");
        list.add("26.  E02A          12.00 PM	      12.05 PM");
        list.add("27.  E33A          12.05 PM	      12.15 PM");
        list.add("28.  E63A          12.15 PM	      12.30 PM");
        list.add("29.  B02B          12.25 PM	      12.40 PM");
        list.add("30.  B02D          12.35 PM	      12.45 PM");
        list.add("31.  E84A          12.50 PM	      12.55 PM");
        list.add("32.  B41A          12.50 PM	       1.00 PM");
        list.add("33.  E88A          12.50 PM	       1.10 PM");
        list.add("34.  B02A          1.00  PM	       1.20 PM");
        list.add("35.  E02B          1.30  PM	       1.35 PM");
        list.add("36.  B71A          1.40  PM	       1.50 PM");
        list.add("37.  B02C          1.55  PM	       2.10 PM");
        list.add("38.  E02A          2.10  PM	       2.20 PM");
        list.add("39.  E63A          2.25  PM	       2.35 PM");
        list.add("40.  B41A          2.55  PM	       3.10 PM");
        list.add("41.  E22A          3.15  PM	       3.20 PM");
        list.add("42.  B02A          3.20  PM	       3.30 PM");
        list.add("43.  B02B          3.40  PM	       3.45 PM");
        list.add("44.  E41A          4.05  PM	       4.10 PM");
        list.add("45.  E02A          4.10  PM	       4.20 PM");
        list.add("46.  E02C          4.25  PM	       4.40 PM");
        list.add("47.  E83A          4.40  PM	       4.50 PM");
        list.add("48.  B02B          4.45  PM	       4.55 PM");
        list.add("49.  B42A          5.15  PM	       5.20 PM");
        list.add("50.  B02A          5.35  PM	       5.45 PM");
        list.add("51.  E02B          5.50  PM	       5.55 PM");
        list.add("52.  E41A          6.20  PM	       6.25 PM");
        list.add("53.  E02A          6.30  PM	       6.40 PM");
        list.add("54.  E02C          6.40  PM	       6.50 PM");
        list.add("55.  B02D          7.20  PM	       7.35 PM");
        list.add("56.  E63A          7.20  PM	       7.25 PM");
        list.add("57.  E88A          7.40  PM	       8.20 PM");
        list.add("58.  B02A          7.45  PM	       8.10 PM");
        list.add("59.  B86A          7.50  PM	       8.00 PM");
        list.add("60.  B88A          7.50  PM	       7.50 PM");
        list.add("61.  E02B          8.05  PM	       8.50 PM");
        list.add("62.  E02A          8.40  PM	       9.10 PM");
        list.add("63.  E41A          8.45  PM	       8.50 PM");
        list.add("64.  E87B          9.10  PM	       9.30 PM");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.list_item, list);

        lvsiva.setAdapter(arrayAdapter);

    }
}