package com.example.uts_10119180_ghea.main.daily;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import uts_10119180_ghea.R;
import com.example.uts_10119180_ghea.main.daily.adapter.UsersAdapter;
import com.example.uts_10119180_ghea.main.daily.model.User;
import com.example.uts_10119180_ghea.main.dashboard.DashboardActivity;
import com.example.uts_10119180_ghea.main.gallery.GalleryActivity;
import com.example.uts_10119180_ghea.main.music.MusicActivity;
import com.example.uts_10119180_ghea.main.profile.ProfileActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

//3 May 2022, Ghea Rizqi Nabilla, IF5
public class DailyActivity extends AppCompatActivity {
    private RecyclerView usersList;
    private UsersAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        usersList = findViewById(R.id.usersList);
        userAdapter = new UsersAdapter();
        usersList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        usersList.setHasFixedSize(true);
        usersList.setAdapter(userAdapter);


        userAdapter.addUser(new User("A", "Rika Nur Adila"));
        userAdapter.addUser(new User("B", "Yolanda Patricia"));
        userAdapter.addUser(new User("C", "Reza Kurnia"));
        userAdapter.addUser(new User("D", "M. Iqbal Rosyidin"));
        userAdapter.addUser(new User("E", "Albee Akbar Fillah"));
        userAdapter.addUser(new User("F", "Kiki Mulyadi"));
        userAdapter.addUser(new User("G", "Firaga Pratama"));

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.dailyId);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dailyId:
                        startActivity(new Intent(getApplicationContext(), DailyActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.homeId:
                        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.galleryId:
                        startActivity(new Intent(getApplicationContext(), GalleryActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.musicId:
                        startActivity(new Intent(getApplicationContext(), MusicActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.profileId:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }


}