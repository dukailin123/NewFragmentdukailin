package com.baiwei.dukailin;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.baiwei.dukailin.com.baiwei.Fragment.Fragment;
import com.baiwei.dukailin.com.baiwei.Fragment.Fragment1;
import com.baiwei.dukailin.com.baiwei.Fragment.Fragment3;
import com.baiwei.dukailin.com.baiwei.Fragment.Fragment4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private FrameLayout fl;
    private TextView zhu;
    private TextView pai;
    private TextView fen;
    private TextView my;
private List<android.support.v4.app.Fragment> Fragments=new ArrayList<>();
    private FragmentManager manager;
    private Fragment f1;
    private Fragment1 f2;
    private Fragment3 f3;
    private Fragment4 f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl = (FrameLayout) findViewById(R.id.fl);
        zhu = (TextView) findViewById(R.id.zhu);
        pai = (TextView) findViewById(R.id.pai);
        fen = (TextView) findViewById(R.id.fen);
        my = (TextView) findViewById(R.id.my);
        f1 = new Fragment();
        f2 = new Fragment1();
        f3 = new Fragment3();
        f4 = new Fragment4();

        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl, f1);
        transaction.add(R.id.fl, f2);
        transaction.add(R.id.fl, f3);
        transaction.add(R.id.fl, f4);


        zhu.setOnClickListener(this);
        pai.setOnClickListener(this);
        fen.setOnClickListener(this);
        my.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.zhu:
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.show(f1).hide(f2).hide(f3).hide(f4).commit();
                zhu.setTextColor(Color.RED);
                fen.setTextColor(Color.BLACK);
                pai.setTextColor(Color.BLACK);
                my.setTextColor(Color.BLACK);

                break;
            case R.id.pai:
                FragmentTransaction transaction1 = manager.beginTransaction();
                transaction1.show(f2).hide(f1).hide(f3).hide(f4).commit();
                zhu.setTextColor(Color.BLACK);
                fen.setTextColor(Color.BLACK);
                pai.setTextColor(Color.RED);
                my.setTextColor(Color.BLACK);

                break;
            case R.id.fen:
                FragmentTransaction transaction2 = manager.beginTransaction();
                transaction2.show(f3).hide(f2).hide(f1).hide(f4).commit();
                zhu.setTextColor(Color.BLACK);
                fen.setTextColor(Color.RED);
                pai.setTextColor(Color.BLACK);
                my.setTextColor(Color.BLACK);

                break;
            case R.id.my:
                FragmentTransaction transaction3 = manager.beginTransaction();
                transaction3.show(f4).hide(f2).hide(f3).hide(f1).commit();
                zhu.setTextColor(Color.BLACK);
                fen.setTextColor(Color.BLACK);
                pai.setTextColor(Color.BLACK);
                my.setTextColor(Color.RED);
                break;
        }

    }
}
