package ru.android.polenova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserPressActivity extends AppCompatActivity {

    private static String TAG = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_press);
        final EditText editHPr = (EditText) findViewById(R.id.editHPress);
        final EditText editLPr = (EditText) findViewById(R.id.editLPress);
        final EditText editPulse = (EditText) findViewById(R.id.editPulse);
        final EditText editDate = (EditText) findViewById(R.id.editDate);
        final CheckBox tahCheck = (CheckBox) findViewById(R.id.checkTah);
        final TextView result = (TextView) findViewById(R.id.textUsrPr);
        Button savePress = (Button) findViewById(R.id.buttonSavePress);
        savePress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = editDate.getText().toString();
                boolean tah = tahCheck.isChecked();
                try {
                    int hPress = Integer.parseInt(editHPr.getText().toString());
                    int lPress = Integer.parseInt(editLPr.getText().toString());
                    int pulse = Integer.parseInt(editPulse.getText().toString());
                    UserPress userPress = new UserPress(hPress, lPress, pulse, date, tah);
                    result.setText(userPress.toString());
                } catch (Exception e) {
                    Toast.makeText(UserPressActivity.this, getString(R.string.exception), Toast.LENGTH_LONG).show();
                    Log.d(TAG, getString(R.string.exc));
                }
            }
        });
    }
}



