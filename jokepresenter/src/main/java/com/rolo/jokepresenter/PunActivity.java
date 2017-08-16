package com.rolo.jokepresenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PunActivity extends AppCompatActivity {
    public static final String PUN_EXTRA = "pun_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pun);
        TextView pun = (TextView) findViewById(R.id.pun);
        Intent intent = getIntent();
        if(intent != null) {
            String punText = intent.getStringExtra(PUN_EXTRA);
            pun.setText(punText);
        } else {
            pun.setText(getResources().getString(R.string.no_pun));
        }
    }
}
