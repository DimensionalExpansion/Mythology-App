package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Patrick on 11/15/2014.
 */
public class DianaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.diana_layout);

        Intent activityThatCalled = getIntent();

    }

    public void goBack(View view) {

        Intent getRomanScreenIntent = new Intent(this, RomanScreen.class);

        startActivity(getRomanScreenIntent);

        finish();


    }
}
