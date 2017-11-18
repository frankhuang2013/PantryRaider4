package com.example.stevetran.pantryraider.Util;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.stevetran.pantryraider.Home.HomeActivity;
import com.example.stevetran.pantryraider.Pantry.PantryActivity;
import com.example.stevetran.pantryraider.R;
import com.example.stevetran.pantryraider.Search.SearchActivity;
import com.example.stevetran.pantryraider.Setting.SettingActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by Abel on 11/14/2017.
 * Customize bottom Navbar here. Check <url> https://github.com/ittianyu/BottomNavigationViewEx </url>
 */

public class BottomNavigationHelper {

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_search:
                        Intent intent2  = new Intent(context, SearchActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_pantry:
                        Intent intent3 = new Intent(context, PantryActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_setting:
                        Intent intent4 = new Intent(context, SettingActivity.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
                        break;
                }


                return false;
            }
        });
    }
}