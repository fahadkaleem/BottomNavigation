package com.mohammedfahadkaleem.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavigationLightActivity extends AppCompatActivity {
  private BottomNavigationView bottomNavigationBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navigation_light);
    init();
  }

  private void init(){
    bottomNavigationBar = findViewById(R.id.bottom_navigation_light);
    bottomNavigationBar.setOnNavigationItemSelectedListener(new OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
          case R.id.bottom_navigation_recent:
            Toast.makeText(getApplicationContext(),R.string.recents_clicked,Toast.LENGTH_SHORT).show();
            return true;
          case R.id.bottom_navigation_favourites:
            Toast.makeText(getApplicationContext(),R.string.favourites_clicked,Toast.LENGTH_SHORT).show();
            return true;
          case R.id.bottom_navigation_nearby:
            Toast.makeText(getApplicationContext(),R.string.nearby_clicked,Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
      }
    });
  }
}
