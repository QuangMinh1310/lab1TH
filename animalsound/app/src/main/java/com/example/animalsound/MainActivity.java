package com.example.animalsound;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ví dụ: nút mở lại Splash hoặc mở Profile (nếu bạn có)
        findViewById(R.id.btnOpenSplash).setOnClickListener(
                v -> startActivity(new Intent(this, M000ActSplash.class)));
    }
}
