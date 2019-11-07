package ru.android.polenova;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu, this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, getString(R.string.title_settings), Toast.LENGTH_LONG).show();
            return false;
        } else if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, getString(R.string.toast_txt), Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        } else if (id == R.id.action_open_calendar) {
            Toast.makeText(MainActivity.this, getString(R.string.title_calendar), Toast.LENGTH_LONG).show();
            Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentCalendar);
            return true;
        } else if (id == R.id.action_open_address) {
            Toast.makeText(MainActivity.this, getString(R.string.title_address), Toast.LENGTH_LONG).show();
            Intent intentAddress = new Intent(MainActivity.this, AddressActivity.class);
            startActivity(intentAddress);
            return true;
        } else if (id == R.id.action_open_transfer_money) {
            Toast.makeText(MainActivity.this, getString(R.string.title_transfer_money), Toast.LENGTH_LONG).show();
            Intent intentMoneyTransfer = new Intent(MainActivity.this, MoneyTransferActivity.class);
            startActivity(intentMoneyTransfer);
            return true;
        } else if (id == R.id.action_open_program_health) {
            Toast.makeText(MainActivity.this, getString(R.string.title_program_health), Toast.LENGTH_LONG).show();
            Intent intentProgramHealth = new Intent(MainActivity.this, InfoUserHealthActivity.class);
            startActivity(intentProgramHealth);
            return true;
        } else if (id == R.id.action_open_random_image) {
            Toast.makeText(MainActivity.this, getString(R.string.title_random_image), Toast.LENGTH_LONG).show();
            Intent intentRandomImage = new Intent(MainActivity.this, RandomImageActivity.class);
            startActivity(intentRandomImage);
            return true;
        } else if (id == R.id.action_open_send_mail) {
            Toast.makeText(MainActivity.this, getString(R.string.title_send_mail), Toast.LENGTH_LONG).show();
            Intent intentSendMail = new Intent(MainActivity.this, SendingMailActivity.class);
            startActivity(intentSendMail);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
