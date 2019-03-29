package com.example.vrushabh.myapplication;


import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    android.support.v7.widget.Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Drawer layout to control navigation view
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        mToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorAccent));
        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

    }

       // Option menu
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.New:
                    Toast.makeText(MainActivity.this,"Click on New tab",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.New_inco:
                    Toast.makeText(MainActivity.this,"Click on New incognito tab",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.Book:
                    Toast.makeText(MainActivity.this,"Click on Bookmarks",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.Resent:
                    Toast.makeText(MainActivity.this,"Click on Resent tab",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.History:
                    Toast.makeText(MainActivity.this,"Click on History",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.Download:
                    Toast.makeText(MainActivity.this,"Click on Download",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.Setting:
                    Toast.makeText(MainActivity.this,"Click on Setting",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.Help:
                    Toast.makeText(MainActivity.this,"Click on Help and Feedback",Toast.LENGTH_SHORT).show();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }


        }


        //Back command for Navigation Activity
        @Override
        public void onBackPressed() {
            DrawerLayout drawer = findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();

            }
        }


}
