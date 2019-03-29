package com.example.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Read the value passed from previous activity(LoginActivity)
        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null) //verify
        {
            if(mBundle.containsKey("name")) //verify
            {
                String name = mBundle.getString("name");  //Fetch from bundle
                Toast.makeText(this, name, Toast.LENGTH_LONG).show();
            }
        }
    }
}
