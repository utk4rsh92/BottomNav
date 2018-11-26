package com.dl.bottomnav;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.navigation);

// Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.home, R.drawable.ic_dashboard_black_24dp, R.color.black);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.about, R.drawable.ic_home_black_24dp, R.color.blue);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.servces, R.drawable.ic_notifications_black_24dp, R.color.black);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.product, R.drawable.ic_action_products, R.color.blue);
        AHBottomNavigationItem item5 = new AHBottomNavigationItem(R.string.logins, R.drawable.ic_action_login, R.color.black);
        AHBottomNavigationItem item6 = new AHBottomNavigationItem(R.string.registration, R.drawable.ic_home_black_24dp, R.color.blue);
// Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
        bottomNavigation.addItem(item5);
      //  bottomNavigation.addItem(item6);
       // mTextMessage.setText(item1.

      //  bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

// Disable the translation inside the CoordinatorLayout
        bottomNavigation.setBehaviorTranslationEnabled(false);

// Enable the translation of the FloatingActionButton
      //  bottomNavigation.manageFloatingActionButtonBehavior(floatingActionButton);

// Change colors
        bottomNavigation.setAccentColor(Color.parseColor("#F63D2B"));
        bottomNavigation.setInactiveColor(Color.parseColor("#747474"));

// Force to tint the drawable (useful for font with icon for example)
        bottomNavigation.setForceTint(true);

// Display color under navigation bar (API 21+)
// Don't forget these lines in your style-v21
// <item name="android:windowTranslucentNavigation">true</item>
// <item name="android:fitsSystemWindows">true</item>
    //    bottomNavigation.setTranslucentNavigationEnabled(true);

// Manage titles


// Use colored navigation with circle reveal effect
        bottomNavigation.setColored(true);
    }

}
