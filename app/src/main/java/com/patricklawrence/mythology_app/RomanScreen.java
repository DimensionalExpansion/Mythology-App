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

        startActivity(getMainScreenIntent);

        finish();

    }

    public void goApollo(View view) {

        Intent getApolloScreenIntent = new Intent(this, ApolloActivity.class);

        startActivity(getApolloScreenIntent);

        finish();

    }

    public void goBacchus(View view) {

        Intent getBacchusScreenIntent = new Intent(this, BacchusActivity.class);

        startActivity(getBacchusScreenIntent);

        finish();
    }

    public void goJanus(View view) {

        Intent getJanusScreenIntent = new Intent(this, JanusActivity.class);

        startActivity(getJanusScreenIntent);

        finish();
    }

    public void goVulcan(View view) {

        Intent getVulcanScreenIntent = new Intent(this, VulcanActivity.class);

        startActivity(getVulcanScreenIntent);

        finish();

    }

    public void goCeres(View view) {

        Intent getCeresScreenIntent = new Intent(this, CeresActivity.class);

        startActivity(getCeresScreenIntent);

        finish();

    }

    public void goMercury(View view) {

        Intent getMercuryScreenIntent = new Intent(this, MercuryActivity.class);

        startActivity(getMercuryScreenIntent);

        finish();
    }

    public void goTerra(View view) {

        Intent getTerraScreenIntent = new Intent(this, TerraActivity.class);

        startActivity(getTerraScreenIntent);

        finish();
    }

    public void goDiana(View view) {

        Intent getDianaScreenIntent = new Intent(this, DianaActivity.class);

        startActivity(getDianaScreenIntent);

        finish();
    }

    public void goJupiter(View view) {

        Intent getJupiterScreenIntent = new Intent(this, JupiterActivity.class);

        startActivity(getJupiterScreenIntent);

        finish();
    }
}
