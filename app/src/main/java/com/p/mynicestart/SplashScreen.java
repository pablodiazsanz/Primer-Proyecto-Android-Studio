package com.p.mynicestart;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;


public class SplashScreen extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        ImageView imageView = (ImageView) findViewById(R.id.imageView4) ;
      //  TextView mySubtitle = (TextView) findViewById(R.id.txt_Subtitle);
      //  Typeface face = Typeface.createFromAsset(getAssets(),
      //          "fonts/epimodem.ttf");
      //  mySubtitle.setTypeface(face);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        imageView.startAnimation(myanim);

        ImageView fondo = findViewById(R.id.imageView3);
        Glide.with(this)
                .load(R.drawable.tenis_fondo)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(500))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.light_purple_button)))
                .into(fondo);

        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}
