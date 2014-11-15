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

    public void goApollo(View view) {

        Intent getApolloScreenIntent = new Intent(this, ApolloActivity.class);

                final int result = 1;

        startActivity(getApolloScreenIntent);

        finish();

    }

    public void goBacchus(View view) {

        Intent getBacchusScreenIntent = new Intent(this, BacchusActivity.class);

        final int result = 1;

        startActivity(getBacchusScreenIntent);

        finish();
    }

    public void goJanus(View view) {

        Intent getJanusScreenIntent = new Intent(this, JanusActivity.class);

        final int result = 1;

        startActivity(getJanusScreenIntent);

        finish();
    }

    public void goVulcan(View view) {

        Intent getVulcanScreenIntent = new Intent(this, VulcanActivity.class);

        final int result = 1;

        startActivity(getVulcanScreenIntent);

        finish();

    }

    public void goCeres(View view) {

        Intent getCeresScreenIntent = new Intent(this, CeresActivity.class);

        final int result = 1;

        startActivity(getCeresScreenIntent);

        finish();

    }
}
