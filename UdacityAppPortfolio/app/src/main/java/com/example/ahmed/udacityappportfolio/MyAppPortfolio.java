/**
 * TODO
 * Figure out how to edit action bar (title bar?) design.
 */
package com.example.ahmed.udacityappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyAppPortfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(View view){


        switch (view.getId())
        {
            case R.id.spotifyButton:
                produceToast("This button will launch my Spotify Streamer App!");
                return;
            case R.id.scoresButton:
                produceToast("This button will launch my Scores App!");
                return;
            case R.id.libraryButton:
                produceToast("This button will launch my Library App!");
                return;
            case R.id.buildItBiggerButton:
                produceToast("This button will launch my Build it Bigger App!");
                return;
            case R.id.xyzButton:
                produceToast("This button will launch my XYZ Reader App!");
                return;
            case R.id.myButton:
                produceToast("This button will launch my Capstone App!");
                return;
        }
    }
    public void produceToast(CharSequence text)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
