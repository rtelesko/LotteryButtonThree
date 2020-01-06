package com.example.lotterybuttonthree;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // GUI controls
    private TextView tvText;
    private Button btGenerateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting references to the Button and the TextView
        btGenerateText = findViewById(R.id.btGenerateText);
        tvText = findViewById(R.id.tvText);

        // Setting Listener to Button
        btGenerateText.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btGenerateText:
                tvText.setText("Let's go for some tips!");
        }
    }


}
