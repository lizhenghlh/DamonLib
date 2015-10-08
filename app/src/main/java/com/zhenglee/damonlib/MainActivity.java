package com.zhenglee.damonlib;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import tk.zhenglee.comzhengleeframework.res.annotation.IdResource;
import tk.zhenglee.comzhengleeframework.res.annotation.LayoutResource;
import tk.zhenglee.comzhengleeframework.res.annotation.MenuResource;
import tk.zhenglee.comzhengleeframeworkui.BaseActivity;

@MenuResource(R.menu.menu_main)
@LayoutResource(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @IdResource(R.id.hello)
    private TextView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "this is click test!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
