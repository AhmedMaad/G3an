package com.maad.g3an;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        TextView text = findViewById(R.id.tv);
        ImageView image = findViewById(R.id.iv_android);
        Button x = findViewById(R.id.btn);

        if (counter % 2 == 0) {
            text.setText(R.string.i_am_shab3an);
            image.setImageResource(R.drawable.after_cookie);
            x.setText(R.string.dinner_is_not_ready);
            Toast.makeText(this, R.string.Yummy, Toast.LENGTH_SHORT).show();
            ++counter;
        } else {
            text.setText(R.string.i_am_g3an);
            image.setImageResource(R.drawable.before_cookie);
            x.setText(R.string.dinner_is_ready);
            ++counter;
        }

    }
}
