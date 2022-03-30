package com.smktelkom.myrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView spalsh = findViewById(R.id.splash);

        new Handler().postDelayed(() -> {
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(SplashActivity.this, spalsh, Objects.requireNonNull(ViewCompat.getTransitionName(spalsh)));
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent, options.toBundle());
        }, 500);
    }
}