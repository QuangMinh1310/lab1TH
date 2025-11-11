package com.example.animalsound;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M001ActProfile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_profile);

        ImageView icPhone = findViewById(R.id.icPhone);
        TextView tvPhone = findViewById(R.id.tvPhone);

        icPhone.setOnClickListener(v -> {
            // Lấy số từ TextView
            String phone = tvPhone.getText().toString();
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:" + phone));
            startActivity(callIntent);
        });
    }
}
