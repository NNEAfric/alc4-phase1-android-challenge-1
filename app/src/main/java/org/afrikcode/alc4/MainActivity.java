package org.afrikcode.alc4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ALC 4 Phase 1");
    }

    public void goToProfile(View view) {
        Intent profileIntent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(profileIntent);
    }

    public void goToALC(View view) {
        Intent alcIntent = new Intent(MainActivity.this, ALC.class);
        startActivity(alcIntent);
    }
}
