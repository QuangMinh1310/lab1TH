package com.example.animalsound;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Random;

public class M000ActSplash extends AppCompatActivity {

    // Mảng màu nền (nếu chưa có bg_indigo,... thì thay bằng màu Android sẵn có)
    private final int[] COLORS = {
            android.R.color.holo_blue_light,
            android.R.color.holo_green_light,
            android.R.color.holo_orange_light,
            android.R.color.holo_red_light
    };

    // Mảng icon động vật (đảm bảo các file tồn tại trong /res/drawable)
    private final int[] ICONS = {
            R.drawable.ic_cat,
            R.drawable.ic_dog,
            R.drawable.ic_owl,
            R.drawable.ic_penguin
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);

        View root = findViewById(R.id.splashRoot);
        View loading = findViewById(R.id.loadingRoot);
        ImageView img = findViewById(R.id.imgAnimal);

        Random r = new Random();
        root.setBackgroundColor(ContextCompat.getColor(this, COLORS[r.nextInt(COLORS.length)]));
        img.setImageResource(ICONS[r.nextInt(ICONS.length)]);

        // Giữ overlay loading 1.5s, sau đó ẩn và chuyển màn
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            loading.setVisibility(View.GONE);
            startActivity(new Intent(this, MainActivity.class));
        }, 1500);
    }
}
