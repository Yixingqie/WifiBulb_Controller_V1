package com.example.yixing.wifilight;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button on;
    Button off;
    ImageView lightBulb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        on = ((Button)findViewById(R.id.on));
        off = ((Button)findViewById(R.id.off));
        lightBulb = ((ImageView) findViewById(R.id.lightBulb));

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                //myWebLink.setData(Uri.parse("192.168.1.14/?pin=ON1"));
             //   startActivity(myWebLink);
                lightBulb.setImageResource(R.drawable.bulb_on);

            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                //myWebLink.setData(Uri.parse("192.168.1.14/?pin=OFF1"));
                //startActivity(myWebLink);

                lightBulb.setImageResource(R.drawable.light_off);
            }
        });
    }
}
