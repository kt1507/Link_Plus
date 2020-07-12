package com.example.link_plus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StoreInfoActivitiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_info);

        TextView store_nameTextView = (TextView)findViewById(R.id.store_name);
        TextView phoneTextView = (TextView)findViewById(R.id.phone);
        TextView timeTextView = (TextView)findViewById(R.id.time);
        TextView parkingTextView = (TextView)findViewById(R.id.parking);

        Intent intent = getIntent();

        store_nameTextView.setText((String)intent.getExtras().get("store_name"));
        phoneTextView.setText((String)intent.getExtras().get("phone"));
        timeTextView.setText((String)intent.getExtras().get("time"));
        parkingTextView.setText((String)intent.getExtras().get("parking"));
    }
}
