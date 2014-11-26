package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Patrick on 11/19/2014.
 */
public class OsirisActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.osiris_layout);

        Intent activityThatCalled = getIntent();
    }

    public void goBack(View view) {

        Intent getOsirisScreenIntent = new Intent(this, EgyptianScreen.class);

        startActivity(getOsirisScreenIntent);

        finish();
    }
}
