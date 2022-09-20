package com.example.bt_th5_listviewnc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private  List<Fruit> fruits;

    public Adapter(Context context, int layout, List<Fruit> fruits) {
        this.context = context;
        this.layout = layout;
        this.fruits = fruits;
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int i) {  return null; }

    @Override
    public long getItemId(int i) { return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.activity_item,null);
        TextView title = (TextView) view.findViewById(R.id.title);
        TextView description = (TextView) view.findViewById(R.id.description);
        ImageView image = (ImageView)  view.findViewById(R.id.image);

        Fruit fruit = fruits.get(i);
        title.setText(fruit.getTitle());
        description.setText(fruit.getDescription());
        image.setImageResource(fruit.getImag());
        return  view;
    }
}