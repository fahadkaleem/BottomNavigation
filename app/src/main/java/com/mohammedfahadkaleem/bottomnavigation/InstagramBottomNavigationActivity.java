package com.mohammedfahadkaleem.bottomnavigation;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.v7.app.AppCompatActivity;

public class InstagramBottomNavigationActivity extends AppCompatActivity {

  private TabLayout tabLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_instagram_bottom_navigation);
    init();
  }

  private void init() {
    tabLayout = findViewById(R.id.bottom_navigation_instagram);

    // Adding tabs to the tab layout and setting icon
    tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_home), 0);
    tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_search), 1);
    tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_upload), 2);
    tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_favorite), 3);
    tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_person), 4);

    tabLayout.getTabAt(0).getIcon()
        .setColorFilter(getResources().getColor(R.color.black), Mode.SRC_IN);
    tabLayout.getTabAt(1).getIcon()
        .setColorFilter(getResources().getColor(R.color.lightGrey), Mode.SRC_IN);
    tabLayout.getTabAt(2).getIcon()
        .setColorFilter(getResources().getColor(R.color.lightGrey), Mode.SRC_IN);
    tabLayout.getTabAt(3).getIcon()
        .setColorFilter(getResources().getColor(R.color.lightGrey), Mode.SRC_IN);
    tabLayout.getTabAt(4).getIcon()
        .setColorFilter(getResources().getColor(R.color.lightGrey), Mode.SRC_IN);

    tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
      @Override
      public void onTabSelected(Tab tab) {
        tab.getIcon().setColorFilter(getResources().getColor(R.color.black), Mode.SRC_IN);
      }

      @Override
      public void onTabUnselected(Tab tab) {
        tab.getIcon().setColorFilter(getResources().getColor(R.color.lightGrey), Mode.SRC_IN);
      }

      @Override
      public void onTabReselected(Tab tab) {

      }
    });
  }
}
