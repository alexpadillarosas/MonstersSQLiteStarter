package com.blueradix.android.monsterssqlite;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * TODO 1: Create AddMonsterScrollingActivity and Replicate the layout
         */

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                /**
                 * TODO 2: replace the Snackbar with a method called addNewMonster().
                 *       Inside the method open AddMonsterScrollingActivity, where you'll fill up your new monster's details
                 *       Make this Activity (MainActivity) wait for the return of the newly created monster
                 */
            }


        });

        /**
         * TODO 3:  Replicate the layout of the Main Activity (activity_main) notice that it's contents are in a sub file called content_main.xml
         *          Declare all buttons in this class and make them work.
         *          Create a method for each button: viewAll, delete, clear, update
         *          Call the DataService in each method to:
         *              retrieve all monsters in the database (viewAll)
         *              delete a monster in the database (delete)
         *              clear the id input by the user (clear)
         */

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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
