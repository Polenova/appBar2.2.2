package ru.android.polenova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InfoUserHealthActivity extends AppCompatActivity {

    private static String TAG = "возраст ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_user_health);
        final EditText nameEdit = findViewById(R.id.editName);
        final EditText fatherNameEdit = findViewById(R.id.editFName);
        final EditText surnameEdit = findViewById(R.id.editSurname);
        final EditText ageEdit = findViewById(R.id.editAge);
        Button saveUser = (Button) findViewById(R.id.buttonSave);
        Button press = (Button) findViewById(R.id.buttonPress);
        Button health = (Button) findViewById(R.id.buttonHealth);
        saveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEdit.getText().toString();
                String fatherName = fatherNameEdit.getText().toString();
                String surname = surnameEdit.getText().toString();
                TextView result = (TextView) findViewById(R.id.textResult);
                try {
                    int age = Integer.parseInt(ageEdit.getText().toString());
                    UserInfo user = new UserInfo(name, fatherName, surname, age);
                    result.setText(user.toString());
                } catch (Exception e) {
                    Toast.makeText(InfoUserHealthActivity.this, getString(R.string.exception), Toast.LENGTH_LONG).show();
                    Log.d(TAG, getString(R.string.exc));
                }

            }
        });
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOnPress = new Intent(InfoUserHealthActivity.this, UserPressActivity.class);
                startActivity(intentOnPress);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOnHealth = new Intent(InfoUserHealthActivity.this, UserHealthActivity.class);
                startActivity(intentOnHealth);
            }
        });
    }
}
