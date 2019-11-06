package ru.android.polenova;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){

            int id = item.getItemId();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);

            if (id == R.id.action_open_notes) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_txt), Toast.LENGTH_LONG).show();
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
}
