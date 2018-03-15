package com.mohammedfahadkaleem.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavigationShiftingActivity extends AppCompatActivity {
  private BottomNavigationView shiftinNavigationView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_navigation_shifting);
    init();
  }

  private void init(){
    shiftinNavigationView = findViewById(R.id.bottom_navigation_shifting);
    shiftinNavigationView.setOnNavigationItemSelectedListener(new OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
          case R.id.navigation_movie:
            Toast.makeText(getApplicationContext(),R.string.movie_amp_tv_clicked,Toast.LENGTH_SHORT).show();
            shiftinNavigationView.setBackgroundColor(getResources().getColor(R.color.blueGrey));
            return true;
          case R.id.navigation_music:
            Toast.makeText(getApplicationContext(),R.string.music_clicked,Toast.LENGTH_SHORT).show();
            shiftinNavigationView.setBackgroundColor(getResources().getColor(R.color.pink_700));
            return true;
          case R.id.navigation_books:
            Toast.makeText(getApplicationContext(),R.string.books_clicked,Toast.LENGTH_SHORT).show();
            shiftinNavigationView.setBackgroundColor(getResources().getColor(R.color.indigo_700));
            return true;
          case R.id.navigation_newsstand:
            Toast.makeText(getApplicationContext(),R.string.newsstand_clicked,Toast.LENGTH_SHORT).show();
            shiftinNavigationView.setBackgroundColor(getResources().getColor(R.color.light_green_700));
            return true;
        }
        return false;
      }
    });
  }
}
