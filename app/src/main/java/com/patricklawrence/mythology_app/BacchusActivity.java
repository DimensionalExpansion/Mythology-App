package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Patrick on 11/14/2014.
 */
public class BacchusActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.bacchus_layout);

        Intent activityThatCalled = getIntent();

    }

    public void backToRoman(View view) {


        Intent getRomanScreenIntent = new Intent(this, RomanScreen.class);

        final int result = 1;

        startActivity(getRomanScreenIntent);

        finish();


    }
}
