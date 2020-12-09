package com.p.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * En esta pantalla ya se ha iniciado sesión con el usuario y permite ir a la segunda pantalla
 * @author pablo
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView fondo = findViewById(R.id.imageView2);
        Glide.with(this)
                .load(R.drawable.skier)
                .centerCrop()
                .circleCrop()
                .into(fondo);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity
                        .this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}