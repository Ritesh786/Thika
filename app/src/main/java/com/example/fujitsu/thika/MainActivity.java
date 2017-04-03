
package com.example.fujitsu.thika;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText ed1,ed2,ed3;
    Button b1;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Password = "passwordKey";


    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.login_username);
        ed2 = (EditText) findViewById(R.id.login_password);
        b1 = (Button) findViewById(R.id.btnlogin);
        b1.setOnClickListener(this);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    @Override
    public void onClick(View v) {
        String n  = ed1.getText().toString();
        String ph  = ed2.getText().toString();

        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(Name, n);
        editor.putString(Password, ph);
        editor.commit();
        Toast.makeText(MainActivity.this,"Thanks For Login",Toast.LENGTH_LONG).show();

        Intent passintent = new Intent(this, Dashboard1Activity.class);
        Bundle b = new Bundle();

        b.putString("username", n);
        passintent.putExtras(b);
        startActivity(passintent);
    }
}
