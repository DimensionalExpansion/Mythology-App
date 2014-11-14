package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Patrick on 11/13/2014.
 */
public class RomanScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.roman_layout);

        Intent activityThatCalled = getIntent();


    }

    public void goBack(View view) {


        Intent getMainScreenIntent = new Intent(this, MainActivity.class);

        final int result = 1;

        startActivity(getMainScreenIntent);

        finish();



    }
}
