package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

////    private static Button btn;
////    private static TextClock text;
////
////    public void onButtonClickListener() {
////        Button btn = (Button) findViewById(R.id.button);
////        text = (TextClock)findViewById(R.id.textClock);
////
////        btn.setOnClickListener(
////                new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        if(text.getVisibility() == TextClock.GONE) {
////                            text.setVisibility(TextClock.VISIBLE);
////                        } else {
////                            text.setVisibility(TextClock.GONE);
////                        }
////                    }
////                }
////        );
//    }

    private TextClock tClock;
//    private TextView tView;
//    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tClock = (TextClock) findViewById(R.id.textClock1);
//        tView = (TextView) findViewById(R.id.textview1);
//        btn = (Button)findViewById(R.id.btnGet);
    }

    public void handleSiswa(View view) {
        Intent intent =  new Intent(this, SiswaActivity.class);
        startActivity(intent);
    }
}
