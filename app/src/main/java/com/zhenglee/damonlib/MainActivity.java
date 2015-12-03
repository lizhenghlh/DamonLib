package com.zhenglee.damonlib;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import tk.zhenglee.framework.res.annotation.IdResource;
import tk.zhenglee.framework.res.annotation.LayoutResource;
import tk.zhenglee.framework.res.annotation.MenuResource;
import tk.zhenglee.ui.BaseActivity;

@MenuResource(R.menu.menu_main)
@LayoutResource(R.layout.activity_main)
public class MainActivity extends BaseActivity {

//    @IdResource(R.id.hello)
    private Button btn;

    @IdResource(R.id.recycler_view)
    private RecyclerView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toasts.show(MainActivity.this, "this is click test!");
//                startActivity(new Intent(MainActivity.this,DrawerActivity.class));
//
//            }
//        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listview.setLayoutManager(linearLayoutManager);
        ArrayList<String> value = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            value.add(String.valueOf(i));
        }
        final MyAdapter adapter = new MyAdapter(value);
        listview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.notifyDataSetChanged();
            }
        });
        listview.setI

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
