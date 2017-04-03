
package com.example.fujitsu.thika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread mythread = new Thread(){
            public void run()
            {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        mythread.start();
    }

}

