package com.loyalcoders.localbus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Virudhunagar extends AppCompatActivity {

    ListView listView;
    Animation animation;
    String[] vnr_bus_stand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virudhunagar);

        getSupportActionBar().setTitle("Virudhunagar");
        


        listView = findViewById(R.id.listview);

        vnr_bus_stand = getResources().getStringArray(R.array.vnr_bus_stand);


        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1);
        VnrAdapter adapter = new VnrAdapter(Virudhunagar.this, vnr_bus_stand);
        animation = AnimationUtils.loadAnimation(this, R.anim.animation1);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //click sivakasi
                if(position==64) {
                    startActivity(new Intent(Virudhunagar.this, sivakasi.class));
                }else
                    //click sattur
                    if(position==58){
                    startActivity(new Intent(Virudhunagar.this, sattur.class));
                }else
                    //click kallupatti
                    if(position==11){
                    startActivity(new Intent(Virudhunagar.this, kallupatti.class));
                }else
                        //click aruppukottai
                    if(position==2){
                    startActivity(new Intent(Virudhunagar.this, aruppukottai.class));
                }else{

                }
            }
        });


    }
}