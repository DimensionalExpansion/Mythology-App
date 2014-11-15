package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Patrick on 11/15/2014.
 */
public class JanusActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.janus_layout);

        Intent activityThatCalled = getIntent();


    }


    public void backToRoman(View view) {

        Intent getRomanScreenIntent = new Intent(this, RomanScreen.class);

        final int result = 1;

        startActivity(getRomanScreenIntent);

        finish();

    }
}
