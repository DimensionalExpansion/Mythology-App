package com.patricklawrence.mythology_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void goRomanLayout(View view) {

        Intent getRomanScreenIntent = new Intent(this, RomanScreen.class);

        startActivity(getRomanScreenIntent);

        finish();

    }

    public void goGreekLayout(View view) {

        Intent getGreekScreenIntent = new Intent(this, GreekScreen.class);

        startActivity(getGreekScreenIntent);

        finish();
    }

    public void goEgyptianLayout(View view) {

        Intent getEgyptianScreenIntent = new Intent(this, EgyptianScreen.class);

        startActivity(getEgyptianScreenIntent);

        finish();
    }

    public void goNorseLayout(View view) {

        Intent getNorseScreenIntent = new Intent(this, NorseScreen.class);

        startActivity(getNorseScreenIntent);

        finish();
    }
}
