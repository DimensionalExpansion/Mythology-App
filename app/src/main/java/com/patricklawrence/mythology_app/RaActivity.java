package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Patrick on 11/16/2014.
 */
public class RaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ra_layout);

        Intent activityThatCalled = getIntent();

    }

    public void goBack(View view) {

        Intent getRaScreenIntent = new Intent(this, EgyptianScreen.class);

        startActivity(getRaScreenIntent);

        finish();
    }
}
