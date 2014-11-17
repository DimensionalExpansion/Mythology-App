package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Patrick on 11/16/2014.
 */
public class EgyptianScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.egyptian_layout);

        Intent activityThatCalled = getIntent();


    }

    public void goBack(View view) {

        Intent getMainScreenIntent = new Intent(this, MainActivity.class);

        startActivity(getMainScreenIntent);

        finish();

    }

    public void goRa(View view) {

        Intent getRaScreenIntent = new Intent(this, RaActivity.class);

        startActivity(getRaScreenIntent);

        finish();
    }

    public void goAnubis(View view) {

        Intent getAnubisScreenIntent = new Intent(this, AnubisActivity.class);

        startActivity(getAnubisScreenIntent);

        finish();
    }

    public void goIsis(View view) {

        Intent getIsisScreenIntent = new Intent(this, IsisActivity.class);

        startActivity(getIsisScreenIntent);

        finish();
    }

    public void goSet(View view) {

        Intent getSetScreenIntent = new Intent(this, SetActivity.class);

        startActivity(getSetScreenIntent);

        finish();
    }

    public void goThoth(View view) {

        Intent getThothScreenIntent = new Intent(this, ThothActivity.class);

        startActivity(getThothScreenIntent);

        finish();
    }
}
