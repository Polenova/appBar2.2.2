package ru.android.polenova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SendingMailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_mail);
        final EditText editName = findViewById(R.id.editNameUser);
        final EditText editPassword = findViewById(R.id.editPasswordUser);
        final EditText editMail = findViewById(R.id.editMailUser);
        final TextView result = findViewById(R.id.textResult);
        Button btnClear = (Button) findViewById(R.id.buttonClear);
        Button btnOK = (Button) findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = String.format(getString(R.string.info), editName.getText(), editMail.getText());
                result.setText(info);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName.getText().clear();
                editPassword.getText().clear();
                editMail.getText().clear();
                result.setText(R.string.ClearTxt);
            }
        });
    }
}
