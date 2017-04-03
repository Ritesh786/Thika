package com.example.fujitsu.thika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard1Activity extends AppCompatActivity {

    TextView usertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard1);

        usertext = (TextView) findViewById(R.id.userhelloname);

        Bundle bundle = getIntent().getExtras();
        String text= bundle.getString("username");
        usertext.setText("Hello "+text);

    }
}
