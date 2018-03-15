package com.mohammedfahadkaleem.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button lightNavigation;
  Button darkNavigation;
  Button shiftingNavigation;
  Button instagramNavigation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    lightNavigation = findViewById(R.id.btn_light_bottom_navigation);
    lightNavigation.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,BottomNavigationLightActivity.class);
        startActivity(intent);
      }
    });
    darkNavigation = findViewById(R.id.btn_dark_bottom_navigation);
    darkNavigation.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,BottomNavigationDarkActivity.class);
        startActivity(intent);
      }
    });
    shiftingNavigation = findViewById(R.id.btn_shifting_bottom_navigation);
    shiftingNavigation.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,BottomNavigationShiftingActivity.class);
        startActivity(intent);
      }
    });
    instagramNavigation = findViewById(R.id.btn_instagram_bottom_navigation);
    instagramNavigation.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, InstagramBottomNavigationActivity.class);
        startActivity(intent);
      }
    });
  }
}
