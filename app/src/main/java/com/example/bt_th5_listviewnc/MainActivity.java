package com.example.bt_th5_listviewnc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv_fruit;
    ArrayList<Fruit> fruits;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_fruit = (ListView) findViewById(R.id.list_view);
        fruits= new ArrayList<>();
        fruits.add(new Fruit("Dâu tây","description dâu tây",R.drawable.dautay));
        fruits.add(new Fruit("Nho", "description nho",R.drawable.nho));
        fruits.add(new Fruit("Thơm", "description thơm",R.drawable.dua));
        adapter = new Adapter(this,R.layout.activity_item,fruits);
        lv_fruit.setAdapter(adapter);
        lv_fruit.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(MainActivity.this);
                dlgAlert.setMessage("Are you sure you want to delete?");
                dlgAlert.setTitle("Delete fruit");
                dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        fruits.remove(i);
                        adapter.notifyDataSetChanged();
                    }
                });
                adapter.notifyDataSetChanged();
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
                return  true;
            }
        });

    }
}