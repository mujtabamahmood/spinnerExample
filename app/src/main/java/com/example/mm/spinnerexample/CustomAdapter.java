package com.example.mm.spinnerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mm on 1/4/18.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    int icons[];
    String[] carNames;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] icons, String[] carNames) {
        this.context = applicationContext;
        this.icons = icons;
        this.carNames = carNames;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custom_spinner_layout, null);
        ImageView icon = (ImageView) view.findViewById(R.id.myImageView);
        TextView names = (TextView) view.findViewById(R.id.textView);
        icon.setImageResource(icons[i]);
        names.setText(carNames[i]);
        return view;
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spinner_layout, null);
        ImageView icon = (ImageView) view.findViewById(R.id.myImageView);
        TextView names = (TextView) view.findViewById(R.id.textView);
        icon.setImageResource(icons[i]);
        names.setText(carNames[i]);
        return view;
    }
}
