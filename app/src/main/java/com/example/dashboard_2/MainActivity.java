package com.example.dashboard_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    RecyclerView recyclerView;
    List<item> mData;
    MenuAdapter adapter;

    //fragment codes
    public static final int DASHBOARD_CODE = 0;
    public static final int SEARCH_CODE = 0;
    public static final int HOME_CODE = 0;
    public static final int SETTINGS_CODE = 0;
    public static final int LOG_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mData = new ArrayList<>();
        mData.add(new item(R.drawable.ic_baseline_dashboard_24, DASHBOARD_CODE, "Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_baseline_search_24, SEARCH_CODE, "Search Fragment"));
        mData.add(new item(R.drawable.ic_baseline_home_24, HOME_CODE, "Home Fragment"));
        mData.add(new item(R.drawable.ic_baseline_settings_24, SETTINGS_CODE, "Settings Fragment"));
        mData.add(new item(R.drawable.ic_baseline_log, LOG_CODE, "Log Fragment"));
        mData.add(new item(R.drawable.ic_baseline_dashboard_24, DASHBOARD_CODE, "Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_baseline_search_24, SEARCH_CODE, "Search Fragment"));
        mData.add(new item(R.drawable.ic_baseline_home_24, HOME_CODE, "Home Fragment"));
        mData.add(new item(R.drawable.ic_baseline_settings_24, SETTINGS_CODE, "Settings Fragment"));
        mData.add(new item(R.drawable.ic_baseline_log, LOG_CODE, "Log Fragment"));
        mData.add(new item(R.drawable.ic_baseline_dashboard_24, DASHBOARD_CODE, "Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_baseline_search_24, SEARCH_CODE, "Search Fragment"));
        mData.add(new item(R.drawable.ic_baseline_home_24, HOME_CODE, "Home Fragment"));
        mData.add(new item(R.drawable.ic_baseline_settings_24, SETTINGS_CODE, "Settings Fragment"));
        mData.add(new item(R.drawable.ic_baseline_log, LOG_CODE, "Log Fragment"));

        adapter = new MenuAdapter(this, mData);
        recyclerView.setAdapter(adapter);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        //dashboard instantiate
        DashboardFrag dashboardFrag = new DashboardFrag();

        fragmentTransaction.replace(R.id.container, dashboardFrag);
        fragmentTransaction.commit();
    }
}