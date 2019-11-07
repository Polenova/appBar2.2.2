package ru.android.polenova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MoneyTransferActivity extends AppCompatActivity {

    private EditText inputMoney;
    private EditText infoTransfer;
    private Button buttonOk;
    private CheckBox cardCheckBox;
    private CheckBox phoneCheckBox;
    private CheckBox addressCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_transfer);
        initViews();
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MoneyTransferActivity.this,
                        getString(R.string.text, inputMoney.getText().toString(), infoTransfer.getText().toString()),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void resetCheckBoxes() {
        cardCheckBox.setChecked(false);
        phoneCheckBox.setChecked(false);
        addressCheckBox.setChecked(false);
    }

    private void initViews() {
        inputMoney = findViewById(R.id.editSumm);
        infoTransfer = findViewById(R.id.editInfo);
        buttonOk = findViewById(R.id.btnOK);
        cardCheckBox = findViewById(R.id.checkBoxCard);
        phoneCheckBox = findViewById(R.id.checkBoxPhone);
        addressCheckBox = findViewById(R.id.checkBoxAddress);
        cardCheckBox.setOnCheckedChangeListener(checkedChangeListener);
        phoneCheckBox.setOnCheckedChangeListener(checkedChangeListener);
        addressCheckBox.setOnCheckedChangeListener(checkedChangeListener);
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                switch (compoundButton.getId()) {
                    case R.id.checkBoxCard:
                        resetCheckBoxes();
                        cardCheckBox.setChecked(true);
                        infoTransfer.setInputType(InputType.TYPE_CLASS_NUMBER);
                        break;
                    case R.id.checkBoxPhone:
                        resetCheckBoxes();
                        phoneCheckBox.setChecked(true);
                        infoTransfer.setInputType(InputType.TYPE_CLASS_PHONE);
                        break;
                    case R.id.checkBoxAddress:
                        resetCheckBoxes();
                        addressCheckBox.setChecked(true);
                        infoTransfer.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;
                    default:
                }
            }
        }
    };
}
