package com.loyalcoders.localbus;

import android.annotation.SuppressLint;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class VnrAdapter extends BaseAdapter {

    Virudhunagar virudhunagar;
    String[] vnr_title;
    Animation animation;

    public VnrAdapter(Virudhunagar virudhunagar, String[] title) {
        this.virudhunagar = virudhunagar;
        this.vnr_title = title;
    }


    public static int getRandom(int max) {
        return (int) (Math.random() * max);
    }


    @Override
    public int getCount() {
        return vnr_title.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(virudhunagar).inflate(R.layout.new_item_layout, viewGroup, false);
        animation = AnimationUtils.loadAnimation(virudhunagar, R.anim.animation1);

        TextView textView;
        LinearLayout ll_bg;
        ll_bg = view.findViewById(R.id.ll_bg);
        textView = view.findViewById(R.id.textview);

        int number = getRandom(8);
        if (number == 1) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_1));
        } else if (number == 2) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_2));
        }
        if (number == 3) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_3));
        } else if (number == 4) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_4));
        }
        if (number == 5) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_5));
        } else if (number == 6) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_6));
        }
        if (number == 7) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_7));
        } else if (number == 8) {
            ll_bg.setBackground(ContextCompat.getDrawable(virudhunagar, R.drawable.gradient_8));
        }

        textView.setText(vnr_title[i]);
        textView.setAnimation(animation);


        return view;
    }

}