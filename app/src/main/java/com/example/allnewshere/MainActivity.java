package com.example.allnewshere;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);

        //step 1
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.OpenDrawer,
                R.string.CloseDrawer
        );
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        loadFragment(new BBCFragment());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.bbc){

                    loadFragment(new BBCFragment());

                }else if(id == R.id.foxNews){

                    loadFragment(new FoxNewsFragment());

                } else if (id == R.id.alzera){

                    loadFragment(new AlJazeeraFragment());

                }else if (id == R.id.cnn){

                    loadFragment(new CNNFragment());
                }else if (id == R.id.skynews){
                    loadFragment(new SkyNewsFragment());
                }else if (id == R.id.Aajtak){

                    loadFragment(new AajTakFragment());

                }else if (id==R.id.IndiaToday){

                     loadFragment(new IndiaTodayFragment());
                 }else if (id==R.id.NDTV){

               loadFragment(new NDTVFragment());
             }else if (id==R.id.RepublicBharat){

                    loadFragment(new RBFragment());
                }else if (id==R.id.ABP){

                   loadFragment(new ABPFragment());
                }

                // Close the drawer after handling the click
                drawerLayout.closeDrawer(GravityCompat.START);


                return true; // set true
            }
        });
    }

    @Override
    public void onBackPressed(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.container,fragment);
        ft.commit();
    }
}