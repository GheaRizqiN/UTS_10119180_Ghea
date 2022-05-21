package com.example.uts_10119180_ghea.main.profile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import uts_10119180_ghea.R;
import com.example.uts_10119180_ghea.main.daily.DailyActivity;
import com.example.uts_10119180_ghea.main.dashboard.DashboardActivity;
import com.example.uts_10119180_ghea.main.gallery.GalleryActivity;
import com.example.uts_10119180_ghea.main.music.MusicActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//3 May 2022, Ghea Rizqi Nabilla, IF5
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.profileId);

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


    public void linkToProfile(View view){
        Intent intent = new Intent(ProfileActivity.this, DashboardActivity.class);
        startActivity(intent);
    }

    public void linkToContact(View view)
    {
        Intent intent = new Intent(ProfileActivity.this, ContactActivity.class);
        startActivity(intent);
    }

    public void linkToFindme(View view)
    {
        Intent intent = new Intent(ProfileActivity.this, FindmeActivity.class);
        startActivity(intent);
    }

    public void showDialog(View view)
    {
        final Dialog dialog = new Dialog(ProfileActivity.this);

        //Memasang Title / Judul pada Custom Dialog
        dialog.setTitle("Contoh Custom Dialog");

        //Memasang Desain Layout untuk Custom Dialog
        dialog.setContentView(R.layout.custom_design_dialog);

        //Memasang Listener / Aksi saat tombol OK di Klik
        Button DialogButton = dialog.findViewById(R.id.ok);
        DialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


}