package com.example.comedc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(navListener);
    }

    public boolean onCreateOptionsMenu(Menu menu) {       //Include the menu in main activity
        getMenuInflater().inflate(R.menu.option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.myprofile:
                Toast.makeText(getApplicationContext(), "You selected MY PROFILE", Toast.LENGTH_LONG).show();
                Intent i1 = new Intent(MainActivity4.this,MyprofileActivity.class);
                startActivity(i1);
                return true;
            case R.id.ourservices:
                Toast.makeText(getApplicationContext(), "You selected OUR SERVICES", Toast.LENGTH_LONG).show();
                Intent i2 = new Intent(MainActivity4.this,OurservicesActivity.class);
                startActivity(i2);
                return true;
            case R.id.joinus:
                Toast.makeText(getApplicationContext(), "You selected JOIN US", Toast.LENGTH_LONG).show();
                Intent i3 = new Intent(MainActivity4.this,JoinusActivity.class);
                startActivity(i3);
                return true;
            case R.id.facts:
                Toast.makeText(getApplicationContext(), "You selected FACTS", Toast.LENGTH_LONG).show();
                Intent i4 = new Intent(MainActivity4.this,FactsActivity.class);
                startActivity(i4);
                return true;
            case R.id.help:
                Toast.makeText(getApplicationContext(), "You selected HELP", Toast.LENGTH_LONG).show();
                Intent i5 = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(i5);
                return true;
            case R.id.feedback:
                Toast.makeText(getApplicationContext(), "You selected FEEDBACK", Toast.LENGTH_LONG).show();
                Intent i6=new Intent(MainActivity4.this,FeedbackActivity.class);
                startActivity(i6);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            switch(item.getItemId()){
                case R.id.navigation_home:
                    HomeFragment homeFragment=new HomeFragment();
                    Toast.makeText(MainActivity4.this, "Home Fragment opening...", Toast.LENGTH_SHORT).show();
                    fragmentTransaction.replace(R.id.nav_host_fragment,homeFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    DashboardFragment dashboardFragment=new DashboardFragment();
                    Toast.makeText(MainActivity4.this, "Dashboard Fragment opening...", Toast.LENGTH_SHORT).show();
                    fragmentTransaction.replace(R.id.nav_host_fragment,dashboardFragment);
                    fragmentTransaction.commit();
                    return  true;
                case R.id.navigation_notifications:
                    NotificationsFragment notificationsFragment=new NotificationsFragment();
                    Toast.makeText(MainActivity4.this, "Notifications Fragment opening...", Toast.LENGTH_SHORT).show();
                    fragmentTransaction.replace(R.id.nav_host_fragment,notificationsFragment);
                    fragmentTransaction.commit();
                    return true;
            }
            return false;
        }
    };
}