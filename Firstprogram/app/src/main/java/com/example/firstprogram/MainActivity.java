package com.example.firstprogram; // đổi theo project của bạn

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvDice;
    private Button btnRoll;
    private final Random rnd = new Random();

    // Unicode các mặt xúc xắc: 1..6
    private static final char[] DICE = {'\u2680','\u2681','\u2682','\u2683','\u2684','\u2685'};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDice = findViewById(R.id.tvDice);
        btnRoll = findViewById(R.id.btnRoll);

        // bấm nút để tung xúc xắc
        btnRoll.setOnClickListener(v -> rollOnce());

        // cho phép chạm vào mặt xúc xắc để tung lại
        tvDice.setOnClickListener(v -> rollOnce());
    }

    private void rollOnce() {
        int face = rnd.nextInt(6);     // 0..5
        tvDice.setText(String.valueOf(DICE[face]));
    }
}
